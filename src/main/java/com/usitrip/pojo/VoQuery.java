package com.usitrip.pojo;

public class VoQuery {
    private String countryAndArea;
    private Integer desId;
    private long display;
    private long countryId;
    private String regionType;

    public VoQuery() {
    }

    public String getRegionType() {
        return this.regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getCountryAndArea() {
        return this.countryAndArea;
    }

    public void setCountryAndArea(String countryAndArea) {
        this.countryAndArea = countryAndArea;
    }

    public Integer getDesId() {
        return this.desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    public long getDisplay() {
        return this.display;
    }

    public void setDisplay(long display) {
        this.display = display;
    }

    public long getCountryId() {
        return this.countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }
}
