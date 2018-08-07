package com.usitrip.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.usitrip.pojo.Dict;
import org.apache.ibatis.annotations.*;
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
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;

import javax.annotation.Generated;
import java.util.List;

import static com.usitrip.dao.DictDynamicSqlSupport.*;
import static com.usitrip.dao.HotelRoomTypeDynamicSqlSupport.hotelRoomType;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Mapper
public interface DictMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Dict> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("DictResult")
    Dict selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
//    @Results(id="DictResult", value = {
//            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
//            @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
//            @Result(column="type_name_zh", property="typeNameZh", jdbcType=JdbcType.VARCHAR),
//            @Result(column="hotelId", property="hotelid", jdbcType=JdbcType.INTEGER),
//            @Result(property = "hotelRoomTypes", javaType = List.class, column = "id", many = @Many(select = "com.usitrip.dao.HotelRoomTypeMapper.selectMapByTypeId"))
//    })
    @ResultMap("com.usitrip.dao.DictMapper.DictResult")
    List<Dict> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dict);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dict);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dict)
                .where(dict.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Dict record) {
        return insert(SqlBuilder.insert(record)
                .into(dict)
                .map(dict.id).toProperty("id")
                .map(type).toProperty("type")
                .map(typeName).toProperty("typeName")
                .map(typeNameZh).toProperty("typeNameZh")
                .map(dict.hotelid).toProperty("hotelid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Dict record) {
        return insert(SqlBuilder.insert(record)
                .into(dict)
                .map(dict.id).toPropertyWhenPresent("id", record::getId)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(typeName).toPropertyWhenPresent("typeName", record::getTypeName)
                .map(typeNameZh).toPropertyWhenPresent("typeNameZh", record::getTypeNameZh)
                .map(dict.hotelid).toPropertyWhenPresent("hotelid", record::getHotelid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Dict>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, dict.id, type, typeName, typeNameZh, dict.hotelid)
                .from(dict);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Dict>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, dict.id, type, typeName, typeNameZh, dict.hotelid)
                .from(dict);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Dict selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, dict.id, type, typeName, typeNameZh, dict.hotelid)
                .from(dict)
                .where(dict.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Dict record) {
        return UpdateDSL.updateWithMapper(this::update, dict)
                .set(dict.id).equalTo(record::getId)
                .set(type).equalTo(record::getType)
                .set(typeName).equalTo(record::getTypeName)
                .set(typeNameZh).equalTo(record::getTypeNameZh)
                .set(dict.hotelid).equalTo(record::getHotelid);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Dict record) {
        return UpdateDSL.updateWithMapper(this::update, dict)
                .set(dict.id).equalToWhenPresent(record::getId)
                .set(type).equalToWhenPresent(record::getType)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(typeNameZh).equalToWhenPresent(record::getTypeNameZh)
                .set(dict.hotelid).equalToWhenPresent(record::getHotelid);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Dict record) {
        return UpdateDSL.updateWithMapper(this::update, dict)
                .set(type).equalTo(record::getType)
                .set(typeName).equalTo(record::getTypeName)
                .set(typeNameZh).equalTo(record::getTypeNameZh)
                .set(dict.hotelid).equalTo(record::getHotelid)
                .where(dict.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Dict record) {
        return UpdateDSL.updateWithMapper(this::update, dict)
                .set(type).equalToWhenPresent(record::getType)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(typeNameZh).equalToWhenPresent(record::getTypeNameZh)
                .set(dict.hotelid).equalToWhenPresent(record::getHotelid)
                .where(dict.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default SelectStatementProvider queryByHotelIdWithJoin(Integer hotelId) {
        return select(dict.id, dict.type, dict.typeName, dict.typeNameZh, dict.hotelid, hotelRoomType.id.as("map_id"), hotelRoomType.hotelid.as("map_hotelId"), hotelRoomType.roomTypeId, hotelRoomType.status)
                .from(dict)
                .join(hotelRoomType).on(dict.id, equalTo(hotelRoomType.roomTypeId))
                .where(dict.hotelid, isEqualTo(hotelId))
                .build()
                .render(RenderingStrategy.MYBATIS3);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default SelectStatementProvider queryByIdWithJoin(Integer id, String type) {
        return select(dict.id, dict.type, dict.typeName, dict.typeNameZh, dict.hotelid, hotelRoomType.id.as("map_id"), hotelRoomType.hotelid.as("map_hotelId"), hotelRoomType.roomTypeId, hotelRoomType.status)
                .from(dict)
                .join(hotelRoomType).on(dict.id, equalTo(hotelRoomType.roomTypeId))
                .where(dict.id, isEqualTo(id), and(dict.type, isLikeWhenPresent(type)))
                .build()
                .render(RenderingStrategy.MYBATIS3);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Dict> selectDictByType(String type) {
        SelectStatementProvider selectStatementProvider = select(dict.id, dict.type, dict.typeName, dict.typeNameZh, dict.hotelid)
                                                            .from(dict)
                                                            .where(dict.type, isEqualToWhenPresent(type))
                                                            .build()
                                                            .render(RenderingStrategy.MYBATIS3);

        selectStatementProvider.getParameters().put("limit", 1);
        selectStatementProvider.getParameters().put("offset", 1);


        List<Dict> tLectures = selectByExampleWithLimitAndOffset(selectStatementProvider);
        tLectures.forEach(
                (tLecture) -> {
                    try {
                        new ObjectMapper().writeValueAsString(tLectures);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                }
        );

        return tLectures;
//        return selectStatementProvider;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default WhereClauseProvider createWhereClause(String type) {
        return where(dict.type, isEqualToWhenPresent(type)).and(hotelRoomType.id, isEqualTo(dict.id)).build().render(RenderingStrategy.MYBATIS3, "whereClauseProvider");
    }

    @Select({
            "${selectStatementProvider}",
            "LIMIT #{offset,jdbcType=INTEGER}, #{limit,jdbcType=INTEGER}"
    })
    @ResultMap("com.usitrip.dao.DictMapper.DictResult")
    List<Dict> selectByExampleWithLimitAndOffset(@Param("selectStatementProvider") SelectStatementProvider selectStatementProvider);
}