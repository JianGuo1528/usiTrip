package com.usitrip.dao;

import com.usitrip.pojo.ChineseinlaSF;

import java.util.List;

public interface ChineseinlaSFMapper {
    void insertNewPhoneContact(List<ChineseinlaSF> list);
    void insertNewEmailContact(List<ChineseinlaSF> list);
    void insertNewWechatContact(List<ChineseinlaSF> list);
}
