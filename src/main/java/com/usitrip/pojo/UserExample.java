package com.usitrip.pojo;

import com.rosegun.plugin.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<UserExample.Criteria> oredCriteria = new ArrayList();
    protected Page page;

    public UserExample() {
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

    public List<UserExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(UserExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public UserExample.Criteria or() {
        UserExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public UserExample.Criteria createCriteria() {
        UserExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected UserExample.Criteria createCriteriaInternal() {
        UserExample.Criteria criteria = new UserExample.Criteria();
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

    public static class Criteria extends UserExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<UserExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<UserExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<UserExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new UserExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new UserExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new UserExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public UserExample.Criteria andUserIdIsNull() {
            this.addCriterion("user_id is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdIsNotNull() {
            this.addCriterion("user_id is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdEqualTo(Integer value) {
            this.addCriterion("user_id =", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotEqualTo(Integer value) {
            this.addCriterion("user_id <>", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdGreaterThan(Integer value) {
            this.addCriterion("user_id >", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("user_id >=", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdLessThan(Integer value) {
            this.addCriterion("user_id <", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("user_id <=", value, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdIn(List<Integer> values) {
            this.addCriterion("user_id in", values, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotIn(List<Integer> values) {
            this.addCriterion("user_id not in", values, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id between", value1, value2, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id not between", value1, value2, "userId");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIsNull() {
            this.addCriterion("user_name is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIsNotNull() {
            this.addCriterion("user_name is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameEqualTo(String value) {
            this.addCriterion("user_name =", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotEqualTo(String value) {
            this.addCriterion("user_name <>", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameGreaterThan(String value) {
            this.addCriterion("user_name >", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameGreaterThanOrEqualTo(String value) {
            this.addCriterion("user_name >=", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLessThan(String value) {
            this.addCriterion("user_name <", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLessThanOrEqualTo(String value) {
            this.addCriterion("user_name <=", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameLike(String value) {
            this.addCriterion("user_name like", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotLike(String value) {
            this.addCriterion("user_name not like", value, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameIn(List<String> values) {
            this.addCriterion("user_name in", values, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotIn(List<String> values) {
            this.addCriterion("user_name not in", values, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameBetween(String value1, String value2) {
            this.addCriterion("user_name between", value1, value2, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andUserNameNotBetween(String value1, String value2) {
            this.addCriterion("user_name not between", value1, value2, "userName");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordIsNull() {
            this.addCriterion("api_password is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordIsNotNull() {
            this.addCriterion("api_password is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordEqualTo(String value) {
            this.addCriterion("api_password =", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordNotEqualTo(String value) {
            this.addCriterion("api_password <>", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordGreaterThan(String value) {
            this.addCriterion("api_password >", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordGreaterThanOrEqualTo(String value) {
            this.addCriterion("api_password >=", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordLessThan(String value) {
            this.addCriterion("api_password <", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordLessThanOrEqualTo(String value) {
            this.addCriterion("api_password <=", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordLike(String value) {
            this.addCriterion("api_password like", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordNotLike(String value) {
            this.addCriterion("api_password not like", value, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordIn(List<String> values) {
            this.addCriterion("api_password in", values, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordNotIn(List<String> values) {
            this.addCriterion("api_password not in", values, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordBetween(String value1, String value2) {
            this.addCriterion("api_password between", value1, value2, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andApiPasswordNotBetween(String value1, String value2) {
            this.addCriterion("api_password not between", value1, value2, "apiPassword");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIsNull() {
            this.addCriterion("password is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIsNotNull() {
            this.addCriterion("password is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordEqualTo(String value) {
            this.addCriterion("password =", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotEqualTo(String value) {
            this.addCriterion("password <>", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordGreaterThan(String value) {
            this.addCriterion("password >", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            this.addCriterion("password >=", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLessThan(String value) {
            this.addCriterion("password <", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            this.addCriterion("password <=", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordLike(String value) {
            this.addCriterion("password like", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotLike(String value) {
            this.addCriterion("password not like", value, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordIn(List<String> values) {
            this.addCriterion("password in", values, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotIn(List<String> values) {
            this.addCriterion("password not in", values, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordBetween(String value1, String value2) {
            this.addCriterion("password between", value1, value2, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andPasswordNotBetween(String value1, String value2) {
            this.addCriterion("password not between", value1, value2, "password");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameIsNull() {
            this.addCriterion("name is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameIsNotNull() {
            this.addCriterion("name is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameEqualTo(String value) {
            this.addCriterion("name =", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameNotEqualTo(String value) {
            this.addCriterion("name <>", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameGreaterThan(String value) {
            this.addCriterion("name >", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            this.addCriterion("name >=", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameLessThan(String value) {
            this.addCriterion("name <", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameLessThanOrEqualTo(String value) {
            this.addCriterion("name <=", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameLike(String value) {
            this.addCriterion("name like", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameNotLike(String value) {
            this.addCriterion("name not like", value, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameIn(List<String> values) {
            this.addCriterion("name in", values, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameNotIn(List<String> values) {
            this.addCriterion("name not in", values, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameBetween(String value1, String value2) {
            this.addCriterion("name between", value1, value2, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andNameNotBetween(String value1, String value2) {
            this.addCriterion("name not between", value1, value2, "name");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneIsNull() {
            this.addCriterion("tel_phone is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneIsNotNull() {
            this.addCriterion("tel_phone is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneEqualTo(String value) {
            this.addCriterion("tel_phone =", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneNotEqualTo(String value) {
            this.addCriterion("tel_phone <>", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneGreaterThan(String value) {
            this.addCriterion("tel_phone >", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            this.addCriterion("tel_phone >=", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneLessThan(String value) {
            this.addCriterion("tel_phone <", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneLessThanOrEqualTo(String value) {
            this.addCriterion("tel_phone <=", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneLike(String value) {
            this.addCriterion("tel_phone like", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneNotLike(String value) {
            this.addCriterion("tel_phone not like", value, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneIn(List<String> values) {
            this.addCriterion("tel_phone in", values, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneNotIn(List<String> values) {
            this.addCriterion("tel_phone not in", values, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneBetween(String value1, String value2) {
            this.addCriterion("tel_phone between", value1, value2, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andTelPhoneNotBetween(String value1, String value2) {
            this.addCriterion("tel_phone not between", value1, value2, "telPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneIsNull() {
            this.addCriterion("cell_phone is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneIsNotNull() {
            this.addCriterion("cell_phone is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneEqualTo(String value) {
            this.addCriterion("cell_phone =", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneNotEqualTo(String value) {
            this.addCriterion("cell_phone <>", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneGreaterThan(String value) {
            this.addCriterion("cell_phone >", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneGreaterThanOrEqualTo(String value) {
            this.addCriterion("cell_phone >=", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneLessThan(String value) {
            this.addCriterion("cell_phone <", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneLessThanOrEqualTo(String value) {
            this.addCriterion("cell_phone <=", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneLike(String value) {
            this.addCriterion("cell_phone like", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneNotLike(String value) {
            this.addCriterion("cell_phone not like", value, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneIn(List<String> values) {
            this.addCriterion("cell_phone in", values, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneNotIn(List<String> values) {
            this.addCriterion("cell_phone not in", values, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneBetween(String value1, String value2) {
            this.addCriterion("cell_phone between", value1, value2, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCellPhoneNotBetween(String value1, String value2) {
            this.addCriterion("cell_phone not between", value1, value2, "cellPhone");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailIsNull() {
            this.addCriterion("email is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailIsNotNull() {
            this.addCriterion("email is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailEqualTo(String value) {
            this.addCriterion("email =", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailNotEqualTo(String value) {
            this.addCriterion("email <>", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailGreaterThan(String value) {
            this.addCriterion("email >", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
            this.addCriterion("email >=", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailLessThan(String value) {
            this.addCriterion("email <", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailLessThanOrEqualTo(String value) {
            this.addCriterion("email <=", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailLike(String value) {
            this.addCriterion("email like", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailNotLike(String value) {
            this.addCriterion("email not like", value, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailIn(List<String> values) {
            this.addCriterion("email in", values, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailNotIn(List<String> values) {
            this.addCriterion("email not in", values, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailBetween(String value1, String value2) {
            this.addCriterion("email between", value1, value2, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andEmailNotBetween(String value1, String value2) {
            this.addCriterion("email not between", value1, value2, "email");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtIsNull() {
            this.addCriterion("created_at is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtIsNotNull() {
            this.addCriterion("created_at is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtEqualTo(Date value) {
            this.addCriterion("created_at =", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtNotEqualTo(Date value) {
            this.addCriterion("created_at <>", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtGreaterThan(Date value) {
            this.addCriterion("created_at >", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            this.addCriterion("created_at >=", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtLessThan(Date value) {
            this.addCriterion("created_at <", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            this.addCriterion("created_at <=", value, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtIn(List<Date> values) {
            this.addCriterion("created_at in", values, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtNotIn(List<Date> values) {
            this.addCriterion("created_at not in", values, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtBetween(Date value1, Date value2) {
            this.addCriterion("created_at between", value1, value2, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            this.addCriterion("created_at not between", value1, value2, "createdAt");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleIsNull() {
            this.addCriterion("role is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleIsNotNull() {
            this.addCriterion("role is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleEqualTo(Integer value) {
            this.addCriterion("role =", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleNotEqualTo(Integer value) {
            this.addCriterion("role <>", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleGreaterThan(Integer value) {
            this.addCriterion("role >", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("role >=", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleLessThan(Integer value) {
            this.addCriterion("role <", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleLessThanOrEqualTo(Integer value) {
            this.addCriterion("role <=", value, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleIn(List<Integer> values) {
            this.addCriterion("role in", values, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleNotIn(List<Integer> values) {
            this.addCriterion("role not in", values, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleBetween(Integer value1, Integer value2) {
            this.addCriterion("role between", value1, value2, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andRoleNotBetween(Integer value1, Integer value2) {
            this.addCriterion("role not between", value1, value2, "role");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusIsNull() {
            this.addCriterion("status is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusIsNotNull() {
            this.addCriterion("status is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusEqualTo(Integer value) {
            this.addCriterion("status =", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusNotEqualTo(Integer value) {
            this.addCriterion("status <>", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusGreaterThan(Integer value) {
            this.addCriterion("status >", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("status >=", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusLessThan(Integer value) {
            this.addCriterion("status <", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
            this.addCriterion("status <=", value, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusIn(List<Integer> values) {
            this.addCriterion("status in", values, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusNotIn(List<Integer> values) {
            this.addCriterion("status not in", values, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusBetween(Integer value1, Integer value2) {
            this.addCriterion("status between", value1, value2, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
            this.addCriterion("status not between", value1, value2, "status");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainIsNull() {
            this.addCriterion("hotel_chain is null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainIsNotNull() {
            this.addCriterion("hotel_chain is not null");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainEqualTo(String value) {
            this.addCriterion("hotel_chain =", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainNotEqualTo(String value) {
            this.addCriterion("hotel_chain <>", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainGreaterThan(String value) {
            this.addCriterion("hotel_chain >", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainGreaterThanOrEqualTo(String value) {
            this.addCriterion("hotel_chain >=", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainLessThan(String value) {
            this.addCriterion("hotel_chain <", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainLessThanOrEqualTo(String value) {
            this.addCriterion("hotel_chain <=", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainLike(String value) {
            this.addCriterion("hotel_chain like", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainNotLike(String value) {
            this.addCriterion("hotel_chain not like", value, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainIn(List<String> values) {
            this.addCriterion("hotel_chain in", values, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainNotIn(List<String> values) {
            this.addCriterion("hotel_chain not in", values, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainBetween(String value1, String value2) {
            this.addCriterion("hotel_chain between", value1, value2, "hotelChain");
            return (UserExample.Criteria)this;
        }

        public UserExample.Criteria andHotelChainNotBetween(String value1, String value2) {
            this.addCriterion("hotel_chain not between", value1, value2, "hotelChain");
            return (UserExample.Criteria)this;
        }
    }
}
