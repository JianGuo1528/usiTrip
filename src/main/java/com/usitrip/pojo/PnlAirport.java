package com.usitrip.pojo;

public class PnlAirport {
    private String iata;
    private String airportChineseName;
    private String city;
    private String countryAndArea;
    private String airportName;
    private String locationServed;
    private Integer desId;
    private String desName;
    private Integer scenicAreaId;
    private String flag;

    public PnlAirport() {
    }

    public String getIata() {
        return this.iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getAirportChineseName() {
        return this.airportChineseName;
    }

    public void setAirportChineseName(String airportChineseName) {
        this.airportChineseName = airportChineseName;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryAndArea() {
        return this.countryAndArea;
    }

    public void setCountryAndArea(String countryAndArea) {
        this.countryAndArea = countryAndArea;
    }

    public String getAirportName() {
        return this.airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getLocationServed() {
        return this.locationServed;
    }

    public void setLocationServed(String locationServed) {
        this.locationServed = locationServed;
    }

    public Integer getDesId() {
        return this.desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    public String getDesName() {
        return this.desName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public Integer getScenicAreaId() {
        return this.scenicAreaId;
    }

    public void setScenicAreaId(Integer scenicAreaId) {
        this.scenicAreaId = scenicAreaId;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
