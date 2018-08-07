package com.usitrip.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DictDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Dict dict = new Dict();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = dict.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> type = dict.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> typeName = dict.typeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> typeNameZh = dict.typeNameZh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> hotelid = dict.hotelid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Dict extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> typeName = column("type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> typeNameZh = column("type_name_zh", JDBCType.VARCHAR);

        public final SqlColumn<Integer> hotelid = column("hotelId", JDBCType.INTEGER);

        public Dict() {
            super("eb_dict");
        }
    }
}