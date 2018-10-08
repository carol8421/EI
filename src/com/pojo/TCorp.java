package com.pojo;

import java.util.Date;
import java.util.List;

public class TCorp {
    private String uuid;

    private Integer org;

    private Integer id;

    private Integer seqId;

    private String regNo;

    private String corpName;

    private String addr;

    private String belongOrg;

    private String belongDistOrg;

    private String belongTrade;

    private String econKind;

    private String admitMain;

    private Date startDate;

    private Date checkDate;

    private String operManIdentNo;

    private String operManName;

    private String corpStatus;

    private Integer regCapi;

    private Date fareTermStart;

    private String fareTermEnd;

    private String fareScope;

    private String uniScid;

    private String tel;

    private String webUrl;

    private String email;

    private Integer pracPersonNum;

    private String orgInstCode;

    private String taxpayNum;

    private String staffSize;

    private String englishName;

    private String formerName;

    private Date createDate;

    private Integer createOrg;

    private List<TCorpStock> tcorpStock;
    
    public List<TCorpStock> getTcorpStock() {
		return tcorpStock;
	}

	public void setTcorpStock(List<TCorpStock> tcorpStock) {
		this.tcorpStock = tcorpStock;
	}

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

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getBelongOrg() {
        return belongOrg;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg == null ? null : belongOrg.trim();
    }

    public String getBelongDistOrg() {
        return belongDistOrg;
    }

    public void setBelongDistOrg(String belongDistOrg) {
        this.belongDistOrg = belongDistOrg == null ? null : belongDistOrg.trim();
    }

    public String getBelongTrade() {
        return belongTrade;
    }

    public void setBelongTrade(String belongTrade) {
        this.belongTrade = belongTrade == null ? null : belongTrade.trim();
    }

    public String getEconKind() {
        return econKind;
    }

    public void setEconKind(String econKind) {
        this.econKind = econKind == null ? null : econKind.trim();
    }

    public String getAdmitMain() {
        return admitMain;
    }

    public void setAdmitMain(String admitMain) {
        this.admitMain = admitMain == null ? null : admitMain.trim();
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

    public String getCorpStatus() {
        return corpStatus;
    }

    public void setCorpStatus(String corpStatus) {
        this.corpStatus = corpStatus == null ? null : corpStatus.trim();
    }

    public Integer getRegCapi() {
        return regCapi;
    }

    public void setRegCapi(Integer regCapi) {
        this.regCapi = regCapi;
    }

    public Date getFareTermStart() {
        return fareTermStart;
    }

    public void setFareTermStart(Date fareTermStart) {
        this.fareTermStart = fareTermStart;
    }

    public String getFareTermEnd() {
        return fareTermEnd;
    }

    public void setFareTermEnd(String fareTermEnd) {
        this.fareTermEnd = fareTermEnd == null ? null : fareTermEnd.trim();
    }

    public String getFareScope() {
        return fareScope;
    }

    public void setFareScope(String fareScope) {
        this.fareScope = fareScope == null ? null : fareScope.trim();
    }

    public String getUniScid() {
        return uniScid;
    }

    public void setUniScid(String uniScid) {
        this.uniScid = uniScid == null ? null : uniScid.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPracPersonNum() {
        return pracPersonNum;
    }

    public void setPracPersonNum(Integer pracPersonNum) {
        this.pracPersonNum = pracPersonNum;
    }

    public String getOrgInstCode() {
        return orgInstCode;
    }

    public void setOrgInstCode(String orgInstCode) {
        this.orgInstCode = orgInstCode == null ? null : orgInstCode.trim();
    }

    public String getTaxpayNum() {
        return taxpayNum;
    }

    public void setTaxpayNum(String taxpayNum) {
        this.taxpayNum = taxpayNum == null ? null : taxpayNum.trim();
    }

    public String getStaffSize() {
        return staffSize;
    }

    public void setStaffSize(String staffSize) {
        this.staffSize = staffSize == null ? null : staffSize.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateOrg() {
        return createOrg;
    }

    public void setCreateOrg(Integer createOrg) {
        this.createOrg = createOrg;
    }
}