package com.usitrip.pojo;

import javax.annotation.Generated;

public class WorldCity {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String continent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String provinceEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cityEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String area;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
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
    public String getProvince() {
        return province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProvince(String province) {
        this.province = province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProvinceEn() {
        return provinceEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProvinceEn(String provinceEn) {
        this.provinceEn = provinceEn;
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
    public String getArea() {
        return area;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "WorldCity{" +
                "id=" + id +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", provinceEn='" + provinceEn + '\'' +
                ", city='" + city + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}