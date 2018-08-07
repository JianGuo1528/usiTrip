package com.usitrip.pojo;

import java.util.Date;

public class Operation {
    private Integer id;
    private Integer userId;
    private Date date;
    private String method;
    private String request;
    private String response;

    public Operation() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String toString() {
        return "Operation{id=" + this.id + ", userId=" + this.userId + ", date=" + this.date + ", method='" + this.method + '\'' + ", request='" + this.request + '\'' + ", response='" + this.response + '\'' + '}';
    }
}
