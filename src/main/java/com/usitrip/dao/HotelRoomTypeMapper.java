package com.usitrip.dao;

import static com.usitrip.dao.HotelRoomTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.usitrip.pojo.HotelRoomType;
import java.util.List;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface HotelRoomTypeMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HotelRoomType> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HotelRoomTypeResult")
    HotelRoomType selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HotelRoomTypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hotelId", property="hotelid", jdbcType=JdbcType.INTEGER),
        @Result(column="room_type_id", property="roomTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<HotelRoomType> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(hotelRoomType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, hotelRoomType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, hotelRoomType)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HotelRoomType record) {
        return insert(SqlBuilder.insert(record)
                .into(hotelRoomType)
                .map(id).toProperty("id")
                .map(hotelid).toProperty("hotelid")
                .map(roomTypeId).toProperty("roomTypeId")
                .map(status).toProperty("status")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HotelRoomType record) {
        return insert(SqlBuilder.insert(record)
                .into(hotelRoomType)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(hotelid).toPropertyWhenPresent("hotelid", record::getHotelid)
                .map(roomTypeId).toPropertyWhenPresent("roomTypeId", record::getRoomTypeId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HotelRoomType>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, hotelid, roomTypeId, status)
                .from(hotelRoomType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HotelRoomType>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, hotelid, roomTypeId, status)
                .from(hotelRoomType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HotelRoomType selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, hotelid, roomTypeId, status)
                .from(hotelRoomType)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HotelRoomType record) {
        return UpdateDSL.updateWithMapper(this::update, hotelRoomType)
                .set(id).equalTo(record::getId)
                .set(hotelid).equalTo(record::getHotelid)
                .set(roomTypeId).equalTo(record::getRoomTypeId)
                .set(status).equalTo(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HotelRoomType record) {
        return UpdateDSL.updateWithMapper(this::update, hotelRoomType)
                .set(id).equalToWhenPresent(record::getId)
                .set(hotelid).equalToWhenPresent(record::getHotelid)
                .set(roomTypeId).equalToWhenPresent(record::getRoomTypeId)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HotelRoomType record) {
        return UpdateDSL.updateWithMapper(this::update, hotelRoomType)
                .set(hotelid).equalTo(record::getHotelid)
                .set(roomTypeId).equalTo(record::getRoomTypeId)
                .set(status).equalTo(record::getStatus)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HotelRoomType record) {
        return UpdateDSL.updateWithMapper(this::update, hotelRoomType)
                .set(hotelid).equalToWhenPresent(record::getHotelid)
                .set(roomTypeId).equalToWhenPresent(record::getRoomTypeId)
                .set(status).equalToWhenPresent(record::getStatus)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Select("select * from eb_hotel_room_type where room_type_id = #{typeId}")
    List<HotelRoomType> selectMapByTypeId(Integer typeId);
}