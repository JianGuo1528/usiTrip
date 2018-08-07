package com.usitrip.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HotelRoomTypeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final HotelRoomType hotelRoomType = new HotelRoomType();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = hotelRoomType.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> hotelid = hotelRoomType.hotelid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> roomTypeId = hotelRoomType.roomTypeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = hotelRoomType.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class HotelRoomType extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> hotelid = column("hotelId", JDBCType.INTEGER);

        public final SqlColumn<Integer> roomTypeId = column("room_type_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public HotelRoomType() {
            super("eb_hotel_room_type");
        }
    }
}