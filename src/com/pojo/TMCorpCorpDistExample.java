package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMCorpCorpDistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMCorpCorpDistExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(Integer value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Integer value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Integer value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Integer value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Integer> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Integer> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(Integer value) {
            addCriterion("ORG =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(Integer value) {
            addCriterion("ORG <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(Integer value) {
            addCriterion("ORG >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(Integer value) {
            addCriterion("ORG <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(Integer value) {
            addCriterion("ORG <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<Integer> values) {
            addCriterion("ORG in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<Integer> values) {
            addCriterion("ORG not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(Integer value1, Integer value2) {
            addCriterion("ORG between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andSubUuidIsNull() {
            addCriterion("SUB_UUID is null");
            return (Criteria) this;
        }

        public Criteria andSubUuidIsNotNull() {
            addCriterion("SUB_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andSubUuidEqualTo(String value) {
            addCriterion("SUB_UUID =", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidNotEqualTo(String value) {
            addCriterion("SUB_UUID <>", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidGreaterThan(String value) {
            addCriterion("SUB_UUID >", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_UUID >=", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidLessThan(String value) {
            addCriterion("SUB_UUID <", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidLessThanOrEqualTo(String value) {
            addCriterion("SUB_UUID <=", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidLike(String value) {
            addCriterion("SUB_UUID like", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidNotLike(String value) {
            addCriterion("SUB_UUID not like", value, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidIn(List<String> values) {
            addCriterion("SUB_UUID in", values, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidNotIn(List<String> values) {
            addCriterion("SUB_UUID not in", values, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidBetween(String value1, String value2) {
            addCriterion("SUB_UUID between", value1, value2, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubUuidNotBetween(String value1, String value2) {
            addCriterion("SUB_UUID not between", value1, value2, "subUuid");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNull() {
            addCriterion("SUB_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("SUB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Integer value) {
            addCriterion("SUB_ID =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Integer value) {
            addCriterion("SUB_ID <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Integer value) {
            addCriterion("SUB_ID >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_ID >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Integer value) {
            addCriterion("SUB_ID <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_ID <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Integer> values) {
            addCriterion("SUB_ID in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Integer> values) {
            addCriterion("SUB_ID not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_ID between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_ID not between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdIsNull() {
            addCriterion("SUB_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdIsNotNull() {
            addCriterion("SUB_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdEqualTo(Integer value) {
            addCriterion("SUB_SEQ_ID =", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdNotEqualTo(Integer value) {
            addCriterion("SUB_SEQ_ID <>", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdGreaterThan(Integer value) {
            addCriterion("SUB_SEQ_ID >", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_SEQ_ID >=", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdLessThan(Integer value) {
            addCriterion("SUB_SEQ_ID <", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_SEQ_ID <=", value, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdIn(List<Integer> values) {
            addCriterion("SUB_SEQ_ID in", values, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdNotIn(List<Integer> values) {
            addCriterion("SUB_SEQ_ID not in", values, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_SEQ_ID between", value1, value2, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_SEQ_ID not between", value1, value2, "subSeqId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIsNull() {
            addCriterion("SUB_ORG is null");
            return (Criteria) this;
        }

        public Criteria andSubOrgIsNotNull() {
            addCriterion("SUB_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrgEqualTo(Integer value) {
            addCriterion("SUB_ORG =", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgNotEqualTo(Integer value) {
            addCriterion("SUB_ORG <>", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgGreaterThan(Integer value) {
            addCriterion("SUB_ORG >", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_ORG >=", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgLessThan(Integer value) {
            addCriterion("SUB_ORG <", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_ORG <=", value, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgIn(List<Integer> values) {
            addCriterion("SUB_ORG in", values, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgNotIn(List<Integer> values) {
            addCriterion("SUB_ORG not in", values, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgBetween(Integer value1, Integer value2) {
            addCriterion("SUB_ORG between", value1, value2, "subOrg");
            return (Criteria) this;
        }

        public Criteria andSubOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_ORG not between", value1, value2, "subOrg");
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