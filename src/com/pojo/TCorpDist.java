package com.pojo;

import java.util.Date;

public class TCorpDist {
    private String uuid;

    private Integer org;

    private Integer id;

    private Integer seqId;

    private String distRegNo;

    private String distName;

    private String distBelongOrg;

    private Integer distCorpOrg;

    private Integer distCorpId;

    private Integer distCorpSeqId;

    private String farePlace;

    private String operManIdentNo;

    private String operManName;

    private String fareScope;

    private Date startDate;

    private Date checkDate;

    private Date createDate;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
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

    public String getDistRegNo() {
        return distRegNo;
    }

    public void setDistRegNo(String distRegNo) {
        this.distRegNo = distRegNo == null ? null : distRegNo.trim();
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName == null ? null : distName.trim();
    }

    public String getDistBelongOrg() {
        return distBelongOrg;
    }

    public void setDistBelongOrg(String distBelongOrg) {
        this.distBelongOrg = distBelongOrg == null ? null : distBelongOrg.trim();
    }

    public Integer getDistCorpOrg() {
        return distCorpOrg;
    }

    public void setDistCorpOrg(Integer distCorpOrg) {
        this.distCorpOrg = distCorpOrg;
    }

    public Integer getDistCorpId() {
        return distCorpId;
    }

    public void setDistCorpId(Integer distCorpId) {
        this.distCorpId = distCorpId;
    }

    public Integer getDistCorpSeqId() {
        return distCorpSeqId;
    }

    public void setDistCorpSeqId(Integer distCorpSeqId) {
        this.distCorpSeqId = distCorpSeqId;
    }

    public String getFarePlace() {
        return farePlace;
    }

    public void setFarePlace(String farePlace) {
        this.farePlace = farePlace == null ? null : farePlace.trim();
    }

    public String getOperManIdentNo() {
        return operManIdentNo;
    }

    public void setOperManIdentNo(String operManIdentNo) {
        this.operManIdentNo = operManIdentNo == null ? null : operManIdentNo.trim();
    }

    public String getOperManName() {
        return operManName;
    }

    public void setOperManName(String operManName) {
        this.operManName = operManName == null ? null : operManName.trim();
    }

    public String getFareScope() {
        return fareScope;
    }

    public void setFareScope(String fareScope) {
        this.fareScope = fareScope == null ? null : fareScope.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}