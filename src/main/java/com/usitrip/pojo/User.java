package com.usitrip.pojo;

import java.util.Date;

public class User {
    private Integer userId;
    private String userName;
    private String apiPassword;
    private String password;
    private String name;
    private String telPhone;
    private String cellPhone;
    private String email;
    private Date createdAt;
    private Integer role;
    private Integer status;
    private String hotelChain;

    public User() {
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getApiPassword() {
        return this.apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelPhone() {
        return this.telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getCellPhone() {
        return this.cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHotelChain() {
        return this.hotelChain;
    }

    public void setHotelChain(String hotelChain) {
        this.hotelChain = hotelChain;
    }

    public String toString() {
        return "User{userId=" + this.userId + ", userName='" + this.userName + '\'' + ", apiPassword='" + this.apiPassword + '\'' + ", password='" + this.password + '\'' + ", name='" + this.name + '\'' + ", telPhone='" + this.telPhone + '\'' + ", cellPhone='" + this.cellPhone + '\'' + ", email='" + this.email + '\'' + ", createdAt=" + this.createdAt + ", role=" + this.role + ", status=" + this.status + ", hotelChain='" + this.hotelChain + '\'' + '}';
    }
}
