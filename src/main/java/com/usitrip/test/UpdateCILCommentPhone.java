package com.usitrip.test;

import com.usitrip.dao.ChineseinlaCommentMapper;
import com.usitrip.dao.ChineseinlaForumMapper;
import com.usitrip.dao.ChineseinlaSCMapper;
import com.usitrip.dao.ChineseinlaSFMapper;
import com.usitrip.pojo.ChineseinlaComment;
import com.usitrip.pojo.ChineseinlaForum;
import com.usitrip.pojo.ChineseinlaSC;
import com.usitrip.pojo.ChineseinlaSF;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateCILCommentPhone {

    @Test
    public void test1() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        ChineseinlaCommentMapper chineseinlaCommentMapper = sqlSession.getMapper(ChineseinlaCommentMapper.class);
        List<ChineseinlaComment> chineseinlaComments = chineseinlaCommentMapper.selectPhoneByLen(12);

        List<ChineseinlaSC> list = new ArrayList<ChineseinlaSC>();
        Pattern compile = Pattern.compile("\\b[\\d]{3}\\s?[\\d]{3}\\s?[\\d]{4}\\b");
        for (ChineseinlaComment chineseinlaComment : chineseinlaComments) {
            String category = chineseinlaComment.getCategory();
            String phoneStr = chineseinlaComment.getPhone();
            Matcher matcher = compile.matcher(phoneStr);
            while (matcher.find()) {
                list.add(new ChineseinlaSC(category, matcher.group().replaceAll("\\s", "").trim()));
            }
        }

        System.out.println(list.size());
        ChineseinlaSCMapper chineseinlaSCMapper = sqlSession.getMapper(ChineseinlaSCMapper.class);
        chineseinlaSCMapper.insertNewContact(list);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() {
        String str = "白人区超大别墅区，新装修丶地大八千尺，步行2分钟到大型超市丶星巴克，药店丶餐馆，可带部分家具丶木地板，大院子，室内有软水器丶保险箱丶监控系统丶烟雾报警器丶一氧化碳报警器一应俱全近71，60，15交通便利,宁静社区WEchat:weclomefriends 隐密安全,前后大院子，离CalPoly /Mt.Sac/LaVerne/ Cal Fullerton ，Costco, WalMart,大华超市15分钟电话：6266249471 微信:weclomefriends sa123";
//        String str2  = "abc123";
//        Pattern compile = Pattern.compile("\\b[\\d]{3}\\s?[\\d]{3}\\s?[\\d]{4}\\b");
        Pattern compile = Pattern.compile("(wechat|微信)[:|：]?[0-9a-zZ-Z]{5,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    @Test
    public void test3() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        ChineseinlaForumMapper chineseinlaForumMapper = sqlSession.getMapper(ChineseinlaForumMapper.class);

        List<ChineseinlaForum> chineseinlaForums = chineseinlaForumMapper.selectAllForum();
        System.out.println("TOTAL: " + chineseinlaForums.size());

        List<ChineseinlaSF> phoneList = new ArrayList<>();
        List<ChineseinlaSF> emailList = new ArrayList<>();
        List<ChineseinlaSF> wechatList = new ArrayList<>();

        Pattern phoneCompile = Pattern.compile("[(（]?[1]?[\\d]{3}[\\s)）-]*[\\d]{3}[\\s-]*[\\d]{4}");
        Pattern wechatCompile = Pattern.compile("(wechat|微信)[:|：]?[0-9a-zZ-Z-_]{5,}", Pattern.CASE_INSENSITIVE);
        Pattern emailCompile = Pattern.compile("[A-Za-z0-9_%+-][A-Za-z0-9._%+-]*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}");

        for (ChineseinlaForum chineseinlaForum : chineseinlaForums) {
            String category = chineseinlaForum.getCategory();
            String content = chineseinlaForum.getContent();

            Matcher phoneMatcher = phoneCompile.matcher(content);
            Matcher wechatMatcher = wechatCompile.matcher(content);
            Matcher emailMatcher = emailCompile.matcher(content);

            while (phoneMatcher.find()) {
                ChineseinlaSF csf = new ChineseinlaSF();
                csf.setCategory(category);
                csf.setPhone(phoneMatcher.group().replaceAll("[()（）\\s-]+","").trim());

                phoneList.add(csf);
            }

            while (wechatMatcher.find()) {
                ChineseinlaSF csf = new ChineseinlaSF();
                csf.setCategory(category);
                String wechatStr = wechatMatcher.group();
                if (wechatStr.endsWith("--")) {
                    wechatStr = wechatStr.replaceAll("[-]{2,}", "");
                }
                csf.setWechat(wechatStr.replaceAll("(?i)微信[:：]?|wechat[:：]?","").trim());

                wechatList.add(csf);
            }

            while (emailMatcher.find()) {
                ChineseinlaSF csf = new ChineseinlaSF();
                csf.setCategory(category);
                csf.setEmail(emailMatcher.group().trim());

                emailList.add(csf);
            }

        }

//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\vivian.xia\\Desktop\\采集的数据\\contact_info\\result3.txt"));
//        for (ChineseinlaSF chineseinlaSF : phoneList) {
//            bw.write(chineseinlaSF.getCategory() + ": " + chineseinlaSF.getPhone());
//            bw.newLine();
//        }
//        bw.close();
        System.out.println("phones: " + phoneList.size());
        System.out.println("wechats: " + wechatList.size());
        System.out.println("emails: " + emailList.size());

        ChineseinlaSFMapper chineseinlaSFMapper = sqlSession.getMapper(ChineseinlaSFMapper.class);
//        chineseinlaSFMapper.insertNewPhoneContact(phoneList);
//        chineseinlaSFMapper.insertNewWechatContact(wechatList);
//        chineseinlaSFMapper.insertNewEmailContact(emailList);

//        for (ChineseinlaSF chineseinlaSF : phoneList) {
//            System.out.println(chineseinlaSF.getCategory() + ": " + chineseinlaSF.getPhone());
//        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test4() {
        String str = "CA 91803U.S.A.(626) 872-2208LAWOFFICEHU@GMAIL.COM";
        Pattern compile = Pattern.compile("[(（]?[1]?[\\d]{3}[\\s)）-]*[\\d]{3}[\\s-]*[\\d]{4}");
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
