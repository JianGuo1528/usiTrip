package com.usitrip.test;

import com.alibaba.druid.sql.builder.SQLBuilder;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.test.others.Demo05;
import com.usitrip.dao.*;
import com.usitrip.pojo.*;
import com.usitrip.pojo.Dict;
import com.usitrip.utils.GoogleData;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.dom4j.io.SAXReader;
import org.json.XML;
import org.junit.Test;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.WhereDSL;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.*;
import java.net.URL;
import java.util.*;

import static com.usitrip.dao.HotelRoomTypeDynamicSqlSupport.hotelRoomType;
import static com.usitrip.dao.HotelRoomTypeDynamicSqlSupport.roomTypeId;
import static com.usitrip.dao.HotelRoomTypeDynamicSqlSupport.status;
import static com.usitrip.dao.WorldCityDynamicSqlSupport.cityEn;
import static com.usitrip.dao.WorldCityDynamicSqlSupport.worldCity;
import static com.usitrip.dao.DictDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

public class UpdateData {

    @Test
    public void test1() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        PnlAirportMapper pnlAirportMapper = sqlSession.getMapper(PnlAirportMapper.class);

        VoQuery voQuery = new VoQuery();
        voQuery.setCountryAndArea("中国");
        List<PnlAirport> pnlAirportList = pnlAirportMapper.findByCountryAndDesId(voQuery);
        System.out.println(pnlAirportList.size());

        DestinationMapper destinationMapper = sqlSession.getMapper(DestinationMapper.class);
        voQuery.setCountryId(180);
        voQuery.setDisplay(1);
        voQuery.setRegionType("City");
        List<Destination> destinationList = destinationMapper.findByCountryIdAndDisplay(voQuery);

        int pnlAirportListSize = pnlAirportList.size();
        List<Destination> destinationResultList = new ArrayList<>(pnlAirportListSize);
        List<Double> distanceResultList = new ArrayList<>(pnlAirportListSize);
        for (int i = 0; i < pnlAirportListSize; i++) {
            distanceResultList.add(99999999.0);
        }

        findTheDestination4Airport(pnlAirportList, destinationList, destinationResultList, distanceResultList);

//        for (int i = 0; i < destinationResultList.size(); i++) {
//            if (destinationResultList.get(i) != null) {
//                System.out.println(pnlAirportList.get(i).getLocationServed() + " " + destinationResultList.get(i).getDesName() + " " + distanceResultList.get(i));
//            }
//        }
        sqlSession.close();
    }

    private void findTheDestination4Airport(List<PnlAirport> pnlAirportList, List<Destination> destinationList, List<Destination> resultList, List<Double> distanceResultList) throws IOException {
        /*GoogleData GoogleData = new GoogleData();
        int size = pnlAirportList.size();
        for (int i = 0; i < size; ++i) {
            for (Destination destination : destinationList) {
                Double distance = getDistance(GoogleData, pnlAirportList.get(i).getLocationServed(), destination.getDesName());
                if (distance == null || distance > Constant.MAXDISTANCE) {
                    continue;
                } else {
                    if (resultList.get(i) == null || distance < distanceResultList.get(i)) {
                        resultList.set(i, destination);
                        distanceResultList.set(i, distance);
                    }
                }
            }
        }*/
    }

    private String getFormattedAddress(GoogleData GoogleData, String origin, String destination) throws IOException {
        String url_request = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + origin + "&destinations=" + destination;
        String response = GoogleData.getAddressInfo(url_request);

        JSONObject jsonObject = JSONObject.parseObject(response);

        StringBuilder sb = new StringBuilder();

        String originAddress = jsonObject.getJSONArray("origin_addresses").get(0).toString() == null ? " " : jsonObject.getJSONArray("origin_addresses").get(0).toString();
        sb.append(originAddress);
        sb.append(" &&&& ");

        String destinationAddress = jsonObject.getJSONArray("destination_addresses").get(0).toString() == null ? " " : jsonObject.getJSONArray("destination_addresses").get(0).toString();
        sb.append(destinationAddress);
        return sb.toString();
    }

    @Test
    public void test2() throws IOException {
        String url_request = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Hongyuan, Sichuan, China&destinations=Beijing Financial Street";

        GoogleData GoogleData = new GoogleData();
        String response = GoogleData.getAddressInfo(url_request);
        System.out.println(response);

        JSONObject jsonObject = JSONObject.parseObject(response);

        JSONArray rows = jsonObject.getJSONArray("rows");

        JSONArray elements = ((JSONObject) rows.get(0)).getJSONArray("elements");


        System.out.println(((JSONObject) elements.get(0)).get("status"));
        System.out.println(((JSONObject) elements.get(0)).getJSONObject("distance").getDouble("value"));

    }

    @Test
    public void test3() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DestinationMapper destinationMapper = sqlSession.getMapper(DestinationMapper.class);

        Destination destination = destinationMapper.findById(94257);

        System.out.println(destination.getParent_RegionID() + " " + destination.getPath());

        sqlSession.close();
    }

    @Test
    public void updateFullAddress4Hotelbeds() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        HotelbedsMapZoneUsMapper hotelbedsMapZoneUsMapper = sqlSession.getMapper(HotelbedsMapZoneUsMapper.class);

        List<HotelbedsMapZoneUs> hotelbedsMapZoneUsList = hotelbedsMapZoneUsMapper.selectZoneNameNonQuery();

        int size = hotelbedsMapZoneUsList.size();
        System.out.println(size);

        GoogleData GoogleData = new GoogleData();

        for (int i = 0; i < size; i += 2) {
            HotelbedsMapZoneUs origin = hotelbedsMapZoneUsList.get(i);
            HotelbedsMapZoneUs destination = hotelbedsMapZoneUsList.get(i + 1 < size ? i + 1 : i);
            String formattedAddress = getFormattedAddress(GoogleData, origin.getZoneName() + "," + origin.getCity() + "," + origin.getProvince(),
                    destination.getZoneName() + "," + destination.getCity() + "," + destination.getProvince());
            String[] addresses = formattedAddress.split(" &&&& ");

            System.out.println(origin.getCity() + " -- " + destination.getCity());
            System.out.println(i + " -- " + Arrays.toString(addresses));
            if (addresses.length > 0 && !addresses[0].trim().isEmpty()) {
                origin.setFullAddress(addresses[0]);
            }
            if (addresses.length > 1 && !addresses[1].trim().isEmpty()) {
                destination.setFullAddress(addresses[1]);
            }
        }


        hotelbedsMapZoneUsMapper.batchUpdateFullAddress(hotelbedsMapZoneUsList);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test04() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);;

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DictMapper dictMapper = sqlSession.getMapper(DictMapper.class);

//        List<Dict> dictList = dictMapper.selectByExampleWithLimitAndOffset(dictMapper.createWhereClause("bed"), 0, 2);
//
//        for (Dict dict : dictList) {
//            System.out.println(dict);
//        }

        SelectStatementProvider selectStatementProvider = dictMapper.queryByIdWithJoin(35, "room");

        List<Dict> dicts = dictMapper.selectMany(selectStatementProvider);

        for (Dict dict : dicts) {
            System.out.println(dict);
        }
        System.out.println(dicts.size());

        List<Dict> dictList = dictMapper.selectDictByType("room");
        System.out.println(dictList.size());

        sqlSession.close();
    }

    @Test
    public void test05() {
        String json = "{\n" +
                "   \"results\" : [\n" +
                "      {\n" +
                "         \"address_components\" : [\n" +
                "            {\n" +
                "               \"long_name\" : \"Tumed Zuoqi\",\n" +
                "               \"short_name\" : \"Tumed Zuoqi\",\n" +
                "               \"types\" : [ \"political\", \"sublocality\", \"sublocality_level_1\" ]\n" +
                "            },\n" +
                "            {\n" +
                "               \"long_name\" : \"Hohhot\",\n" +
                "               \"short_name\" : \"Hohhot\",\n" +
                "               \"types\" : [ \"locality\", \"political\" ]\n" +
                "            },\n" +
                "            {\n" +
                "               \"long_name\" : \"Inner Mongolia\",\n" +
                "               \"short_name\" : \"Inner Mongolia\",\n" +
                "               \"types\" : [ \"administrative_area_level_1\", \"political\" ]\n" +
                "            },\n" +
                "            {\n" +
                "               \"long_name\" : \"China\",\n" +
                "               \"short_name\" : \"CN\",\n" +
                "               \"types\" : [ \"country\", \"political\" ]\n" +
                "            }\n" +
                "         ],\n" +
                "         \"formatted_address\" : \"Tumed Zuoqi, Hohhot, Inner Mongolia, China\",\n" +
                "         \"geometry\" : {\n" +
                "            \"bounds\" : {\n" +
                "               \"northeast\" : {\n" +
                "                  \"lat\" : 40.9301546,\n" +
                "                  \"lng\" : 111.8116989\n" +
                "               },\n" +
                "               \"southwest\" : {\n" +
                "                  \"lat\" : 40.4231551,\n" +
                "                  \"lng\" : 110.7815509\n" +
                "               }\n" +
                "            },\n" +
                "            \"location\" : {\n" +
                "               \"lat\" : 40.729572,\n" +
                "               \"lng\" : 111.163902\n" +
                "            },\n" +
                "            \"location_type\" : \"APPROXIMATE\",\n" +
                "            \"viewport\" : {\n" +
                "               \"northeast\" : {\n" +
                "                  \"lat\" : 40.9301546,\n" +
                "                  \"lng\" : 111.8116989\n" +
                "               },\n" +
                "               \"southwest\" : {\n" +
                "                  \"lat\" : 40.4231551,\n" +
                "                  \"lng\" : 110.7815509\n" +
                "               }\n" +
                "            }\n" +
                "         },\n" +
                "         \"place_id\" : \"ChIJp__WDcgaBjYRLBF-eo9iSB0\",\n" +
                "         \"types\" : [ \"political\", \"sublocality\", \"sublocality_level_1\" ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"status\" : \"OK\"\n" +
                "}";
//        Gson gson = new Gson();
//        AddressBean addressBean = gson.fromJson(json, AddressBean.class);
//
//        System.out.println(addressBean.getResults().get(0).getAddress_components().get(0).getTypes().get(0).trim());
//
//        Type type = new TypeToken<Map<String, Object>>() {}.getType();
//        Map<String, Object> map = gson.fromJson(json, type);

//        System.out.println(map);

        org.json.JSONObject jsonObject = new org.json.JSONObject(json);
        String s = XML.toString(jsonObject);
        System.out.println(s);
    }

    @Test
    public void test06() throws IOException {
        String API_KEY = "AIzaSyDanv-o8l3PzvEyHzx09U6Yxnlu7DyF2gM";
        String location = null;

        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WorldCityMapper worldCityMapper = sqlSession.getMapper(WorldCityMapper.class);

        List<WorldCity> worldCities = worldCityMapper.selectByExample().where(worldCity.country, isEqualTo("中国"), and(cityEn, isLike("% %"))).build().execute();
        System.out.println(worldCities);

       /* Demo05 demo05 = new Demo05();

        Gson gson = new Gson();
        int i = 1;
        for (WorldCity wc : worldCities) {
            location = wc.getProvince() + ", " + wc.getCity();
            System.out.println(wc.getProvince() + ", " + wc.getCity());
            String url_request = "https://maps.google.com/maps/api/geocode/json?address=" + location + "&sensor=false&key=" + API_KEY;
            String run = demo05.run(url_request);

            AddressBean addressBean = gson.fromJson(run, AddressBean.class);
            if (addressBean.getStatus().equalsIgnoreCase("OK")) {
                wc.setCityEn(addressBean.getResults().get(0).getAddress_components().get(0).getLong_name());
                worldCityMapper.updateByPrimaryKeySelective(wc);
            }
            System.out.println("正在处理: " + i++);
        }

        sqlSession.commit();*/
        sqlSession.close();
    }

    @Test
    public void test07() throws IOException {
//        String API_KEY = "AIzaSyDanv-o8l3PzvEyHzx09U6Yxnlu7DyF2gM";
//        String API_KEY = "AIzaSyASOOf0X4I4dKSLTImW5R5fnjdvCGgqHKM";
        String API_KEY = "AIzaSyDu39oCRDsJZBN2H0AMwa0TiyJg3WhtBV0";
//        String API_KEY = "AIzaSyA8Dm7sp9xdnhB0-7Kb6pSYwy_TWHtJm3A";

        String location = null;

        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        WorldCityAbroadMapper worldCityAbroadMapper = sqlSession.getMapper(WorldCityAbroadMapper.class);

        List<WorldCityAbroad> worldCityAbroads = worldCityAbroadMapper.selectByPage(4801, 2400);

        Demo05 demo05 = new Demo05();

        Gson gson = new Gson();
        int i = 1;
        for (WorldCityAbroad worldCityAbroad : worldCityAbroads) {
            location = worldCityAbroad.getCity() + ", " + worldCityAbroad.getCountry();
            String url_request = "https://maps.google.com/maps/api/geocode/json?address=" + location + "&sensor=false&key=" + API_KEY;
            String run = demo05.run(url_request);

            try {
                AddressBean addressBean = gson.fromJson(run, AddressBean.class);
                if (addressBean.getStatus().equalsIgnoreCase("OK")) {
                    List<AddressBean.ResultsBean.AddressComponentsBean> address_components = addressBean.getResults().get(0).getAddress_components();
                    if (address_components.size() >= 3) {
                        for (AddressBean.ResultsBean.AddressComponentsBean address_component : address_components) {
                            if (address_component.getTypes().get(0).trim().equalsIgnoreCase("locality")) {
                                worldCityAbroad.setCityEn(address_component.getLong_name());
//                                worldCityAbroadMapper.updateByPrimaryKeySelective(worldCityAbroad);
                                break;
                            }
                        }
                    }
                }
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
            }
            System.out.println("正在处理: " + i++);
        }

        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void test08() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DictMapper dictMapper = sqlSession.getMapper(DictMapper.class);

        List<Dict> dicts = dictMapper.selectByExample()
                .where(type, isEqualTo("room"))
                .and(dict.hotelid, isEqualTo(0), or(dict.hotelid, isEqualTo(123)))
                .and(dict.id, isNotIn(select(roomTypeId)
                        .from(hotelRoomType)
                        .where(status, isEqualTo(0))
                        .and(hotelRoomType.hotelid, isEqualTo(123))))
                .orderBy(sortColumn("hotelId"))
                .build()
                .execute();

        for (Dict dict1 : dicts) {
            System.out.println(dict1);
        }

        sqlSession.close();
    }

    @Test
    public void test09() throws JAXBException, SOAPException, IOException {
        String str = "<soap:Envelope\n" +
                "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n" +
                "    xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soap:Body>\n" +
                "        <OTA_HotelDescriptiveContentNotifRQ TimeStamp=\"0001-01-01T00:00:00\" Target=\"Test\" Version=\"1.0\" PrimaryLangID=\"zh-cn\"\n" +
                "            xmlns=\"http://www.opentravel.org/OTA/2003/05\">\n" +
                "            <POS>\n" +
                "                <Source>\n" +
                "                    <RequestorID Type=\"1\" ID=\"jtbtest\" MessagePassword=\"jtbtest\">\n" +
                "                        <CompanyName Code=\"C\" CodeContext=\"10029\" />\n" +
                "                    </RequestorID>\n" +
                "                </Source>\n" +
                "            </POS>\n" +
                "            <HotelDescriptiveContents HotelCode=\"H1\" HotelCityCode=\"99\">\n" +
                "                <HotelDescriptiveContent>\n" +
                "                    <HotelInfo WhenBuilt=\"2006-09\" HotelStatus=\"Active\">\n" +
                "                        <Descriptions>\n" +
                "                            <MultimediaDescriptions>\n" +
                "                                <MultimediaDescription>\n" +
                "                                    <TextItems>\n" +
                "                                        <TextItem Title=\"旧金山酒店\" Language=\"zh-cn\">\n" +
                "                                            <Description>该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。</Description>\n" +
                "                                        </TextItem>\n" +
                "                                        <TextItem Title=\"San Francisco\" Language=\"en-us\">\n" +
                "                                            <Description>Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar</Description>\n" +
                "                                        </TextItem>\n" +
                "                                    </TextItems>\n" +
                "                                </MultimediaDescription>\n" +
                "                                <Renovation RenovationCompletionDate=\"2015-07\" />\n" +
                "                            </MultimediaDescriptions>\n" +
                "                        </Descriptions>\n" +
                "                        <CategoryCodes>\n" +
                "                            <GuestRoomInfo Quantity=\"15\" />\n" +
                "                        </CategoryCodes>\n" +
                "                        <Position Latitude=\"38.541683\" Longitude=\"0.121757\" />\n" +
                "                        <Services>\n" +
                "                            <Service Code=\"109\" />\n" +
                "                        </Services>\n" +
                "                    </HotelInfo>\n" +
                "                    <Policies>\n" +
                "                        <Policy>\n" +
                "                            <PolicyInfoCodes>\n" +
                "                                <PolicyInfoCode>\n" +
                "                                    <Description>\n" +
                "                                        <Text Language=\"zh-cn\">1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；</Text>\n" +
                "                                    </Description>\n" +
                "                                </PolicyInfoCode>\n" +
                "                                <PolicyInfoCode>\n" +
                "                                    <Description>\n" +
                "                                        <Text Language=\"zh-cn\">2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；</Text>\n" +
                "                                    </Description>\n" +
                "                                </PolicyInfoCode>\n" +
                "                                <PolicyInfoCode>\n" +
                "                                    <Description>\n" +
                "                                        <Text Language=\"zh-cn\">3.入住时需要出示政府核发的身份证件（带照片），如护照；</Text>\n" +
                "                                    </Description>\n" +
                "                                </PolicyInfoCode>\n" +
                "                                <PolicyInfoCode>\n" +
                "                                    <Description>\n" +
                "                                        <Text Language=\"zh-cn\">4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；</Text>\n" +
                "                                    </Description>\n" +
                "                                </PolicyInfoCode>\n" +
                "                                <PolicyInfoCode>\n" +
                "                                    <Description>\n" +
                "                                        <Text Language=\"zh-cn\">5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。</Text>\n" +
                "                                    </Description>\n" +
                "                                </PolicyInfoCode>\n" +
                "                            </PolicyInfoCodes>\n" +
                "                            <PolicyInfo CheckInTime=\"14:00\" CheckOutTime=\"11:00\">\n" +
                "                                <Description\n" +
                "                                    xmlns:q1=\"http://www.w3.org/2001/XMLSchema\" p8:type=\"q1:string\"\n" +
                "                                    xmlns:p8=\"http://www.w3.org/2001/XMLSchema-instance\">最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住\n" +
                "                                </Description>\n" +
                "                            </PolicyInfo>\n" +
                "                        </Policy>\n" +
                "                    </Policies>\n" +
                "                    <AffiliationInfo>\n" +
                "                        <Awards>\n" +
                "                            <Award Rating=\"4\" RatingSymbol=\"Star\" />\n" +
                "                        </Awards>\n" +
                "                    </AffiliationInfo>\n" +
                "                    <MultimediaDescriptions>\n" +
                "                        <MultimediaDescription>\n" +
                "                            <ImageItems>\n" +
                "                                <ImageItem>\n" +
                "                                    <ImageFormat>\n" +
                "                                        <URL>http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ==</URL>\n" +
                "                                    </ImageFormat>\n" +
                "                                </ImageItem>\n" +
                "                                <ImageItem>\n" +
                "                                    <ImageFormat>\n" +
                "                                        <URL>http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ==</URL>\n" +
                "                                    </ImageFormat>\n" +
                "                                </ImageItem>\n" +
                "                            </ImageItems>\n" +
                "                        </MultimediaDescription>\n" +
                "                    </MultimediaDescriptions>\n" +
                "                    <ContactInfos>\n" +
                "                        <ContactInfo>\n" +
                "                            <Addresses>\n" +
                "                                <Address Language=\"zh-cn\">\n" +
                "                                    <CountryName Code=\"TH\">泰国</CountryName>\n" +
                "                                    <CityName>皮皮岛</CityName>\n" +
                "                                    <AddressLine>130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand</AddressLine>\n" +
                "                                    <PostalCode>81000</PostalCode>\n" +
                "                                </Address>\n" +
                "                                <Address Language=\"en-us\">\n" +
                "                                    <CountryName Code=\"TH\">Thailand</CountryName>\n" +
                "                                    <CityName>Koh-Phi-Phi</CityName>\n" +
                "                                    <AddressLine>130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000</AddressLine>\n" +
                "                                    <PostalCode>81000</PostalCode>\n" +
                "                                </Address>\n" +
                "                            </Addresses>\n" +
                "                            <Phones>\n" +
                "                                <Phone PhoneNumber=\"0066-817972088\" PhoneTechType=\"Voice\" />\n" +
                "                                <Phone PhoneNumber=\"0066-817972088\" PhoneTechType=\"Fax\" />\n" +
                "                            </Phones>\n" +
                "                            <Emails>\n" +
                "                                <Email>phiphi_inn@hotmail.com</Email>\n" +
                "                            </Emails>\n" +
                "                        </ContactInfo>\n" +
                "                    </ContactInfos>\n" +
                "                    <GDS_Info>\n" +
                "                        <GDS_Codes>\n" +
                "                            <GDS_Code GDS_PropertyCode=\"1213897\" GDS_Name=\"Sabre\" />\n" +
                "                        </GDS_Codes>\n" +
                "                        <GDS_Codes>\n" +
                "                            <GDS_Code GDS_PropertyCode=\"2345667\" GDS_Name=\"Amadeus\" />\n" +
                "                        </GDS_Codes>\n" +
                "                    </GDS_Info>\n" +
                "                </HotelDescriptiveContent>\n" +
                "            </HotelDescriptiveContents>\n" +
                "        </OTA_HotelDescriptiveContentNotifRQ>\n" +
                "    </soap:Body>\n" +
                "</soap:Envelope>";
       /* JAXBContext context = JAXBContext.newInstance(TestBean.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        TestBean testBean = (TestBean) unmarshaller.unmarshal(new StringReader(str));*/

        SOAPMessage message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(str.getBytes()));
        SOAPBody soapBody = message.getSOAPBody();

        NodeList nodes = soapBody.getElementsByTagName("CountryName");
        nodes.item(0).setTextContent("测试法国");
        message.saveChanges();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        message.writeTo(baos);

        NodeList hotelDescriptiveContents = soapBody.getElementsByTagName("HotelCode");
        soapBody.getAttribute("Language");
//        Node hotelCode = hotelDescriptiveContents.item(0).getAttributes().getNamedItem("HotelCode");

//        System.out.println(new String(baos.toByteArray()));


/*        SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
        SOAPConnection connection = sfc.createConnection();

        SOAPMessage message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(str.getBytes()));
        SOAPMessage soapMessage = connection.call(message, new URL("http://vendor-ctrip.fws.ctripqa.com/Hotel/OTAReceive/HotelStaticInfoService.asmx"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        soapMessage.writeTo(baos);
        System.out.println(new String(baos.toByteArray()));*/
    }

    @Test
    public void test10() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(11, "aaa");
        map.put(4, "bbb");
        map.put(2, "ccc");
        map.put(3, "ddd");

        System.out.println(map);
        System.out.println(map.keySet());
    }
}
