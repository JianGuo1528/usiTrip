package com.usitrip.dao;

import static com.usitrip.dao.WorldCityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.usitrip.pojo.WorldCity;
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
public interface WorldCityMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WorldCity> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WorldCityResult")
    WorldCity selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WorldCityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="continent", property="continent", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_en", property="provinceEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_en", property="cityEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR)
    })
    List<WorldCity> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(worldCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(WorldCity record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCity)
                .map(id).toProperty("id")
                .map(continent).toProperty("continent")
                .map(country).toProperty("country")
                .map(province).toProperty("province")
                .map(provinceEn).toProperty("provinceEn")
                .map(city).toProperty("city")
                .map(cityEn).toProperty("cityEn")
                .map(area).toProperty("area")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(WorldCity record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCity)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(continent).toPropertyWhenPresent("continent", record::getContinent)
                .map(country).toPropertyWhenPresent("country", record::getCountry)
                .map(province).toPropertyWhenPresent("province", record::getProvince)
                .map(provinceEn).toPropertyWhenPresent("provinceEn", record::getProvinceEn)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(cityEn).toPropertyWhenPresent("cityEn", record::getCityEn)
                .map(area).toPropertyWhenPresent("area", record::getArea)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, continent, country, province, provinceEn, city, cityEn, area)
                .from(worldCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, continent, country, province, provinceEn, city, cityEn, area)
                .from(worldCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default WorldCity selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, continent, country, province, provinceEn, city, cityEn, area)
                .from(worldCity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(WorldCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCity)
                .set(id).equalTo(record::getId)
                .set(continent).equalTo(record::getContinent)
                .set(country).equalTo(record::getCountry)
                .set(province).equalTo(record::getProvince)
                .set(provinceEn).equalTo(record::getProvinceEn)
                .set(city).equalTo(record::getCity)
                .set(cityEn).equalTo(record::getCityEn)
                .set(area).equalTo(record::getArea);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(WorldCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCity)
                .set(id).equalToWhenPresent(record::getId)
                .set(continent).equalToWhenPresent(record::getContinent)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(provinceEn).equalToWhenPresent(record::getProvinceEn)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityEn).equalToWhenPresent(record::getCityEn)
                .set(area).equalToWhenPresent(record::getArea);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(WorldCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCity)
                .set(continent).equalTo(record::getContinent)
                .set(country).equalTo(record::getCountry)
                .set(province).equalTo(record::getProvince)
                .set(provinceEn).equalTo(record::getProvinceEn)
                .set(city).equalTo(record::getCity)
                .set(cityEn).equalTo(record::getCityEn)
                .set(area).equalTo(record::getArea)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(WorldCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCity)
                .set(continent).equalToWhenPresent(record::getContinent)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(provinceEn).equalToWhenPresent(record::getProvinceEn)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityEn).equalToWhenPresent(record::getCityEn)
                .set(area).equalToWhenPresent(record::getArea)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}