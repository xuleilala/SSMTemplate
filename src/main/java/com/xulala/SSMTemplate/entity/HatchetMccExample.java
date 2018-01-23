package com.xulala.SSMTemplate.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HatchetMccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HatchetMccExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMccCodeIsNull() {
            addCriterion("MCC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMccCodeIsNotNull() {
            addCriterion("MCC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMccCodeEqualTo(String value) {
            addCriterion("MCC_CODE =", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeNotEqualTo(String value) {
            addCriterion("MCC_CODE <>", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeGreaterThan(String value) {
            addCriterion("MCC_CODE >", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MCC_CODE >=", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeLessThan(String value) {
            addCriterion("MCC_CODE <", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeLessThanOrEqualTo(String value) {
            addCriterion("MCC_CODE <=", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeLike(String value) {
            addCriterion("MCC_CODE like", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeNotLike(String value) {
            addCriterion("MCC_CODE not like", value, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeIn(List<String> values) {
            addCriterion("MCC_CODE in", values, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeNotIn(List<String> values) {
            addCriterion("MCC_CODE not in", values, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeBetween(String value1, String value2) {
            addCriterion("MCC_CODE between", value1, value2, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccCodeNotBetween(String value1, String value2) {
            addCriterion("MCC_CODE not between", value1, value2, "mccCode");
            return (Criteria) this;
        }

        public Criteria andMccDescIsNull() {
            addCriterion("MCC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMccDescIsNotNull() {
            addCriterion("MCC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMccDescEqualTo(String value) {
            addCriterion("MCC_DESC =", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescNotEqualTo(String value) {
            addCriterion("MCC_DESC <>", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescGreaterThan(String value) {
            addCriterion("MCC_DESC >", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescGreaterThanOrEqualTo(String value) {
            addCriterion("MCC_DESC >=", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescLessThan(String value) {
            addCriterion("MCC_DESC <", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescLessThanOrEqualTo(String value) {
            addCriterion("MCC_DESC <=", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescLike(String value) {
            addCriterion("MCC_DESC like", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescNotLike(String value) {
            addCriterion("MCC_DESC not like", value, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescIn(List<String> values) {
            addCriterion("MCC_DESC in", values, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescNotIn(List<String> values) {
            addCriterion("MCC_DESC not in", values, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescBetween(String value1, String value2) {
            addCriterion("MCC_DESC between", value1, value2, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andMccDescNotBetween(String value1, String value2) {
            addCriterion("MCC_DESC not between", value1, value2, "mccDesc");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIsNull() {
            addCriterion("MAX_FEE is null");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIsNotNull() {
            addCriterion("MAX_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFeeEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE =", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE <>", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeGreaterThan(BigDecimal value) {
            addCriterion("MAX_FEE >", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE >=", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeLessThan(BigDecimal value) {
            addCriterion("MAX_FEE <", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_FEE <=", value, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeIn(List<BigDecimal> values) {
            addCriterion("MAX_FEE in", values, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotIn(List<BigDecimal> values) {
            addCriterion("MAX_FEE not in", values, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_FEE between", value1, value2, "maxFee");
            return (Criteria) this;
        }

        public Criteria andMaxFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_FEE not between", value1, value2, "maxFee");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}