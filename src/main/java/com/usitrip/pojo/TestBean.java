package com.usitrip.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TestBean {
    @SerializedName("soap:Envelope")
    private EnvelopeBean _$SoapEnvelope51; // FIXME check this code

    public EnvelopeBean get_$SoapEnvelope51() {
        return _$SoapEnvelope51;
    }

    public void set_$SoapEnvelope51(EnvelopeBean _$SoapEnvelope51) {
        this._$SoapEnvelope51 = _$SoapEnvelope51;
    }

    public static class EnvelopeBean {
        @SerializedName("xmlns:xsd")
        private String _$XmlnsXsd109; // FIXME check this code
        @SerializedName("xmlns:soap")
        private String _$XmlnsSoap78; // FIXME check this code
        @SerializedName("xmlns:xsi")
        private String _$XmlnsXsi61; // FIXME check this code
        @SerializedName("soap:Body")
        private BodyBean _$SoapBody313; // FIXME check this code

        public String get_$XmlnsXsd109() {
            return _$XmlnsXsd109;
        }

        public void set_$XmlnsXsd109(String _$XmlnsXsd109) {
            this._$XmlnsXsd109 = _$XmlnsXsd109;
        }

        public String get_$XmlnsSoap78() {
            return _$XmlnsSoap78;
        }

        public void set_$XmlnsSoap78(String _$XmlnsSoap78) {
            this._$XmlnsSoap78 = _$XmlnsSoap78;
        }

        public String get_$XmlnsXsi61() {
            return _$XmlnsXsi61;
        }

        public void set_$XmlnsXsi61(String _$XmlnsXsi61) {
            this._$XmlnsXsi61 = _$XmlnsXsi61;
        }

        public BodyBean get_$SoapBody313() {
            return _$SoapBody313;
        }

        public void set_$SoapBody313(BodyBean _$SoapBody313) {
            this._$SoapBody313 = _$SoapBody313;
        }

        public static class BodyBean {
            /**
             * OTA_HotelDescriptiveContentNotifRQ : {"Target":"Test","xmlns":"http://www.opentravel.org/OTA/2003/05","HotelDescriptiveContents":{"HotelCode":"H1","HotelDescriptiveContent":{"HotelInfo":{"HotelStatus":"Active","Descriptions":{"MultimediaDescriptions":{"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}},"Services":{"Service":{"Code":109}},"Position":{"Latitude":38.541683,"Longitude":0.121757},"WhenBuilt":"2006-09","CategoryCodes":{"GuestRoomInfo":{"Quantity":15}}},"Policies":{"Policy":{"PolicyInfoCodes":{"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]},"PolicyInfo":{"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}}},"MultimediaDescriptions":{"MultimediaDescription":{"ImageItems":{"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}}},"ContactInfos":{"ContactInfo":{"Addresses":{"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]},"Phones":{"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]},"Emails":{"Email":"phiphi_inn@hotmail.com"}}},"GDS_Info":{"GDS_Codes":[{"GDS_Code":{"GDS_Name":"Sabre","GDS_PropertyCode":1213897}},{"GDS_Code":{"GDS_Name":"Amadeus","GDS_PropertyCode":2345667}}]},"AffiliationInfo":{"Awards":{"Award":{"Rating":4,"RatingSymbol":"Star"}}}},"HotelCityCode":99},"Version":1,"POS":{"Source":{"RequestorID":{"CompanyName":{"CodeContext":10029,"Code":"C"},"Type":1,"MessagePassword":"jtbtest","ID":"jtbtest"}}},"PrimaryLangID":"zh-cn","TimeStamp":"0001-01-01T00:00:00"}
             */

            private OTAHotelDescriptiveContentNotifRQBean OTA_HotelDescriptiveContentNotifRQ;

            public OTAHotelDescriptiveContentNotifRQBean getOTA_HotelDescriptiveContentNotifRQ() {
                return OTA_HotelDescriptiveContentNotifRQ;
            }

            public void setOTA_HotelDescriptiveContentNotifRQ(OTAHotelDescriptiveContentNotifRQBean OTA_HotelDescriptiveContentNotifRQ) {
                this.OTA_HotelDescriptiveContentNotifRQ = OTA_HotelDescriptiveContentNotifRQ;
            }

            public static class OTAHotelDescriptiveContentNotifRQBean {
                /**
                 * Target : Test
                 * xmlns : http://www.opentravel.org/OTA/2003/05
                 * HotelDescriptiveContents : {"HotelCode":"H1","HotelDescriptiveContent":{"HotelInfo":{"HotelStatus":"Active","Descriptions":{"MultimediaDescriptions":{"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}},"Services":{"Service":{"Code":109}},"Position":{"Latitude":38.541683,"Longitude":0.121757},"WhenBuilt":"2006-09","CategoryCodes":{"GuestRoomInfo":{"Quantity":15}}},"Policies":{"Policy":{"PolicyInfoCodes":{"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]},"PolicyInfo":{"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}}},"MultimediaDescriptions":{"MultimediaDescription":{"ImageItems":{"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}}},"ContactInfos":{"ContactInfo":{"Addresses":{"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]},"Phones":{"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]},"Emails":{"Email":"phiphi_inn@hotmail.com"}}},"GDS_Info":{"GDS_Codes":[{"GDS_Code":{"GDS_Name":"Sabre","GDS_PropertyCode":1213897}},{"GDS_Code":{"GDS_Name":"Amadeus","GDS_PropertyCode":2345667}}]},"AffiliationInfo":{"Awards":{"Award":{"Rating":4,"RatingSymbol":"Star"}}}},"HotelCityCode":99}
                 * Version : 1
                 * POS : {"Source":{"RequestorID":{"CompanyName":{"CodeContext":10029,"Code":"C"},"Type":1,"MessagePassword":"jtbtest","ID":"jtbtest"}}}
                 * PrimaryLangID : zh-cn
                 * TimeStamp : 0001-01-01T00:00:00
                 */

                private String Target;
                private String xmlns;
                private HotelDescriptiveContentsBean HotelDescriptiveContents;
                private int Version;
                private POSBean POS;
                private String PrimaryLangID;
                private String TimeStamp;

                public String getTarget() {
                    return Target;
                }

                public void setTarget(String Target) {
                    this.Target = Target;
                }

                public String getXmlns() {
                    return xmlns;
                }

                public void setXmlns(String xmlns) {
                    this.xmlns = xmlns;
                }

                public HotelDescriptiveContentsBean getHotelDescriptiveContents() {
                    return HotelDescriptiveContents;
                }

                public void setHotelDescriptiveContents(HotelDescriptiveContentsBean HotelDescriptiveContents) {
                    this.HotelDescriptiveContents = HotelDescriptiveContents;
                }

                public int getVersion() {
                    return Version;
                }

                public void setVersion(int Version) {
                    this.Version = Version;
                }

                public POSBean getPOS() {
                    return POS;
                }

                public void setPOS(POSBean POS) {
                    this.POS = POS;
                }

                public String getPrimaryLangID() {
                    return PrimaryLangID;
                }

                public void setPrimaryLangID(String PrimaryLangID) {
                    this.PrimaryLangID = PrimaryLangID;
                }

                public String getTimeStamp() {
                    return TimeStamp;
                }

                public void setTimeStamp(String TimeStamp) {
                    this.TimeStamp = TimeStamp;
                }

                public static class HotelDescriptiveContentsBean {
                    /**
                     * HotelCode : H1
                     * HotelDescriptiveContent : {"HotelInfo":{"HotelStatus":"Active","Descriptions":{"MultimediaDescriptions":{"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}},"Services":{"Service":{"Code":109}},"Position":{"Latitude":38.541683,"Longitude":0.121757},"WhenBuilt":"2006-09","CategoryCodes":{"GuestRoomInfo":{"Quantity":15}}},"Policies":{"Policy":{"PolicyInfoCodes":{"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]},"PolicyInfo":{"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}}},"MultimediaDescriptions":{"MultimediaDescription":{"ImageItems":{"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}}},"ContactInfos":{"ContactInfo":{"Addresses":{"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]},"Phones":{"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]},"Emails":{"Email":"phiphi_inn@hotmail.com"}}},"GDS_Info":{"GDS_Codes":[{"GDS_Code":{"GDS_Name":"Sabre","GDS_PropertyCode":1213897}},{"GDS_Code":{"GDS_Name":"Amadeus","GDS_PropertyCode":2345667}}]},"AffiliationInfo":{"Awards":{"Award":{"Rating":4,"RatingSymbol":"Star"}}}}
                     * HotelCityCode : 99
                     */

                    private String HotelCode;
                    private HotelDescriptiveContentBean HotelDescriptiveContent;
                    private int HotelCityCode;

                    public String getHotelCode() {
                        return HotelCode;
                    }

                    public void setHotelCode(String HotelCode) {
                        this.HotelCode = HotelCode;
                    }

                    public HotelDescriptiveContentBean getHotelDescriptiveContent() {
                        return HotelDescriptiveContent;
                    }

                    public void setHotelDescriptiveContent(HotelDescriptiveContentBean HotelDescriptiveContent) {
                        this.HotelDescriptiveContent = HotelDescriptiveContent;
                    }

                    public int getHotelCityCode() {
                        return HotelCityCode;
                    }

                    public void setHotelCityCode(int HotelCityCode) {
                        this.HotelCityCode = HotelCityCode;
                    }

                    public static class HotelDescriptiveContentBean {
                        /**
                         * HotelInfo : {"HotelStatus":"Active","Descriptions":{"MultimediaDescriptions":{"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}},"Services":{"Service":{"Code":109}},"Position":{"Latitude":38.541683,"Longitude":0.121757},"WhenBuilt":"2006-09","CategoryCodes":{"GuestRoomInfo":{"Quantity":15}}}
                         * Policies : {"Policy":{"PolicyInfoCodes":{"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]},"PolicyInfo":{"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}}}
                         * MultimediaDescriptions : {"MultimediaDescription":{"ImageItems":{"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}}}
                         * ContactInfos : {"ContactInfo":{"Addresses":{"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]},"Phones":{"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]},"Emails":{"Email":"phiphi_inn@hotmail.com"}}}
                         * GDS_Info : {"GDS_Codes":[{"GDS_Code":{"GDS_Name":"Sabre","GDS_PropertyCode":1213897}},{"GDS_Code":{"GDS_Name":"Amadeus","GDS_PropertyCode":2345667}}]}
                         * AffiliationInfo : {"Awards":{"Award":{"Rating":4,"RatingSymbol":"Star"}}}
                         */

                        private HotelInfoBean HotelInfo;
                        private PoliciesBean Policies;
                        private MultimediaDescriptionsBeanX MultimediaDescriptions;
                        private ContactInfosBean ContactInfos;
                        private GDSInfoBean GDS_Info;
                        private AffiliationInfoBean AffiliationInfo;

                        public HotelInfoBean getHotelInfo() {
                            return HotelInfo;
                        }

                        public void setHotelInfo(HotelInfoBean HotelInfo) {
                            this.HotelInfo = HotelInfo;
                        }

                        public PoliciesBean getPolicies() {
                            return Policies;
                        }

                        public void setPolicies(PoliciesBean Policies) {
                            this.Policies = Policies;
                        }

                        public MultimediaDescriptionsBeanX getMultimediaDescriptions() {
                            return MultimediaDescriptions;
                        }

                        public void setMultimediaDescriptions(MultimediaDescriptionsBeanX MultimediaDescriptions) {
                            this.MultimediaDescriptions = MultimediaDescriptions;
                        }

                        public ContactInfosBean getContactInfos() {
                            return ContactInfos;
                        }

                        public void setContactInfos(ContactInfosBean ContactInfos) {
                            this.ContactInfos = ContactInfos;
                        }

                        public GDSInfoBean getGDS_Info() {
                            return GDS_Info;
                        }

                        public void setGDS_Info(GDSInfoBean GDS_Info) {
                            this.GDS_Info = GDS_Info;
                        }

                        public AffiliationInfoBean getAffiliationInfo() {
                            return AffiliationInfo;
                        }

                        public void setAffiliationInfo(AffiliationInfoBean AffiliationInfo) {
                            this.AffiliationInfo = AffiliationInfo;
                        }

                        public static class HotelInfoBean {
                            /**
                             * HotelStatus : Active
                             * Descriptions : {"MultimediaDescriptions":{"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}}
                             * Services : {"Service":{"Code":109}}
                             * Position : {"Latitude":38.541683,"Longitude":0.121757}
                             * WhenBuilt : 2006-09
                             * CategoryCodes : {"GuestRoomInfo":{"Quantity":15}}
                             */

                            private String HotelStatus;
                            private DescriptionsBean Descriptions;
                            private ServicesBean Services;
                            private PositionBean Position;
                            private String WhenBuilt;
                            private CategoryCodesBean CategoryCodes;

                            public String getHotelStatus() {
                                return HotelStatus;
                            }

                            public void setHotelStatus(String HotelStatus) {
                                this.HotelStatus = HotelStatus;
                            }

                            public DescriptionsBean getDescriptions() {
                                return Descriptions;
                            }

                            public void setDescriptions(DescriptionsBean Descriptions) {
                                this.Descriptions = Descriptions;
                            }

                            public ServicesBean getServices() {
                                return Services;
                            }

                            public void setServices(ServicesBean Services) {
                                this.Services = Services;
                            }

                            public PositionBean getPosition() {
                                return Position;
                            }

                            public void setPosition(PositionBean Position) {
                                this.Position = Position;
                            }

                            public String getWhenBuilt() {
                                return WhenBuilt;
                            }

                            public void setWhenBuilt(String WhenBuilt) {
                                this.WhenBuilt = WhenBuilt;
                            }

                            public CategoryCodesBean getCategoryCodes() {
                                return CategoryCodes;
                            }

                            public void setCategoryCodes(CategoryCodesBean CategoryCodes) {
                                this.CategoryCodes = CategoryCodes;
                            }

                            public static class DescriptionsBean {
                                /**
                                 * MultimediaDescriptions : {"Renovation":{"RenovationCompletionDate":"2015-07"},"MultimediaDescription":{"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}}
                                 */

                                private MultimediaDescriptionsBean MultimediaDescriptions;

                                public MultimediaDescriptionsBean getMultimediaDescriptions() {
                                    return MultimediaDescriptions;
                                }

                                public void setMultimediaDescriptions(MultimediaDescriptionsBean MultimediaDescriptions) {
                                    this.MultimediaDescriptions = MultimediaDescriptions;
                                }

                                public static class MultimediaDescriptionsBean {
                                    /**
                                     * Renovation : {"RenovationCompletionDate":"2015-07"}
                                     * MultimediaDescription : {"TextItems":{"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}}
                                     */

                                    private RenovationBean Renovation;
                                    private MultimediaDescriptionBean MultimediaDescription;

                                    public RenovationBean getRenovation() {
                                        return Renovation;
                                    }

                                    public void setRenovation(RenovationBean Renovation) {
                                        this.Renovation = Renovation;
                                    }

                                    public MultimediaDescriptionBean getMultimediaDescription() {
                                        return MultimediaDescription;
                                    }

                                    public void setMultimediaDescription(MultimediaDescriptionBean MultimediaDescription) {
                                        this.MultimediaDescription = MultimediaDescription;
                                    }

                                    public static class RenovationBean {
                                        /**
                                         * RenovationCompletionDate : 2015-07
                                         */

                                        private String RenovationCompletionDate;

                                        public String getRenovationCompletionDate() {
                                            return RenovationCompletionDate;
                                        }

                                        public void setRenovationCompletionDate(String RenovationCompletionDate) {
                                            this.RenovationCompletionDate = RenovationCompletionDate;
                                        }
                                    }

                                    public static class MultimediaDescriptionBean {
                                        /**
                                         * TextItems : {"TextItem":[{"Description":"该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。","Language":"zh-cn","Title":"旧金山酒店"},{"Description":"Private self-catering apartments to rent for holidays or long stays, located in Av / Europa, 23, corner with C / Esperanto. Our reception and rental office FINCAS ARENA, is located in the basement of the building. The apartment, located on Levante beach in Benidorm has 1 bedroom with 2 beds and a sofa bed in the living room with a capacity up to 4 people. 48 sqm comfortable accommodation with sea view (upper floors). It is 600 m \"Levante Beach\", 150 m from the supermarket, 30 m from the nearest city bus, 50 km from the airport \"Alicante - El Altet\", 5 km from the golf course, 8 km \"Albir\" and is located in a lively neighborhood in the town. Very close to nightlife areas and the downtown area (old town). Ideal for holidays or long stays in winter. The apartments have clean towels and sheets that are delivered on arrival day. They have a full bathroom, living room, bedroom with wardrobe, kitchen with utility room and a large terrace (most of them glazed), if you need an iron  ask for it at our reception office. In winter they have an small electric heater. The kitchen has 2 electric plates, oven, microwave, toaster, kettle, coffee machine and fridge with separate freezer, washing machine and electric boiler for hot water. It has a kitchen utensils, dishes and cutlery for up to 4 people. The building has 2 lifts, large 8-shaped pool with a small children's pool, surrounded by lawns (pool is in operation all year except damage or vandalism), tennis court and small playground area. As optional services (at extra cost) available in the apartment TV (including 10 international channels in English), WIFI, safe box, portable air conditioner (Penguin). See optional services to reserve supplements (some extras may have a minimum price for independent of nights of stay). There is an underground parking in the building, we have a limited number of parking places for our customers (it is not possible to book them,  we deliver for free when available as customers arrive). There ar","Language":"en-us","Title":"San Francisco"}]}
                                         */

                                        private TextItemsBean TextItems;

                                        public TextItemsBean getTextItems() {
                                            return TextItems;
                                        }

                                        public void setTextItems(TextItemsBean TextItems) {
                                            this.TextItems = TextItems;
                                        }

                                        public static class TextItemsBean {
                                            private List<TextItemBean> TextItem;

                                            public List<TextItemBean> getTextItem() {
                                                return TextItem;
                                            }

                                            public void setTextItem(List<TextItemBean> TextItem) {
                                                this.TextItem = TextItem;
                                            }

                                            public static class TextItemBean {
                                                /**
                                                 * Description : 该酒店坐拥 Benidorm 的便利位置。酒店 建于 1990。 酒店 翻新装修于 2013。 酒店由 72 间客房构成。该酒店包括 72 公寓. 酒店 地处市中心，方便前往市区及其一切景点。酒店 靠近城市的主要火车站或公交站。酒店 距离公共交通网络数分钟车程。酒店 距离城市的主要娱乐区仅几步之遥。酒店 附近有本地高尔夫球场。客人从酒店几分钟便可抵达海滩。酒店为驱车前来的客人提供酒店内停车场。
                                                 * Language : zh-cn
                                                 * Title : 旧金山酒店
                                                 */

                                                private String Description;
                                                private String Language;
                                                private String Title;

                                                public String getDescription() {
                                                    return Description;
                                                }

                                                public void setDescription(String Description) {
                                                    this.Description = Description;
                                                }

                                                public String getLanguage() {
                                                    return Language;
                                                }

                                                public void setLanguage(String Language) {
                                                    this.Language = Language;
                                                }

                                                public String getTitle() {
                                                    return Title;
                                                }

                                                public void setTitle(String Title) {
                                                    this.Title = Title;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            public static class ServicesBean {
                                /**
                                 * Service : {"Code":109}
                                 */

                                private ServiceBean Service;

                                public ServiceBean getService() {
                                    return Service;
                                }

                                public void setService(ServiceBean Service) {
                                    this.Service = Service;
                                }

                                public static class ServiceBean {
                                    /**
                                     * Code : 109
                                     */

                                    private int Code;

                                    public int getCode() {
                                        return Code;
                                    }

                                    public void setCode(int Code) {
                                        this.Code = Code;
                                    }
                                }
                            }

                            public static class PositionBean {
                                /**
                                 * Latitude : 38.541683
                                 * Longitude : 0.121757
                                 */

                                private double Latitude;
                                private double Longitude;

                                public double getLatitude() {
                                    return Latitude;
                                }

                                public void setLatitude(double Latitude) {
                                    this.Latitude = Latitude;
                                }

                                public double getLongitude() {
                                    return Longitude;
                                }

                                public void setLongitude(double Longitude) {
                                    this.Longitude = Longitude;
                                }
                            }

                            public static class CategoryCodesBean {
                                /**
                                 * GuestRoomInfo : {"Quantity":15}
                                 */

                                private GuestRoomInfoBean GuestRoomInfo;

                                public GuestRoomInfoBean getGuestRoomInfo() {
                                    return GuestRoomInfo;
                                }

                                public void setGuestRoomInfo(GuestRoomInfoBean GuestRoomInfo) {
                                    this.GuestRoomInfo = GuestRoomInfo;
                                }

                                public static class GuestRoomInfoBean {
                                    /**
                                     * Quantity : 15
                                     */

                                    private int Quantity;

                                    public int getQuantity() {
                                        return Quantity;
                                    }

                                    public void setQuantity(int Quantity) {
                                        this.Quantity = Quantity;
                                    }
                                }
                            }
                        }

                        public static class PoliciesBean {
                            /**
                             * Policy : {"PolicyInfoCodes":{"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]},"PolicyInfo":{"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}}
                             */

                            private PolicyBean Policy;

                            public PolicyBean getPolicy() {
                                return Policy;
                            }

                            public void setPolicy(PolicyBean Policy) {
                                this.Policy = Policy;
                            }

                            public static class PolicyBean {
                                /**
                                 * PolicyInfoCodes : {"PolicyInfoCode":[{"Description":{"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"2.如遇假日或特殊日期，房间价格可能有所变动，请以最终确认的价格为准；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"3.入住时需要出示政府核发的身份证件（带照片），如护照；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"4.不允许携带宠物入住，请勿在房间内吸烟、酗酒、大声喧哗；"}}},{"Description":{"Text":{"Language":"zh-cn","content":"5.特殊要求视入住时的具体情况而定，可能产生额外的费用，住宿不能保证满足特殊要求。"}}}]}
                                 * PolicyInfo : {"CheckOutTime":"11:00","Description":{"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"},"CheckInTime":"14:00"}
                                 */

                                private PolicyInfoCodesBean PolicyInfoCodes;
                                private PolicyInfoBean PolicyInfo;

                                public PolicyInfoCodesBean getPolicyInfoCodes() {
                                    return PolicyInfoCodes;
                                }

                                public void setPolicyInfoCodes(PolicyInfoCodesBean PolicyInfoCodes) {
                                    this.PolicyInfoCodes = PolicyInfoCodes;
                                }

                                public PolicyInfoBean getPolicyInfo() {
                                    return PolicyInfo;
                                }

                                public void setPolicyInfo(PolicyInfoBean PolicyInfo) {
                                    this.PolicyInfo = PolicyInfo;
                                }

                                public static class PolicyInfoCodesBean {
                                    private List<PolicyInfoCodeBean> PolicyInfoCode;

                                    public List<PolicyInfoCodeBean> getPolicyInfoCode() {
                                        return PolicyInfoCode;
                                    }

                                    public void setPolicyInfoCode(List<PolicyInfoCodeBean> PolicyInfoCode) {
                                        this.PolicyInfoCode = PolicyInfoCode;
                                    }

                                    public static class PolicyInfoCodeBean {
                                        /**
                                         * Description : {"Text":{"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}}
                                         */

                                        private DescriptionBean Description;

                                        public DescriptionBean getDescription() {
                                            return Description;
                                        }

                                        public void setDescription(DescriptionBean Description) {
                                            this.Description = Description;
                                        }

                                        public static class DescriptionBean {
                                            /**
                                             * Text : {"Language":"zh-cn","content":"1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；"}
                                             */

                                            private TextBean Text;

                                            public TextBean getText() {
                                                return Text;
                                            }

                                            public void setText(TextBean Text) {
                                                this.Text = Text;
                                            }

                                            public static class TextBean {
                                                /**
                                                 * Language : zh-cn
                                                 * content : 1.入住时间为下午14点，退房为上午11点,入住时间请不要超过下午24点。如果无法在入住时间内抵达，请务必提前与本店取得联系；
                                                 */

                                                private String Language;
                                                private String content;

                                                public String getLanguage() {
                                                    return Language;
                                                }

                                                public void setLanguage(String Language) {
                                                    this.Language = Language;
                                                }

                                                public String getContent() {
                                                    return content;
                                                }

                                                public void setContent(String content) {
                                                    this.content = content;
                                                }
                                            }
                                        }
                                    }
                                }

                                public static class PolicyInfoBean {
                                    /**
                                     * CheckOutTime : 11:00
                                     * Description : {"xmlns:p8":"http://www.w3.org/2001/XMLSchema-instance","xmlns:q1":"http://www.w3.org/2001/XMLSchema","p8:type":"q1:string","content":"最低入住年龄0岁, 0-6岁儿童免费入住, 7-12岁儿童收费入住"}
                                     * CheckInTime : 14:00
                                     */

                                    private String CheckOutTime;
                                    private DescriptionBeanX Description;
                                    private String CheckInTime;

                                    public String getCheckOutTime() {
                                        return CheckOutTime;
                                    }

                                    public void setCheckOutTime(String CheckOutTime) {
                                        this.CheckOutTime = CheckOutTime;
                                    }

                                    public DescriptionBeanX getDescription() {
                                        return Description;
                                    }

                                    public void setDescription(DescriptionBeanX Description) {
                                        this.Description = Description;
                                    }

                                    public String getCheckInTime() {
                                        return CheckInTime;
                                    }

                                    public void setCheckInTime(String CheckInTime) {
                                        this.CheckInTime = CheckInTime;
                                    }

                                    public static class DescriptionBeanX {
                                        @SerializedName("xmlns:p8")
                                        private String _$XmlnsP888; // FIXME check this code
                                        @SerializedName("xmlns:q1")
                                        private String _$XmlnsQ1240; // FIXME check this code
                                        @SerializedName("p8:type")
                                        private String _$P8Type92; // FIXME check this code
                                        private String content;

                                        public String get_$XmlnsP888() {
                                            return _$XmlnsP888;
                                        }

                                        public void set_$XmlnsP888(String _$XmlnsP888) {
                                            this._$XmlnsP888 = _$XmlnsP888;
                                        }

                                        public String get_$XmlnsQ1240() {
                                            return _$XmlnsQ1240;
                                        }

                                        public void set_$XmlnsQ1240(String _$XmlnsQ1240) {
                                            this._$XmlnsQ1240 = _$XmlnsQ1240;
                                        }

                                        public String get_$P8Type92() {
                                            return _$P8Type92;
                                        }

                                        public void set_$P8Type92(String _$P8Type92) {
                                            this._$P8Type92 = _$P8Type92;
                                        }

                                        public String getContent() {
                                            return content;
                                        }

                                        public void setContent(String content) {
                                            this.content = content;
                                        }
                                    }
                                }
                            }
                        }

                        public static class MultimediaDescriptionsBeanX {
                            /**
                             * MultimediaDescription : {"ImageItems":{"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}}
                             */

                            private MultimediaDescriptionBeanX MultimediaDescription;

                            public MultimediaDescriptionBeanX getMultimediaDescription() {
                                return MultimediaDescription;
                            }

                            public void setMultimediaDescription(MultimediaDescriptionBeanX MultimediaDescription) {
                                this.MultimediaDescription = MultimediaDescription;
                            }

                            public static class MultimediaDescriptionBeanX {
                                /**
                                 * ImageItems : {"ImageItem":[{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}},{"ImageFormat":{"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158745.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}}]}
                                 */

                                private ImageItemsBean ImageItems;

                                public ImageItemsBean getImageItems() {
                                    return ImageItems;
                                }

                                public void setImageItems(ImageItemsBean ImageItems) {
                                    this.ImageItems = ImageItems;
                                }

                                public static class ImageItemsBean {
                                    private List<ImageItemBean> ImageItem;

                                    public List<ImageItemBean> getImageItem() {
                                        return ImageItem;
                                    }

                                    public void setImageItem(List<ImageItemBean> ImageItem) {
                                        this.ImageItem = ImageItem;
                                    }

                                    public static class ImageItemBean {
                                        /**
                                         * ImageFormat : {"URL":"http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ=="}
                                         */

                                        private ImageFormatBean ImageFormat;

                                        public ImageFormatBean getImageFormat() {
                                            return ImageFormat;
                                        }

                                        public void setImageFormat(ImageFormatBean ImageFormat) {
                                            this.ImageFormat = ImageFormat;
                                        }

                                        public static class ImageFormatBean {
                                            /**
                                             * URL : http://qn-fishtrip-img01.fishtrip.cn/system/photo/20160816/house-147135795861158742.jpg?token=nMq5NmyPkrs9m3DNnIQwz9UYNL7RZjfFiTpCZ851:wWx9xPIZiQgi05ViTFpOuF8nMjo=:eyJTIjoicW4tZmlzaHRyaXAtaW1nMDEuZmlzaHRyaXAuY24vc3lzdGVtL3Bob3RvLzIwMTYwODE2L2hvdXNlLTE0NzEzNTc5NTg2MTE1ODc0Mi5qcGciLCJFIjoxNDk0ODM3MzQyfQ==
                                             */

                                            private String URL;

                                            public String getURL() {
                                                return URL;
                                            }

                                            public void setURL(String URL) {
                                                this.URL = URL;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        public static class ContactInfosBean {
                            /**
                             * ContactInfo : {"Addresses":{"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]},"Phones":{"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]},"Emails":{"Email":"phiphi_inn@hotmail.com"}}
                             */

                            private ContactInfoBean ContactInfo;

                            public ContactInfoBean getContactInfo() {
                                return ContactInfo;
                            }

                            public void setContactInfo(ContactInfoBean ContactInfo) {
                                this.ContactInfo = ContactInfo;
                            }

                            public static class ContactInfoBean {
                                /**
                                 * Addresses : {"Address":[{"Language":"zh-cn","CountryName":{"Code":"TH","content":"泰国"},"AddressLine":"130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand","PostalCode":81000,"CityName":"皮皮岛"},{"Language":"en-us","CountryName":{"Code":"TH","content":"Thailand"},"AddressLine":"130 Moo 7, Tonson, aonang, Muang, Krabi Phi Phi Island 81000","PostalCode":81000,"CityName":"Koh-Phi-Phi"}]}
                                 * Phones : {"Phone":[{"PhoneTechType":"Voice","PhoneNumber":"0066-817972088"},{"PhoneTechType":"Fax","PhoneNumber":"0066-817972088"}]}
                                 * Emails : {"Email":"phiphi_inn@hotmail.com"}
                                 */

                                private AddressesBean Addresses;
                                private PhonesBean Phones;
                                private EmailsBean Emails;

                                public AddressesBean getAddresses() {
                                    return Addresses;
                                }

                                public void setAddresses(AddressesBean Addresses) {
                                    this.Addresses = Addresses;
                                }

                                public PhonesBean getPhones() {
                                    return Phones;
                                }

                                public void setPhones(PhonesBean Phones) {
                                    this.Phones = Phones;
                                }

                                public EmailsBean getEmails() {
                                    return Emails;
                                }

                                public void setEmails(EmailsBean Emails) {
                                    this.Emails = Emails;
                                }

                                public static class AddressesBean {
                                    private List<AddressBean> Address;

                                    public List<AddressBean> getAddress() {
                                        return Address;
                                    }

                                    public void setAddress(List<AddressBean> Address) {
                                        this.Address = Address;
                                    }

                                    public static class AddressBean {
                                        /**
                                         * Language : zh-cn
                                         * CountryName : {"Code":"TH","content":"泰国"}
                                         * AddressLine : 130 Moo 7, Tumbon Ao Nang, Amphur Muang, Krabi 81000,Thailand
                                         * PostalCode : 81000
                                         * CityName : 皮皮岛
                                         */

                                        private String Language;
                                        private CountryNameBean CountryName;
                                        private String AddressLine;
                                        private int PostalCode;
                                        private String CityName;

                                        public String getLanguage() {
                                            return Language;
                                        }

                                        public void setLanguage(String Language) {
                                            this.Language = Language;
                                        }

                                        public CountryNameBean getCountryName() {
                                            return CountryName;
                                        }

                                        public void setCountryName(CountryNameBean CountryName) {
                                            this.CountryName = CountryName;
                                        }

                                        public String getAddressLine() {
                                            return AddressLine;
                                        }

                                        public void setAddressLine(String AddressLine) {
                                            this.AddressLine = AddressLine;
                                        }

                                        public int getPostalCode() {
                                            return PostalCode;
                                        }

                                        public void setPostalCode(int PostalCode) {
                                            this.PostalCode = PostalCode;
                                        }

                                        public String getCityName() {
                                            return CityName;
                                        }

                                        public void setCityName(String CityName) {
                                            this.CityName = CityName;
                                        }

                                        public static class CountryNameBean {
                                            /**
                                             * Code : TH
                                             * content : 泰国
                                             */

                                            private String Code;
                                            private String content;

                                            public String getCode() {
                                                return Code;
                                            }

                                            public void setCode(String Code) {
                                                this.Code = Code;
                                            }

                                            public String getContent() {
                                                return content;
                                            }

                                            public void setContent(String content) {
                                                this.content = content;
                                            }
                                        }
                                    }
                                }

                                public static class PhonesBean {
                                    private List<PhoneBean> Phone;

                                    public List<PhoneBean> getPhone() {
                                        return Phone;
                                    }

                                    public void setPhone(List<PhoneBean> Phone) {
                                        this.Phone = Phone;
                                    }

                                    public static class PhoneBean {
                                        /**
                                         * PhoneTechType : Voice
                                         * PhoneNumber : 0066-817972088
                                         */

                                        private String PhoneTechType;
                                        private String PhoneNumber;

                                        public String getPhoneTechType() {
                                            return PhoneTechType;
                                        }

                                        public void setPhoneTechType(String PhoneTechType) {
                                            this.PhoneTechType = PhoneTechType;
                                        }

                                        public String getPhoneNumber() {
                                            return PhoneNumber;
                                        }

                                        public void setPhoneNumber(String PhoneNumber) {
                                            this.PhoneNumber = PhoneNumber;
                                        }
                                    }
                                }

                                public static class EmailsBean {
                                    /**
                                     * Email : phiphi_inn@hotmail.com
                                     */

                                    private String Email;

                                    public String getEmail() {
                                        return Email;
                                    }

                                    public void setEmail(String Email) {
                                        this.Email = Email;
                                    }
                                }
                            }
                        }

                        public static class GDSInfoBean {
                            private List<GDSCodesBean> GDS_Codes;

                            public List<GDSCodesBean> getGDS_Codes() {
                                return GDS_Codes;
                            }

                            public void setGDS_Codes(List<GDSCodesBean> GDS_Codes) {
                                this.GDS_Codes = GDS_Codes;
                            }

                            public static class GDSCodesBean {
                                /**
                                 * GDS_Code : {"GDS_Name":"Sabre","GDS_PropertyCode":1213897}
                                 */

                                private GDSCodeBean GDS_Code;

                                public GDSCodeBean getGDS_Code() {
                                    return GDS_Code;
                                }

                                public void setGDS_Code(GDSCodeBean GDS_Code) {
                                    this.GDS_Code = GDS_Code;
                                }

                                public static class GDSCodeBean {
                                    /**
                                     * GDS_Name : Sabre
                                     * GDS_PropertyCode : 1213897
                                     */

                                    private String GDS_Name;
                                    private int GDS_PropertyCode;

                                    public String getGDS_Name() {
                                        return GDS_Name;
                                    }

                                    public void setGDS_Name(String GDS_Name) {
                                        this.GDS_Name = GDS_Name;
                                    }

                                    public int getGDS_PropertyCode() {
                                        return GDS_PropertyCode;
                                    }

                                    public void setGDS_PropertyCode(int GDS_PropertyCode) {
                                        this.GDS_PropertyCode = GDS_PropertyCode;
                                    }
                                }
                            }
                        }

                        public static class AffiliationInfoBean {
                            /**
                             * Awards : {"Award":{"Rating":4,"RatingSymbol":"Star"}}
                             */

                            private AwardsBean Awards;

                            public AwardsBean getAwards() {
                                return Awards;
                            }

                            public void setAwards(AwardsBean Awards) {
                                this.Awards = Awards;
                            }

                            public static class AwardsBean {
                                /**
                                 * Award : {"Rating":4,"RatingSymbol":"Star"}
                                 */

                                private AwardBean Award;

                                public AwardBean getAward() {
                                    return Award;
                                }

                                public void setAward(AwardBean Award) {
                                    this.Award = Award;
                                }

                                public static class AwardBean {
                                    /**
                                     * Rating : 4
                                     * RatingSymbol : Star
                                     */

                                    private int Rating;
                                    private String RatingSymbol;

                                    public int getRating() {
                                        return Rating;
                                    }

                                    public void setRating(int Rating) {
                                        this.Rating = Rating;
                                    }

                                    public String getRatingSymbol() {
                                        return RatingSymbol;
                                    }

                                    public void setRatingSymbol(String RatingSymbol) {
                                        this.RatingSymbol = RatingSymbol;
                                    }
                                }
                            }
                        }
                    }
                }

                public static class POSBean {
                    /**
                     * Source : {"RequestorID":{"CompanyName":{"CodeContext":10029,"Code":"C"},"Type":1,"MessagePassword":"jtbtest","ID":"jtbtest"}}
                     */

                    private SourceBean Source;

                    public SourceBean getSource() {
                        return Source;
                    }

                    public void setSource(SourceBean Source) {
                        this.Source = Source;
                    }

                    public static class SourceBean {
                        /**
                         * RequestorID : {"CompanyName":{"CodeContext":10029,"Code":"C"},"Type":1,"MessagePassword":"jtbtest","ID":"jtbtest"}
                         */

                        private RequestorIDBean RequestorID;

                        public RequestorIDBean getRequestorID() {
                            return RequestorID;
                        }

                        public void setRequestorID(RequestorIDBean RequestorID) {
                            this.RequestorID = RequestorID;
                        }

                        public static class RequestorIDBean {
                            /**
                             * CompanyName : {"CodeContext":10029,"Code":"C"}
                             * Type : 1
                             * MessagePassword : jtbtest
                             * ID : jtbtest
                             */

                            private CompanyNameBean CompanyName;
                            private int Type;
                            private String MessagePassword;
                            private String ID;

                            public CompanyNameBean getCompanyName() {
                                return CompanyName;
                            }

                            public void setCompanyName(CompanyNameBean CompanyName) {
                                this.CompanyName = CompanyName;
                            }

                            public int getType() {
                                return Type;
                            }

                            public void setType(int Type) {
                                this.Type = Type;
                            }

                            public String getMessagePassword() {
                                return MessagePassword;
                            }

                            public void setMessagePassword(String MessagePassword) {
                                this.MessagePassword = MessagePassword;
                            }

                            public String getID() {
                                return ID;
                            }

                            public void setID(String ID) {
                                this.ID = ID;
                            }

                            public static class CompanyNameBean {
                                /**
                                 * CodeContext : 10029
                                 * Code : C
                                 */

                                private int CodeContext;
                                private String Code;

                                public int getCodeContext() {
                                    return CodeContext;
                                }

                                public void setCodeContext(int CodeContext) {
                                    this.CodeContext = CodeContext;
                                }

                                public String getCode() {
                                    return Code;
                                }

                                public void setCode(String Code) {
                                    this.Code = Code;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
