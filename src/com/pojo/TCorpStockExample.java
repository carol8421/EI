package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCorpStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCorpStockExample() {
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

        public Criteria andStockTypeIsNull() {
            addCriterion("STOCK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("STOCK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("STOCK_TYPE =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("STOCK_TYPE <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("STOCK_TYPE >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_TYPE >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("STOCK_TYPE <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("STOCK_TYPE <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("STOCK_TYPE like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("STOCK_TYPE not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("STOCK_TYPE in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("STOCK_TYPE not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("STOCK_TYPE between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("STOCK_TYPE not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("CERTIFICATE_TYPE like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("CERTIFICATE_TYPE not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("CERTIFICATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("CERTIFICATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("CERTIFICATE_NO =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("CERTIFICATE_NO >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("CERTIFICATE_NO <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("CERTIFICATE_NO like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("CERTIFICATE_NO not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("CERTIFICATE_NO in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NO not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("STOCK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("STOCK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("STOCK_NAME =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("STOCK_NAME <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("STOCK_NAME >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_NAME >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("STOCK_NAME <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("STOCK_NAME <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("STOCK_NAME like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("STOCK_NAME not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("STOCK_NAME in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("STOCK_NAME not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("STOCK_NAME between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("STOCK_NAME not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeIsNull() {
            addCriterion("STOCK_CAPI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeIsNotNull() {
            addCriterion("STOCK_CAPI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_TYPE =", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeNotEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_TYPE <>", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeGreaterThan(Integer value) {
            addCriterion("STOCK_CAPI_TYPE >", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_TYPE >=", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeLessThan(Integer value) {
            addCriterion("STOCK_CAPI_TYPE <", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_TYPE <=", value, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_TYPE in", values, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeNotIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_TYPE not in", values, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_TYPE between", value1, value2, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_TYPE not between", value1, value2, "stockCapiType");
            return (Criteria) this;
        }

        public Criteria andStockCapiIsNull() {
            addCriterion("STOCK_CAPI is null");
            return (Criteria) this;
        }

        public Criteria andStockCapiIsNotNull() {
            addCriterion("STOCK_CAPI is not null");
            return (Criteria) this;
        }

        public Criteria andStockCapiEqualTo(Integer value) {
            addCriterion("STOCK_CAPI =", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiNotEqualTo(Integer value) {
            addCriterion("STOCK_CAPI <>", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiGreaterThan(Integer value) {
            addCriterion("STOCK_CAPI >", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI >=", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiLessThan(Integer value) {
            addCriterion("STOCK_CAPI <", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI <=", value, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiIn(List<Integer> values) {
            addCriterion("STOCK_CAPI in", values, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiNotIn(List<Integer> values) {
            addCriterion("STOCK_CAPI not in", values, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI between", value1, value2, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI not between", value1, value2, "stockCapi");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarIsNull() {
            addCriterion("STOCK_CAPI_DOLLAR is null");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarIsNotNull() {
            addCriterion("STOCK_CAPI_DOLLAR is not null");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR =", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarNotEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR <>", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarGreaterThan(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR >", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR >=", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarLessThan(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR <", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_DOLLAR <=", value, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_DOLLAR in", values, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarNotIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_DOLLAR not in", values, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_DOLLAR between", value1, value2, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiDollarNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_DOLLAR not between", value1, value2, "stockCapiDollar");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbIsNull() {
            addCriterion("STOCK_CAPI_RMB is null");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbIsNotNull() {
            addCriterion("STOCK_CAPI_RMB is not null");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_RMB =", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbNotEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_RMB <>", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbGreaterThan(Integer value) {
            addCriterion("STOCK_CAPI_RMB >", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_RMB >=", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbLessThan(Integer value) {
            addCriterion("STOCK_CAPI_RMB <", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_CAPI_RMB <=", value, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_RMB in", values, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbNotIn(List<Integer> values) {
            addCriterion("STOCK_CAPI_RMB not in", values, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_RMB between", value1, value2, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockCapiRmbNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_CAPI_RMB not between", value1, value2, "stockCapiRmb");
            return (Criteria) this;
        }

        public Criteria andStockPercentIsNull() {
            addCriterion("STOCK_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andStockPercentIsNotNull() {
            addCriterion("STOCK_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andStockPercentEqualTo(String value) {
            addCriterion("STOCK_PERCENT =", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentNotEqualTo(String value) {
            addCriterion("STOCK_PERCENT <>", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentGreaterThan(String value) {
            addCriterion("STOCK_PERCENT >", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_PERCENT >=", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentLessThan(String value) {
            addCriterion("STOCK_PERCENT <", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentLessThanOrEqualTo(String value) {
            addCriterion("STOCK_PERCENT <=", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentLike(String value) {
            addCriterion("STOCK_PERCENT like", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentNotLike(String value) {
            addCriterion("STOCK_PERCENT not like", value, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentIn(List<String> values) {
            addCriterion("STOCK_PERCENT in", values, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentNotIn(List<String> values) {
            addCriterion("STOCK_PERCENT not in", values, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentBetween(String value1, String value2) {
            addCriterion("STOCK_PERCENT between", value1, value2, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockPercentNotBetween(String value1, String value2) {
            addCriterion("STOCK_PERCENT not between", value1, value2, "stockPercent");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbIsNull() {
            addCriterion("STOCK_RATE_RMB is null");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbIsNotNull() {
            addCriterion("STOCK_RATE_RMB is not null");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbEqualTo(Integer value) {
            addCriterion("STOCK_RATE_RMB =", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbNotEqualTo(Integer value) {
            addCriterion("STOCK_RATE_RMB <>", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbGreaterThan(Integer value) {
            addCriterion("STOCK_RATE_RMB >", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_RATE_RMB >=", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbLessThan(Integer value) {
            addCriterion("STOCK_RATE_RMB <", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_RATE_RMB <=", value, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbIn(List<Integer> values) {
            addCriterion("STOCK_RATE_RMB in", values, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbNotIn(List<Integer> values) {
            addCriterion("STOCK_RATE_RMB not in", values, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_RATE_RMB between", value1, value2, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateRmbNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_RATE_RMB not between", value1, value2, "stockRateRmb");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarIsNull() {
            addCriterion("STOCK_RATE_DOLLAR is null");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarIsNotNull() {
            addCriterion("STOCK_RATE_DOLLAR is not null");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarEqualTo(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR =", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarNotEqualTo(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR <>", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarGreaterThan(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR >", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR >=", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarLessThan(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR <", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_RATE_DOLLAR <=", value, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarIn(List<Integer> values) {
            addCriterion("STOCK_RATE_DOLLAR in", values, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarNotIn(List<Integer> values) {
            addCriterion("STOCK_RATE_DOLLAR not in", values, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_RATE_DOLLAR between", value1, value2, "stockRateDollar");
            return (Criteria) this;
        }

        public Criteria andStockRateDollarNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_RATE_DOLLAR not between", value1, value2, "stockRateDollar");
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