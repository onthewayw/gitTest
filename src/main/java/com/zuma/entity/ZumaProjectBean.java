package com.zuma.entity;

import java.util.Date;

import com.zuma.common.utils.rpc.PagerBean;

public class ZumaProjectBean extends PagerBean {
    /**
     * 
     */
    private String fId;

    /**
     * 
     */
    private String fCode;

    /**
     * 
     */
    private String fName;

    /**
     * 0失效  1有效
     */
    private Integer fState;

    /**
     * 
     */
    private String fCreateId;

    /**
     * 
     */
    private Integer fCreateType;

    /**
     * 
     */
    private Date fCreateTime;

    /**
     * 
     */
    private String fUpdateId;

    /**
     * 
     */
    private Integer fUpdateType;

    /**
     * 
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