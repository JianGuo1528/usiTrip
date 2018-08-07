package com.usitrip.dao;

import com.usitrip.pojo.WorldCityAbroad;
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

import javax.annotation.Generated;
import java.util.List;

import static com.usitrip.dao.WorldCityAbroadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface WorldCityAbroadMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WorldCityAbroad> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WorldCityAbroadResult")
    WorldCityAbroad selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WorldCityAbroadResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="已采", property="已采", jdbcType=JdbcType.INTEGER),
        @Result(column="已发", property="已发", jdbcType=JdbcType.INTEGER),
        @Result(column="continent", property="continent", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_en", property="cityEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PageUrl", property="pageurl", jdbcType=JdbcType.VARCHAR)
    })
    List<WorldCityAbroad> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(worldCityAbroad);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCityAbroad);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCityAbroad)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(WorldCityAbroad record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCityAbroad)
                .map(id).toProperty("id")
                .map(已采).toProperty("已采")
                .map(已发).toProperty("已发")
                .map(continent).toProperty("continent")
                .map(country).toProperty("country")
                .map(city).toProperty("city")
                .map(cityEn).toProperty("cityEn")
                .map(pageurl).toProperty("pageurl")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(WorldCityAbroad record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCityAbroad)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(已采).toPropertyWhenPresent("已采", record::get已采)
                .map(已发).toPropertyWhenPresent("已发", record::get已发)
                .map(continent).toPropertyWhenPresent("continent", record::getContinent)
                .map(country).toPropertyWhenPresent("country", record::getCountry)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(cityEn).toPropertyWhenPresent("cityEn", record::getCityEn)
                .map(pageurl).toPropertyWhenPresent("pageurl", record::getPageurl)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCityAbroad>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, 已采, 已发, continent, country, city, cityEn, pageurl)
                .from(worldCityAbroad);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCityAbroad>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, 已采, 已发, continent, country, city, cityEn, pageurl)
                .from(worldCityAbroad);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default WorldCityAbroad selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, 已采, 已发, continent, country, city, cityEn, pageurl)
                .from(worldCityAbroad)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(WorldCityAbroad record) {
        return UpdateDSL.updateWithMapper(this::update, worldCityAbroad)
                .set(id).equalTo(record::getId)
                .set(已采).equalTo(record::get已采)
                .set(已发).equalTo(record::get已发)
                .set(continent).equalTo(record::getContinent)
                .set(country).equalTo(record::getCountry)
                .set(city).equalTo(record::getCity)
                .set(cityEn).equalTo(record::getCityEn)
                .set(pageurl).equalTo(record::getPageurl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(WorldCityAbroad record) {
        return UpdateDSL.updateWithMapper(this::update, worldCityAbroad)
                .set(id).equalToWhenPresent(record::getId)
                .set(已采).equalToWhenPresent(record::get已采)
                .set(已发).equalToWhenPresent(record::get已发)
                .set(continent).equalToWhenPresent(record::getContinent)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityEn).equalToWhenPresent(record::getCityEn)
                .set(pageurl).equalToWhenPresent(record::getPageurl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(WorldCityAbroad record) {
        return UpdateDSL.updateWithMapper(this::update, worldCityAbroad)
                .set(已采).equalTo(record::get已采)
                .set(已发).equalTo(record::get已发)
                .set(continent).equalTo(record::getContinent)
                .set(country).equalTo(record::getCountry)
                .set(city).equalTo(record::getCity)
                .set(cityEn).equalTo(record::getCityEn)
                .set(pageurl).equalTo(record::getPageurl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(WorldCityAbroad record) {
        return UpdateDSL.updateWithMapper(this::update, worldCityAbroad)
                .set(已采).equalToWhenPresent(record::get已采)
                .set(已发).equalToWhenPresent(record::get已发)
                .set(continent).equalToWhenPresent(record::getContinent)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityEn).equalToWhenPresent(record::getCityEn)
                .set(pageurl).equalToWhenPresent(record::getPageurl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Select("select * from world_city_abroad limit #{offset},#{limit}")
    @ResultMap("WorldCityAbroadResult")
    List<WorldCityAbroad> selectByPage(@Param("offset") Integer offset, @Param("limit") Integer limit);
}