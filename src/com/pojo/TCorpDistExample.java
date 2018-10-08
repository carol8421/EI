package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCorpDistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCorpDistExample() {
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

        public Criteria andDistRegNoIsNull() {
            addCriterion("DIST_REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andDistRegNoIsNotNull() {
            addCriterion("DIST_REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDistRegNoEqualTo(String value) {
            addCriterion("DIST_REG_NO =", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoNotEqualTo(String value) {
            addCriterion("DIST_REG_NO <>", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoGreaterThan(String value) {
            addCriterion("DIST_REG_NO >", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_REG_NO >=", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoLessThan(String value) {
            addCriterion("DIST_REG_NO <", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoLessThanOrEqualTo(String value) {
            addCriterion("DIST_REG_NO <=", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoLike(String value) {
            addCriterion("DIST_REG_NO like", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoNotLike(String value) {
            addCriterion("DIST_REG_NO not like", value, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoIn(List<String> values) {
            addCriterion("DIST_REG_NO in", values, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoNotIn(List<String> values) {
            addCriterion("DIST_REG_NO not in", values, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoBetween(String value1, String value2) {
            addCriterion("DIST_REG_NO between", value1, value2, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistRegNoNotBetween(String value1, String value2) {
            addCriterion("DIST_REG_NO not between", value1, value2, "distRegNo");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNull() {
            addCriterion("DIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNotNull() {
            addCriterion("DIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDistNameEqualTo(String value) {
            addCriterion("DIST_NAME =", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotEqualTo(String value) {
            addCriterion("DIST_NAME <>", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThan(String value) {
            addCriterion("DIST_NAME >", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_NAME >=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThan(String value) {
            addCriterion("DIST_NAME <", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThanOrEqualTo(String value) {
            addCriterion("DIST_NAME <=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLike(String value) {
            addCriterion("DIST_NAME like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotLike(String value) {
            addCriterion("DIST_NAME not like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameIn(List<String> values) {
            addCriterion("DIST_NAME in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotIn(List<String> values) {
            addCriterion("DIST_NAME not in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameBetween(String value1, String value2) {
            addCriterion("DIST_NAME between", value1, value2, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotBetween(String value1, String value2) {
            addCriterion("DIST_NAME not between", value1, value2, "distName");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgIsNull() {
            addCriterion("DIST_BELONG_ORG is null");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgIsNotNull() {
            addCriterion("DIST_BELONG_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgEqualTo(String value) {
            addCriterion("DIST_BELONG_ORG =", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgNotEqualTo(String value) {
            addCriterion("DIST_BELONG_ORG <>", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgGreaterThan(String value) {
            addCriterion("DIST_BELONG_ORG >", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_BELONG_ORG >=", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgLessThan(String value) {
            addCriterion("DIST_BELONG_ORG <", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgLessThanOrEqualTo(String value) {
            addCriterion("DIST_BELONG_ORG <=", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgLike(String value) {
            addCriterion("DIST_BELONG_ORG like", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgNotLike(String value) {
            addCriterion("DIST_BELONG_ORG not like", value, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgIn(List<String> values) {
            addCriterion("DIST_BELONG_ORG in", values, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgNotIn(List<String> values) {
            addCriterion("DIST_BELONG_ORG not in", values, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgBetween(String value1, String value2) {
            addCriterion("DIST_BELONG_ORG between", value1, value2, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistBelongOrgNotBetween(String value1, String value2) {
            addCriterion("DIST_BELONG_ORG not between", value1, value2, "distBelongOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgIsNull() {
            addCriterion("DIST_CORP_ORG is null");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgIsNotNull() {
            addCriterion("DIST_CORP_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgEqualTo(Integer value) {
            addCriterion("DIST_CORP_ORG =", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgNotEqualTo(Integer value) {
            addCriterion("DIST_CORP_ORG <>", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgGreaterThan(Integer value) {
            addCriterion("DIST_CORP_ORG >", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_ORG >=", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgLessThan(Integer value) {
            addCriterion("DIST_CORP_ORG <", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgLessThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_ORG <=", value, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgIn(List<Integer> values) {
            addCriterion("DIST_CORP_ORG in", values, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgNotIn(List<Integer> values) {
            addCriterion("DIST_CORP_ORG not in", values, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_ORG between", value1, value2, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_ORG not between", value1, value2, "distCorpOrg");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdIsNull() {
            addCriterion("DIST_CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdIsNotNull() {
            addCriterion("DIST_CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdEqualTo(Integer value) {
            addCriterion("DIST_CORP_ID =", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdNotEqualTo(Integer value) {
            addCriterion("DIST_CORP_ID <>", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdGreaterThan(Integer value) {
            addCriterion("DIST_CORP_ID >", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_ID >=", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdLessThan(Integer value) {
            addCriterion("DIST_CORP_ID <", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdLessThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_ID <=", value, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdIn(List<Integer> values) {
            addCriterion("DIST_CORP_ID in", values, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdNotIn(List<Integer> values) {
            addCriterion("DIST_CORP_ID not in", values, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_ID between", value1, value2, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_ID not between", value1, value2, "distCorpId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdIsNull() {
            addCriterion("DIST_CORP_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdIsNotNull() {
            addCriterion("DIST_CORP_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdEqualTo(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID =", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdNotEqualTo(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID <>", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdGreaterThan(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID >", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID >=", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdLessThan(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID <", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("DIST_CORP_SEQ_ID <=", value, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdIn(List<Integer> values) {
            addCriterion("DIST_CORP_SEQ_ID in", values, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdNotIn(List<Integer> values) {
            addCriterion("DIST_CORP_SEQ_ID not in", values, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_SEQ_ID between", value1, value2, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andDistCorpSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DIST_CORP_SEQ_ID not between", value1, value2, "distCorpSeqId");
            return (Criteria) this;
        }

        public Criteria andFarePlaceIsNull() {
            addCriterion("FARE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andFarePlaceIsNotNull() {
            addCriterion("FARE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andFarePlaceEqualTo(String value) {
            addCriterion("FARE_PLACE =", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceNotEqualTo(String value) {
            addCriterion("FARE_PLACE <>", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceGreaterThan(String value) {
            addCriterion("FARE_PLACE >", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("FARE_PLACE >=", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceLessThan(String value) {
            addCriterion("FARE_PLACE <", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceLessThanOrEqualTo(String value) {
            addCriterion("FARE_PLACE <=", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceLike(String value) {
            addCriterion("FARE_PLACE like", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceNotLike(String value) {
            addCriterion("FARE_PLACE not like", value, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceIn(List<String> values) {
            addCriterion("FARE_PLACE in", values, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceNotIn(List<String> values) {
            addCriterion("FARE_PLACE not in", values, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceBetween(String value1, String value2) {
            addCriterion("FARE_PLACE between", value1, value2, "farePlace");
            return (Criteria) this;
        }

        public Criteria andFarePlaceNotBetween(String value1, String value2) {
            addCriterion("FARE_PLACE not between", value1, value2, "farePlace");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoIsNull() {
            addCriterion("OPER_MAN_IDENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoIsNotNull() {
            addCriterion("OPER_MAN_IDENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoEqualTo(String value) {
            addCriterion("OPER_MAN_IDENT_NO =", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoNotEqualTo(String value) {
            addCriterion("OPER_MAN_IDENT_NO <>", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoGreaterThan(String value) {
            addCriterion("OPER_MAN_IDENT_NO >", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_MAN_IDENT_NO >=", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoLessThan(String value) {
            addCriterion("OPER_MAN_IDENT_NO <", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoLessThanOrEqualTo(String value) {
            addCriterion("OPER_MAN_IDENT_NO <=", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoLike(String value) {
            addCriterion("OPER_MAN_IDENT_NO like", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoNotLike(String value) {
            addCriterion("OPER_MAN_IDENT_NO not like", value, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoIn(List<String> values) {
            addCriterion("OPER_MAN_IDENT_NO in", values, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoNotIn(List<String> values) {
            addCriterion("OPER_MAN_IDENT_NO not in", values, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoBetween(String value1, String value2) {
            addCriterion("OPER_MAN_IDENT_NO between", value1, value2, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManIdentNoNotBetween(String value1, String value2) {
            addCriterion("OPER_MAN_IDENT_NO not between", value1, value2, "operManIdentNo");
            return (Criteria) this;
        }

        public Criteria andOperManNameIsNull() {
            addCriterion("OPER_MAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperManNameIsNotNull() {
            addCriterion("OPER_MAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperManNameEqualTo(String value) {
            addCriterion("OPER_MAN_NAME =", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameNotEqualTo(String value) {
            addCriterion("OPER_MAN_NAME <>", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameGreaterThan(String value) {
            addCriterion("OPER_MAN_NAME >", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_MAN_NAME >=", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameLessThan(String value) {
            addCriterion("OPER_MAN_NAME <", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameLessThanOrEqualTo(String value) {
            addCriterion("OPER_MAN_NAME <=", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameLike(String value) {
            addCriterion("OPER_MAN_NAME like", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameNotLike(String value) {
            addCriterion("OPER_MAN_NAME not like", value, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameIn(List<String> values) {
            addCriterion("OPER_MAN_NAME in", values, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameNotIn(List<String> values) {
            addCriterion("OPER_MAN_NAME not in", values, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameBetween(String value1, String value2) {
            addCriterion("OPER_MAN_NAME between", value1, value2, "operManName");
            return (Criteria) this;
        }

        public Criteria andOperManNameNotBetween(String value1, String value2) {
            addCriterion("OPER_MAN_NAME not between", value1, value2, "operManName");
            return (Criteria) this;
        }

        public Criteria andFareScopeIsNull() {
            addCriterion("FARE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andFareScopeIsNotNull() {
            addCriterion("FARE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andFareScopeEqualTo(String value) {
            addCriterion("FARE_SCOPE =", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeNotEqualTo(String value) {
            addCriterion("FARE_SCOPE <>", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeGreaterThan(String value) {
            addCriterion("FARE_SCOPE >", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeGreaterThanOrEqualTo(String value) {
            addCriterion("FARE_SCOPE >=", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeLessThan(String value) {
            addCriterion("FARE_SCOPE <", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeLessThanOrEqualTo(String value) {
            addCriterion("FARE_SCOPE <=", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeLike(String value) {
            addCriterion("FARE_SCOPE like", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeNotLike(String value) {
            addCriterion("FARE_SCOPE not like", value, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeIn(List<String> values) {
            addCriterion("FARE_SCOPE in", values, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeNotIn(List<String> values) {
            addCriterion("FARE_SCOPE not in", values, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeBetween(String value1, String value2) {
            addCriterion("FARE_SCOPE between", value1, value2, "fareScope");
            return (Criteria) this;
        }

        public Criteria andFareScopeNotBetween(String value1, String value2) {
            addCriterion("FARE_SCOPE not between", value1, value2, "fareScope");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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