package com.usitrip.pojo;

public class WorldCountryRegion {
    private long id;
    private String countryCode;
    private String regionCode;
    private String regionName;
    private String regionNameZh;

    public WorldCountryRegion() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionNameZh() {
        return this.regionNameZh;
    }

    public void setRegionNameZh(String regionNameZh) {
        this.regionNameZh = regionNameZh;
    }
}
