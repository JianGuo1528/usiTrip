package com.usitrip.pojo;

import javax.annotation.Generated;
import java.util.List;

public class Dict {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private List<HotelRoomType> hotelRoomTypes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public List<HotelRoomType> getHotelRoomTypes() {
        return hotelRoomTypes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHotelRoomTypes(List<HotelRoomType> hotelRoomTypes) {
        this.hotelRoomTypes = hotelRoomTypes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String typeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String typeNameZh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer hotelid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(String type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTypeName() {
        return typeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTypeNameZh() {
        return typeNameZh;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTypeNameZh(String typeNameZh) {
        this.typeNameZh = typeNameZh;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHotelid() {
        return hotelid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeNameZh='" + typeNameZh + '\'' +
                ", hotelid=" + hotelid +
                ", hotelRoomTypes=" + hotelRoomTypes +
                '}';
    }
}