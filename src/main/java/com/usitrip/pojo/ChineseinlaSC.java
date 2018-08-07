package com.usitrip.pojo;

public class ChineseinlaSC {
    private String category;
    private String phone;

    public ChineseinlaSC() {
    }

    public ChineseinlaSC(String category, String phone) {
        this.category = category;
        this.phone = phone;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
