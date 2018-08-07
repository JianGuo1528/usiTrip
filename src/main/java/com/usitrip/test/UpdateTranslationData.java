package com.usitrip.test;

import com.swjtu.lang.Lang;
import com.swjtu.querier.Querier;
import com.swjtu.trans.AbstractTranslator;
import com.swjtu.trans.impl.BaiduTranslator;
import com.swjtu.trans.impl.IcibaTranslator;
import com.usitrip.dao.WorldCityMapper;
import com.usitrip.dao.WorldCountryRegionMapper;
import com.usitrip.dao.WorldLocZhMapper;
import com.usitrip.pojo.WorldCity;
import com.usitrip.pojo.WorldCityExample;
import com.usitrip.pojo.WorldCountryRegion;
import com.usitrip.pojo.WorldLocZh;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class UpdateTranslationData {
    @Test
    public void test1() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WorldCountryRegionMapper worldCountryRegionMapper = sqlSession.getMapper(WorldCountryRegionMapper.class);

        List<WorldCountryRegion> worldCountryRegions = worldCountryRegionMapper.selectAllRegion();

        System.out.println(worldCountryRegions.size());

        for (WorldCountryRegion worldCountryRegion : worldCountryRegions) {
            Querier<AbstractTranslator> querierTrans = new Querier<>();
            querierTrans.setParams(Lang.EN, Lang.ZH, worldCountryRegion.getRegionName());
            querierTrans.attach(new BaiduTranslator());
            List<String> strings = querierTrans.execute();
            worldCountryRegion.setRegionNameZh(strings.get(0));
        }

        worldCountryRegionMapper.updateAllRegion(worldCountryRegions);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        try (PDDocument document = PDDocument.load(new File("C:\\Users\\vivian.xia\\Downloads\\location.pdf"))) {
            if (!document.isEncrypted()) {
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }

            }

        }
    }

    @Test
    public void test3() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vivian.xia\\Downloads\\loc.txt"));
        String line = null;
        int lineNum = 1;

        List<WorldLocZh> list = new ArrayList<WorldLocZh>();
        while ((line = br.readLine()) != null) {
            if (lineNum % 2 == 0) {
                String[] strings = line.split("【国家】|【译名】");
//                String locName = line.substring(0, line.indexOf("【")).replace("\"", "").trim();
//                String locNameZh = line.substring(line.lastIndexOf("】") + 1).trim();
                String locName = strings[0].replace("\"", "").trim();
                String locNameZh = strings[2].trim();
                String[] countries = strings[1].trim().split("[、·]");
                for (String country : countries) {
                    WorldLocZh wlz = new WorldLocZh();
                    wlz.setLocName(locName);
                    wlz.setLocNameZh(locNameZh);
                    wlz.setCountry(country.trim());
                    list.add(wlz);
                }
//                WorldLocZh wlz = new WorldLocZh();
//                wlz.setLocName(locName);
//                wlz.setLocNameZh(locNameZh);
//                list.add(wlz);
            }
            lineNum ++;
        }
        br.close();

        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WorldLocZhMapper worldLocZhMapper = sqlSession.getMapper(WorldLocZhMapper.class);
        worldLocZhMapper.insertNewLoc(list);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test04() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WorldCityMapper worldCityMapper = sqlSession.getMapper(WorldCityMapper.class);

        List<Integer> ids = Arrays.asList(661,
                674,
                694,
                702,
                717,
                737,
                741,
                744,
                792,
                817,
                839,
                858,
                866,
                884,
                897,
                917,
                922,
                935,
                968,
                1340,
                18827,
                18844,
                32771,
                32781,
                32787,
                32795,
                32799,
                32808,
                32817,
                32819,
                32820,
                32826,
                32831,
                32832,
                32835,
                32838,
                32840,
                32844,
                32849,
                32860,
                32863,
                32868,
                32869,
                32874,
                32875,
                32880,
                32884,
                32889,
                32891,
                32893,
                32894,
                32899,
                32901,
                32907,
                32908,
                32914,
                32915,
                32920,
                32924,
                32931,
                32938,
                32943,
                32948,
                32950,
                32956,
                32964,
                32969,
                32975,
                32976,
                32978,
                32990,
                32991,
                32994,
                32995,
                32996,
                33008,
                33015,
                33019,
                33020,
                33022,
                33023,
                33024,
                33025,
                33038,
                33040,
                33043,
                33044,
                33046,
                33051,
                33053,
                33058,
                33061,
                33067,
                33071,
                33078,
                33082,
                33090,
                33114,
                33124,
                33132,
                33140,
                33143,
                33153,
                33163,
                33171,
                33172,
                33177,
                33189,
                33190,
                33191,
                33192,
                33193,
                33198,
                33200,
                33203,
                33204,
                33206,
                33207,
                33211,
                33213,
                33214,
                33215,
                33218,
                33221,
                33223,
                33226,
                33227,
                33228,
                33233,
                33240,
                33241,
                33243,
                33248,
                33254,
                33257,
                33263,
                33265,
                33266,
                33272,
                33279,
                33280,
                33281,
                33282,
                33283,
                33287,
                33289,
                33292,
                33299,
                33301,
                33305,
                33309,
                33311,
                33313,
                33323,
                33326,
                33328,
                33331,
                33332,
                33333,
                33337,
                33341,
                33350,
                33354,
                33358,
                33361,
                33365,
                33369,
                33380,
                33381,
                33391,
                33407,
                33410,
                33412,
                33417,
                33424,
                33425,
                33430,
                33432,
                33435,
                33440,
                33448,
                33460,
                33470,
                33473,
                33480,
                33494,
                33501,
                33505,
                33516,
                33519,
                33528,
                33535,
                33538,
                33540,
                33550,
                33554,
                33559,
                33568,
                33570,
                33571,
                33575,
                33578,
                33579,
                33588,
                33591,
                33596,
                33597,
                33598,
                33601,
                33606,
                33607,
                33612,
                33613,
                33614,
                33616,
                33619,
                33636,
                33637,
                33647,
                33650,
                33652,
                33657,
                33660,
                33661,
                33665,
                33667,
                33669,
                33676,
                33678,
                33680,
                33683,
                33684,
                33689,
                33699,
                33700,
                33701,
                33709,
                33715,
                33716,
                33721,
                33725,
                33731,
                33732,
                33733,
                33738,
                33748,
                33757,
                33762,
                33773,
                33781,
                33802,
                33819,
                33821,
                33822,
                33823,
                33825,
                33831,
                33833,
                33835,
                33844,
                33845,
                33852,
                33861,
                33864,
                33869,
                33877,
                33880,
                33882,
                33883,
                33887,
                33900,
                33922,
                33930,
                33940,
                33951,
                33956,
                33958,
                33964,
                33971,
                33977,
                33979,
                33986,
                33987,
                33988,
                33989,
                33993,
                33999,
                34002,
                34016,
                34017,
                34026,
                34027,
                34028,
                34039,
                34043,
                34048,
                34051,
                34052,
                34062,
                34071,
                34081,
                34085,
                34090,
                34094,
                34096,
                34100,
                34102,
                34104,
                34108,
                34112,
                34133,
                34134,
                34145,
                34150,
                34151,
                34156,
                34166,
                34170,
                34172,
                34174,
                34175,
                34187,
                34188,
                34189,
                34193,
                34200,
                34207,
                34210,
                34213,
                34221,
                34237,
                34246,
                34249,
                34261,
                34263,
                34279,
                34284,
                34293,
                34294,
                34296,
                34312,
                34319,
                34320,
                34324,
                34328,
                34337,
                34338,
                34341,
                34343,
                34344,
                34347,
                34348,
                34357,
                34368,
                34371,
                34373,
                34377,
                34385,
                34386,
                34390,
                34391,
                34392,
                34393,
                34395,
                34397,
                34402,
                34403,
                34404,
                34405,
                34409,
                34412,
                34419,
                34432,
                34439,
                34442,
                34452,
                34453,
                34454,
                34458,
                34460,
                34461,
                34465,
                34467,
                34469,
                34471,
                34475,
                34477,
                34491,
                34499,
                34509,
                34510,
                34511,
                34517,
                34519,
                34524,
                34533,
                34534,
                34547,
                34553,
                34554,
                34556,
                34562,
                34564,
                34566,
                34572,
                34581,
                34582,
                34585,
                34586,
                34592,
                34595,
                34598,
                34599,
                34601,
                34602,
                34607,
                34614,
                34615,
                34631,
                34635,
                34639,
                34645,
                34649,
                34653,
                34655,
                34656,
                34658,
                34661,
                34666,
                34672,
                34675,
                34682,
                34685,
                34687,
                34689,
                34692,
                34698,
                34699,
                34706,
                34708,
                34711,
                34718,
                34720,
                34730,
                34731,
                34733,
                34735,
                34745,
                34747,
                34748,
                34752,
                34760,
                34761,
                34764,
                34766,
                34768,
                34769,
                34770,
                34771,
                34779,
                34789,
                34800,
                34808,
                34810,
                34817,
                34818,
                34827,
                34828,
                34831,
                34833,
                34839,
                34847,
                34848,
                34851,
                34853,
                34856,
                34857,
                34860,
                34861,
                34864,
                34873,
                34877,
                34878,
                34879,
                34881,
                34883,
                34886,
                34888,
                34889,
                34893,
                34898,
                34900,
                34907,
                34908,
                34909,
                34913,
                34926,
                34928,
                34931,
                34946,
                34947,
                34954,
                34957,
                34958,
                34965,
                34968,
                34971,
                34972,
                34973,
                34978,
                34981,
                34988,
                34992,
                34993,
                34994,
                34996,
                34999,
                35000,
                35001,
                35003,
                35004,
                35008,
                35010,
                35013,
                35014,
                35018,
                35019,
                35022,
                35023,
                35025,
                35027,
                35029,
                35031,
                35039,
                35041,
                35044,
                35045,
                35046,
                35055,
                35057,
                35060,
                35069,
                35076,
                35081,
                35082);
        WorldCityExample worldCityExample = new WorldCityExample();
        worldCityExample.createCriteria().andIdIn(ids);
//        List<WorldCity> worldCities = worldCityMapper.selectByExample(worldCityExample);

//        int i = 1;
//        for (WorldCity worldCity : worldCities) {
//            System.out.println("处理第" + i++ + "条！");
//            Querier<AbstractTranslator> querierTrans = new Querier<>();
//            querierTrans.setParams(Lang.ZH, Lang.EN, worldCity.getCity());
//            querierTrans.attach(new BaiduTranslator());
//            List<String> strings = querierTrans.execute();
//            worldCity.setCityEn(strings.get(0));
//            worldCityMapper.updateByPrimaryKeySelective(worldCity);
//        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test05() {
        Querier<AbstractTranslator> querierTrans = new Querier<>();
        querierTrans.setParams(Lang.ZH, Lang.EN, "丹戎");
        querierTrans.attach(new IcibaTranslator());
        List<String> strings = querierTrans.execute();
        System.out.println(strings.get(0).replaceAll("\\[[\\w\\W]*] |\"", "").trim());
    }

    @Test
    public void test06() {
        int[] ints = {1, 2, 9};
        String s = Arrays.toString(ints);
        s = s.replaceAll("[\\[\\], ]", "");
        int i = Integer.parseInt(s);
        i = i + 1;
        System.out.println(i);
    }

    @Test
    public void test07() {
        /*
            1
            1+1, 2
            1+1+1, 2+1, 1+2
            1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2
            1+1+1+1+1, 2+1+1+1, 1+2+1+1, 1+1+2+1, 1+1+1+2, 2+2+1, 1+2+2, 2+1+2
         */
        int level = 20;

        List<List<String>> levelList = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("1");
        levelList.add(list);

        list = new ArrayList<String>();
        list.add("1+1");
        list.add("2");
        levelList.add(list);

        for (int i = 2; i < level; i++) {
            List<String> tempList = new ArrayList<String>();
            List<String> strings = levelList.get(i - 1);
            for (String s : strings) {
                tempList.add(s + "+1");
            }
            strings = levelList.get(i - 2);
            for (String s : strings) {
                tempList.add(s + "+2");
            }
            levelList.add(tempList);
        }

        System.out.println(levelList.get(level - 1));
    }
}
