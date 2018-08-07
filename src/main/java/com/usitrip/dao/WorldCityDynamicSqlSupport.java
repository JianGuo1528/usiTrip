package com.usitrip.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WorldCityDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final WorldCity worldCity = new WorldCity();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = worldCity.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> continent = worldCity.continent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> country = worldCity.country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = worldCity.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> provinceEn = worldCity.provinceEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = worldCity.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cityEn = worldCity.cityEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> area = worldCity.area;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class WorldCity extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> continent = column("continent", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("country", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> provinceEn = column("province_en", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> cityEn = column("city_en", JDBCType.VARCHAR);

        public final SqlColumn<String> area = column("area", JDBCType.VARCHAR);

        public WorldCity() {
            super("world_city");
        }
    }
}