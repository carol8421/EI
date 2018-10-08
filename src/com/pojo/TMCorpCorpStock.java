package com.pojo;

import java.math.BigDecimal;

public class TMCorpCorpStock {
    private String uuid;

    private Integer id;

    private Integer seqId;

    private Integer org;

    private String subUuid;

    private Integer subId;

    private Integer subSeqId;

    private Integer subOrg;

    private BigDecimal equity;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
    }

    public String getSubUuid() {
        return subUuid;
    }

    public void setSubUuid(String subUuid) {
        this.subUuid = subUuid == null ? null : subUuid.trim();
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getSubSeqId() {
        return subSeqId;
    }

    public void setSubSeqId(Integer subSeqId) {
        this.subSeqId = subSeqId;
    }

    public Integer getSubOrg() {
        return subOrg;
    }

    public void setSubOrg(Integer subOrg) {
        this.subOrg = subOrg;
    }

    public BigDecimal getEquity() {
        return equity;
    }

    public void setEquity(BigDecimal equity) {
        this.equity = equity;
    }
}