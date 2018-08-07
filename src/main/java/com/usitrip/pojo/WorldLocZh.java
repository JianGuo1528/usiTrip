package com.usitrip.pojo;

public class WorldLocZh {
    private long id;
    private String locName;
    private String locNameZh;
    private String country;

    public WorldLocZh() {
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocName() {
        return this.locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocNameZh() {
        return this.locNameZh;
    }

    public void setLocNameZh(String locNameZh) {
        this.locNameZh = locNameZh;
    }
}
