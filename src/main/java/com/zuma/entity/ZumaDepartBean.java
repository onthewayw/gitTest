package com.zuma.entity;

import java.util.Date;

import com.zuma.common.utils.rpc.PagerBean;

public class ZumaDepartBean extends PagerBean{
    /**
     * 
     */
    private String fId;

    /**
     * 部门编号
     */
    private String fCode;

    /**
     * 部门名称
     */
    private String fName;

    /**
     * 部门简称
     */
    private String fShortName;

    /**
     * 部门地址
     */
    private String fAddress;

    /**
     * 联系方式
     */
    private String fTel;

    /**
     * 手机号
     */
    private String fPhone;

    /**
     * 邮箱
     */
    private String fEmail;

    /**
     * 状态  0失效  1有效
     */
    private Integer fState;

    /**
     * 创建人Id
     */
    private String fCreateId;

    /**
     * 创建人类型  会员 员工
     */
    private Integer fCreateType;

    /**
     * 创建时间
     */
    private Date fCreateTime;

    /**
     * 更新人Id
     */
    private String fUpdateId;

    /**
     * 更新人类型 会员 员工
     */
    private Integer fUpdateType;

    /**
     * 更新时间
     */
    private Date fUpdateTime;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode == null ? null : fCode.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfShortName() {
        return fShortName;
    }

    public void setfShortName(String fShortName) {
        this.fShortName = fShortName == null ? null : fShortName.trim();
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress == null ? null : fAddress.trim();
    }

    public String getfTel() {
        return fTel;
    }

    public void setfTel(String fTel) {
        this.fTel = fTel == null ? null : fTel.trim();
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone == null ? null : fPhone.trim();
    }

    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail == null ? null : fEmail.trim();
    }

    public Integer getfState() {
        return fState;
    }

    public void setfState(Integer fState) {
        this.fState = fState;
    }

    public String getfCreateId() {
        return fCreateId;
    }

    public void setfCreateId(String fCreateId) {
        this.fCreateId = fCreateId == null ? null : fCreateId.trim();
    }

    public Integer getfCreateType() {
        return fCreateType;
    }

    public void setfCreateType(Integer fCreateType) {
        this.fCreateType = fCreateType;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public String getfUpdateId() {
        return fUpdateId;
    }

    public void setfUpdateId(String fUpdateId) {
        this.fUpdateId = fUpdateId == null ? null : fUpdateId.trim();
    }

    public Integer getfUpdateType() {
        return fUpdateType;
    }

    public void setfUpdateType(Integer fUpdateType) {
        this.fUpdateType = fUpdateType;
    }

    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }
}