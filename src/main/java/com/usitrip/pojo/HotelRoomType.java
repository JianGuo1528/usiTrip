package com.usitrip.pojo;

import org.apache.ibatis.type.Alias;

import javax.annotation.Generated;

public class HotelRoomType {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer hotelid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomTypeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHotelid() {
        return hotelid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HotelRoomType{" +
                "id=" + id +
                ", hotelid=" + hotelid +
                ", roomTypeId=" + roomTypeId +
                ", status=" + status +
                '}';
    }
}