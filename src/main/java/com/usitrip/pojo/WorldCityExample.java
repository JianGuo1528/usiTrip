package com.usitrip.pojo;

import com.rosegun.plugin.Page;
import java.util.ArrayList;
import java.util.List;

public class WorldCityExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<WorldCityExample.Criteria> oredCriteria = new ArrayList();
    protected Page page;

    public WorldCityExample() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<WorldCityExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(WorldCityExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public WorldCityExample.Criteria or() {
        WorldCityExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public WorldCityExample.Criteria createCriteria() {
        WorldCityExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected WorldCityExample.Criteria createCriteriaInternal() {
        WorldCityExample.Criteria criteria = new WorldCityExample.Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return this.page;
    }

    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }

        }

        protected Criterion(String condition, Object value) {
            this(condition, value, (String)null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, (String)null);
        }
    }

    public static class Criteria extends WorldCityExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<WorldCityExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<WorldCityExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<WorldCityExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new WorldCityExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new WorldCityExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new WorldCityExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public WorldCityExample.Criteria andIdIsNull() {
            this.addCriterion("id is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdIsNotNull() {
            this.addCriterion("id is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdEqualTo(Integer value) {
            this.addCriterion("id =", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdNotEqualTo(Integer value) {
            this.addCriterion("id <>", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdGreaterThan(Integer value) {
            this.addCriterion("id >", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("id >=", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdLessThan(Integer value) {
            this.addCriterion("id <", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("id <=", value, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdIn(List<Integer> values) {
            this.addCriterion("id in", values, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdNotIn(List<Integer> values) {
            this.addCriterion("id not in", values, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdBetween(Integer value1, Integer value2) {
            this.addCriterion("id between", value1, value2, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("id not between", value1, value2, "id");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentIsNull() {
            this.addCriterion("continent is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentIsNotNull() {
            this.addCriterion("continent is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentEqualTo(String value) {
            this.addCriterion("continent =", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentNotEqualTo(String value) {
            this.addCriterion("continent <>", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentGreaterThan(String value) {
            this.addCriterion("continent >", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentGreaterThanOrEqualTo(String value) {
            this.addCriterion("continent >=", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentLessThan(String value) {
            this.addCriterion("continent <", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentLessThanOrEqualTo(String value) {
            this.addCriterion("continent <=", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentLike(String value) {
            this.addCriterion("continent like", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentNotLike(String value) {
            this.addCriterion("continent not like", value, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentIn(List<String> values) {
            this.addCriterion("continent in", values, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentNotIn(List<String> values) {
            this.addCriterion("continent not in", values, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentBetween(String value1, String value2) {
            this.addCriterion("continent between", value1, value2, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andContinentNotBetween(String value1, String value2) {
            this.addCriterion("continent not between", value1, value2, "continent");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryIsNull() {
            this.addCriterion("country is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryIsNotNull() {
            this.addCriterion("country is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryEqualTo(String value) {
            this.addCriterion("country =", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryNotEqualTo(String value) {
            this.addCriterion("country <>", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryGreaterThan(String value) {
            this.addCriterion("country >", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryGreaterThanOrEqualTo(String value) {
            this.addCriterion("country >=", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryLessThan(String value) {
            this.addCriterion("country <", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryLessThanOrEqualTo(String value) {
            this.addCriterion("country <=", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryLike(String value) {
            this.addCriterion("country like", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryNotLike(String value) {
            this.addCriterion("country not like", value, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryIn(List<String> values) {
            this.addCriterion("country in", values, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryNotIn(List<String> values) {
            this.addCriterion("country not in", values, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryBetween(String value1, String value2) {
            this.addCriterion("country between", value1, value2, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCountryNotBetween(String value1, String value2) {
            this.addCriterion("country not between", value1, value2, "country");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceIsNull() {
            this.addCriterion("province is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceIsNotNull() {
            this.addCriterion("province is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEqualTo(String value) {
            this.addCriterion("province =", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceNotEqualTo(String value) {
            this.addCriterion("province <>", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceGreaterThan(String value) {
            this.addCriterion("province >", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceGreaterThanOrEqualTo(String value) {
            this.addCriterion("province >=", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceLessThan(String value) {
            this.addCriterion("province <", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceLessThanOrEqualTo(String value) {
            this.addCriterion("province <=", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceLike(String value) {
            this.addCriterion("province like", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceNotLike(String value) {
            this.addCriterion("province not like", value, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceIn(List<String> values) {
            this.addCriterion("province in", values, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceNotIn(List<String> values) {
            this.addCriterion("province not in", values, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceBetween(String value1, String value2) {
            this.addCriterion("province between", value1, value2, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceNotBetween(String value1, String value2) {
            this.addCriterion("province not between", value1, value2, "province");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnIsNull() {
            this.addCriterion("province_en is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnIsNotNull() {
            this.addCriterion("province_en is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnEqualTo(String value) {
            this.addCriterion("province_en =", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnNotEqualTo(String value) {
            this.addCriterion("province_en <>", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnGreaterThan(String value) {
            this.addCriterion("province_en >", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnGreaterThanOrEqualTo(String value) {
            this.addCriterion("province_en >=", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnLessThan(String value) {
            this.addCriterion("province_en <", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnLessThanOrEqualTo(String value) {
            this.addCriterion("province_en <=", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnLike(String value) {
            this.addCriterion("province_en like", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnNotLike(String value) {
            this.addCriterion("province_en not like", value, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnIn(List<String> values) {
            this.addCriterion("province_en in", values, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnNotIn(List<String> values) {
            this.addCriterion("province_en not in", values, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnBetween(String value1, String value2) {
            this.addCriterion("province_en between", value1, value2, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andProvinceEnNotBetween(String value1, String value2) {
            this.addCriterion("province_en not between", value1, value2, "provinceEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityIsNull() {
            this.addCriterion("city is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityIsNotNull() {
            this.addCriterion("city is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEqualTo(String value) {
            this.addCriterion("city =", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityNotEqualTo(String value) {
            this.addCriterion("city <>", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityGreaterThan(String value) {
            this.addCriterion("city >", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityGreaterThanOrEqualTo(String value) {
            this.addCriterion("city >=", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityLessThan(String value) {
            this.addCriterion("city <", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityLessThanOrEqualTo(String value) {
            this.addCriterion("city <=", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityLike(String value) {
            this.addCriterion("city like", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityNotLike(String value) {
            this.addCriterion("city not like", value, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityIn(List<String> values) {
            this.addCriterion("city in", values, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityNotIn(List<String> values) {
            this.addCriterion("city not in", values, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityBetween(String value1, String value2) {
            this.addCriterion("city between", value1, value2, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityNotBetween(String value1, String value2) {
            this.addCriterion("city not between", value1, value2, "city");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnIsNull() {
            this.addCriterion("city_en is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnIsNotNull() {
            this.addCriterion("city_en is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnEqualTo(String value) {
            this.addCriterion("city_en =", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnNotEqualTo(String value) {
            this.addCriterion("city_en <>", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnGreaterThan(String value) {
            this.addCriterion("city_en >", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnGreaterThanOrEqualTo(String value) {
            this.addCriterion("city_en >=", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnLessThan(String value) {
            this.addCriterion("city_en <", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnLessThanOrEqualTo(String value) {
            this.addCriterion("city_en <=", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnLike(String value) {
            this.addCriterion("city_en like", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnNotLike(String value) {
            this.addCriterion("city_en not like", value, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnIn(List<String> values) {
            this.addCriterion("city_en in", values, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnNotIn(List<String> values) {
            this.addCriterion("city_en not in", values, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnBetween(String value1, String value2) {
            this.addCriterion("city_en between", value1, value2, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andCityEnNotBetween(String value1, String value2) {
            this.addCriterion("city_en not between", value1, value2, "cityEn");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaIsNull() {
            this.addCriterion("area is null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaIsNotNull() {
            this.addCriterion("area is not null");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaEqualTo(String value) {
            this.addCriterion("area =", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaNotEqualTo(String value) {
            this.addCriterion("area <>", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaGreaterThan(String value) {
            this.addCriterion("area >", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaGreaterThanOrEqualTo(String value) {
            this.addCriterion("area >=", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaLessThan(String value) {
            this.addCriterion("area <", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaLessThanOrEqualTo(String value) {
            this.addCriterion("area <=", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaLike(String value) {
            this.addCriterion("area like", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaNotLike(String value) {
            this.addCriterion("area not like", value, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaIn(List<String> values) {
            this.addCriterion("area in", values, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaNotIn(List<String> values) {
            this.addCriterion("area not in", values, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaBetween(String value1, String value2) {
            this.addCriterion("area between", value1, value2, "area");
            return (WorldCityExample.Criteria)this;
        }

        public WorldCityExample.Criteria andAreaNotBetween(String value1, String value2) {
            this.addCriterion("area not between", value1, value2, "area");
            return (WorldCityExample.Criteria)this;
        }
    }
}
