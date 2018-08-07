package com.usitrip.pojo;

import javax.annotation.Generated;

public class WorldCityAbroad {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer 已采;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer 已发;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String continent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cityEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pageurl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer get已采() {
        return 已采;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void set已采(Integer 已采) {
        this.已采 = 已采;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer get已发() {
        return 已发;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void set已发(Integer 已发) {
        this.已发 = 已发;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContinent() {
        return continent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCountry() {
        return country;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCountry(String country) {
        this.country = country;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCity() {
        return city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCity(String city) {
        this.city = city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCityEn() {
        return cityEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPageurl() {
        return pageurl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

    @Override
    public String toString() {
        return "WorldCityAbroad{" +
                "id=" + id +
                ", 已采=" + 已采 +
                ", 已发=" + 已发 +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", pageurl='" + pageurl + '\'' +
                '}';
    }
}