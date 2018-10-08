package com.pojo;

import java.util.Date;

public class TCorpStock {
    private String uuid;

    private Integer org;

    private Integer id;

    private Integer seqId;

    private String stockType;

    private String country;

    private String certificateType;

    private String certificateNo;

    private String stockName;

    private Integer stockCapiType;

    private Integer stockCapi;

    private Integer stockCapiDollar;

    private Integer stockCapiRmb;

    private String stockPercent;

    private Integer stockRateRmb;

    private Integer stockRateDollar;

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

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Integer getStockCapiType() {
        return stockCapiType;
    }

    public void setStockCapiType(Integer stockCapiType) {
        this.stockCapiType = stockCapiType;
    }

    public Integer getStockCapi() {
        return stockCapi;
    }

    public void setStockCapi(Integer stockCapi) {
        this.stockCapi = stockCapi;
    }

    public Integer getStockCapiDollar() {
        return stockCapiDollar;
    }

    public void setStockCapiDollar(Integer stockCapiDollar) {
        this.stockCapiDollar = stockCapiDollar;
    }

    public Integer getStockCapiRmb() {
        return stockCapiRmb;
    }

    public void setStockCapiRmb(Integer stockCapiRmb) {
        this.stockCapiRmb = stockCapiRmb;
    }

    public String getStockPercent() {
        return stockPercent;
    }

    public void setStockPercent(String stockPercent) {
        this.stockPercent = stockPercent == null ? null : stockPercent.trim();
    }

    public Integer getStockRateRmb() {
        return stockRateRmb;
    }

    public void setStockRateRmb(Integer stockRateRmb) {
        this.stockRateRmb = stockRateRmb;
    }

    public Integer getStockRateDollar() {
        return stockRateDollar;
    }

    public void setStockRateDollar(Integer stockRateDollar) {
        this.stockRateDollar = stockRateDollar;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}