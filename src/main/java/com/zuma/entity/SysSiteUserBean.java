package com.zuma.entity;

import com.zuma.common.utils.rpc.PagerBean;

/*
 * 版    权:  operate Copyright 2014-2016,All rights reserved
 * 文 件 名:  SysUserBean.java
 * 描       述:  用户表
 * 作者:  liuzhengfei
 * 时间:  2016-10-25 11:46:29 星期二
 */
public class SysSiteUserBean extends PagerBean {
	
	/**
	 * 用户ID
	 */
	private Long fId;
	/**
	 * 员工编号
	 */
	private String fUserAccount;
	/**
	 * 用户名
	 */
	private String fUserName;
	/**
	 * 用户密码
	 */
	private String fPassword;

	/**
	 * 角色ID-->临时字段
	 */
	private Integer roleId;
	/**
	 * 角色名称-->临时字段
	 */
	private String roleName;
	/**
	 * 创建时间
	 */
	private java.util.Date fCreateTime;
	/**
	 * 创建人
	 */
	private Long fCreateId;
	/**
	 * 修改时间
	 */
	private java.util.Date fUpdateTime;
	/**
	 * 修改人
	 */
	private Long fUpdateId;

	/**
	 * 密码输入错误次数
	 */
	private Integer fErrorTimes;

	/**
	 * 0男1女
	 */
	private Integer fSex;
	/**
	 * 出生时间
	 */
	private java.util.Date fBirthdayTime;

	/**
	 * 民族
	 */
	private String fNation;
	/**
	 * 户口类型 0 本地农村 1外地农村 2本地城镇 3外地城镇
	 */
	private Integer fPopulation;
	/**
	 * 固定号码
	 */
	private String fTel;
	/**
	 * 学历 0博士 1硕士 2本科 3大专4高中
	 */
	private Integer fEducational;
	/**
	 * 分机
	 */
	private String fExtension;
	/**
	 * 手机号
	 */
	private String fPhone;
	/**
	 * 在职状态 1在职 2离职 3停薪留职
	 */
	private Integer fPayroll;
	/**
	 * 入职时间
	 */
	private java.util.Date fJoinTime;

	/**
	 * 离职时间
	 */
	private java.util.Date fLeaveTime;

	/**
	 * 紧急联系人
	 */
	private String fEmergency;
	/**
	 * 紧急联系人电话
	 */
	private String fEmergencyTel;
	/**
	 * 部门id
	 */
	private Long fDepartmentId;
	/**
	 * 岗位id
	 */
	private Long fStationId;
	/**
	 * 员工属性 1内部人员 2外部人员
	 */
	private Integer fEmployeeType;
	/**
	 * 身份证
	 */
	private String fIdCard;
	/**
	 * 籍贯省
	 */
	private Long fBornProvice;
	/**
	 * 籍贯市
	 */
	private Long fBornCity;
	/**
	 * 籍贯县
	 */
	private Long fBornDistrict;

	/**
	 * 籍贯区
	 */
	private Long fBornTown;

	/**
	 * 户籍省
	 */
	private Long fCensusProvice;
	/**
	 * 户籍市
	 */
	private Long fCensusCity;
	/**
	 * 户籍县
	 */
	private Long fCensusDistrict;
	/**
	 * 户籍区
	 */
	private Long fCensusTown;
	/**
	 * 户籍地址
	 */
	private String fCensusAddr;
	/**
	 * 现居住省
	 */
	private Long fNowProvice;
	/**
	 * 先居住市区
	 */
	private Long fNowCity;
	/**
	 * 现居住县
	 */
	private Long fNowDistrict;
	/**
	 * 现居住区
	 */
	private Long fNowTown;

	/**
	 * 详细地址
	 */
	private String fAddrDetail;
	/**
	 * 英语等级 2:英语二级 4:英语四级 6:英语六级 8:英语八级
	 */
	private String fEnglishLevel;
	/**
	 * 用户头像
	 */
	private String fUserImage;
	/**
	 * 用户角色的名称 方便查询
	 */
	private String fRoleName;

	private String fCompanyId;

	/**
	 * 籍贯名称
	 */
	private String fBornName;
	/**
	 * 户籍名字
	 */
	private String fCensusName;

	/**
	 * 现居住地名字
	 */
	private String fNowName;
	/**
	 * 国籍
	 */
	private String fNationality;

	/**
	 * 开户银行
	 */
	private String fDepositBank;
	/**
	 * 银行账号
	 */
	private String fCardNumbers;
	/**
	 * 员工保密信息准确无误 1:有选 其他：没选
	 */
	private String fConfidential;
	/**
	 * 考勤卡号
	 */
	private String fCardNo;

	private String fDepositBankPoint;

	// =========辅助字段=========================================================================
	/**
	 * 入职时间
	 */
	private String fJoinTimeStr;

	/**
	 * 离职时间
	 */
	private String fLeaveTimeStr;

	/**
	 * 出生日期
	 */
	private String fBirthdayTimeStr;

	/**
	 * 岗位名称
	 * 
	 * @return
	 */
	private String fPositionName;

	/**
	 * 部门名称
	 * 
	 * @return
	 */

	private String fDepartment;

	/**
	 * 公司名
	 */
	private String fCompany;

	/**
	 * 开始出生年份
	 */
	private String startDay;
	/**
	 * 结束出生年份
	 */
	private String endByDay;

	private String startAge;

	private String endAge;

	private String startJoinTime;

	private String endJoinTime;

	private String PositionStr;
	
	private  Integer fPositionLevel;
	
	private String fSelectItems;
	
	public String getStartAge() {
		return startAge;
	}

	public void setStartAge(String startAge) {
		this.startAge = startAge;
	}

	public String getEndAge() {
		return endAge;
	}

	public void setEndAge(String endAge) {
		this.endAge = endAge;
	}

	public String getStartJoinTime() {
		return startJoinTime;
	}

	public void setStartJoinTime(String startJoinTime) {
		this.startJoinTime = startJoinTime;
	}

	public String getEndJoinTime() {
		return endJoinTime;
	}

	public void setEndJoinTime(String endJoinTime) {
		this.endJoinTime = endJoinTime;
	}

	/**
	 * 状态名
	 * 
	 * @return
	 */
	private String fstatuName;

	/**
	 * 年龄
	 * 
	 * @return
	 */
	private int age;

	/**
	 * 员工属性名
	 * 
	 * @return
	 */
	private String fEmplyoeeTypeName;
	/**
	 * 性别名称
	 * 
	 * @return
	 */
	private String fSexName;

	private String fEducationalStr;
	/**
	 * 开始年龄
	 * 
	 * @return
	 */
	private String fStartAge;
	/**
	 * 结束年龄
	 * 
	 * @return
	 */
	private String fEndAge;

	public String getfStartAge() {
		return fStartAge;
	}

	public void setfStartAge(String fStartAge) {
		this.fStartAge = fStartAge;
	}

	public String getfEndAge() {
		return fEndAge;
	}

	public void setfEndAge(String fEndAge) {
		this.fEndAge = fEndAge;
	}

	public String getfEducationalStr() {
		return fEducationalStr;
	}

	public void setfEducationalStr(String fEducationalStr) {
		this.fEducationalStr = fEducationalStr;
	}

	public String getfSexName() {
		return fSexName;
	}

	public void setfSexName(String fSexName) {
		this.fSexName = fSexName;
	}

	public String getfEmplyoeeTypeName() {
		return fEmplyoeeTypeName;
	}

	public void setfEmplyoeeTypeName(String fEmplyoeeTypeName) {
		this.fEmplyoeeTypeName = fEmplyoeeTypeName;
	}

	public String getFstatuName() {
		return fstatuName;
	}

	public void setFstatuName(String fstatuName) {
		this.fstatuName = fstatuName;
	}

	public String getfJoinTimeStr() {
		return fJoinTimeStr;
	}

	public void setfJoinTimeStr(String fJoinTimeStr) {
		this.fJoinTimeStr = fJoinTimeStr;
	}

	public String getfLeaveTimeStr() {
		return fLeaveTimeStr;
	}

	public void setfLeaveTimeStr(String fLeaveTimeStr) {
		this.fLeaveTimeStr = fLeaveTimeStr;
	}

	public String getfUserAccount() {
		return fUserAccount;
	}

	public void setfUserAccount(String fUserAccount) {
		this.fUserAccount = fUserAccount;
	}

	public Integer getfSex() {
		return fSex;
	}

	public void setfSex(Integer fSex) {
		this.fSex = fSex;
	}

	public java.util.Date getfBirthdayTime() {
		return fBirthdayTime;
	}

	public void setfBirthdayTime(java.util.Date fBirthdayTime) {
		this.fBirthdayTime = fBirthdayTime;
	}

	public String getfNation() {
		return fNation;
	}

	public void setfNation(String fNation) {
		this.fNation = fNation;
	}

	public Integer getfPopulation() {
		return fPopulation;
	}

	public void setfPopulation(Integer fPopulation) {
		this.fPopulation = fPopulation;
	}

	public String getfTel() {
		return fTel;
	}

	public void setfTel(String fTel) {
		this.fTel = fTel;
	}

	public Integer getfEducational() {
		return fEducational;
	}

	public void setfEducational(Integer fEducational) {
		this.fEducational = fEducational;
	}

	public String getfExtension() {
		return fExtension;
	}

	public void setfExtension(String fExtension) {
		this.fExtension = fExtension;
	}

	public String getfPhone() {
		return fPhone;
	}

	public void setfPhone(String fPhone) {
		this.fPhone = fPhone;
	}

	public Integer getfPayroll() {
		return fPayroll;
	}

	public void setfPayroll(Integer fPayroll) {
		this.fPayroll = fPayroll;
	}

	public java.util.Date getfJoinTime() {
		return fJoinTime;
	}

	public void setfJoinTime(java.util.Date fJoinTime) {
		this.fJoinTime = fJoinTime;
	}

	public java.util.Date getfLeaveTime() {
		return fLeaveTime;
	}

	public void setfLeaveTime(java.util.Date fLeaveTime) {
		this.fLeaveTime = fLeaveTime;
	}

	public String getfEmergency() {
		return fEmergency;
	}

	public void setfEmergency(String fEmergency) {
		this.fEmergency = fEmergency;
	}

	public String getfEmergencyTel() {
		return fEmergencyTel;
	}

	public void setfEmergencyTel(String fEmergencyTel) {
		this.fEmergencyTel = fEmergencyTel;
	}

	public Long getfDepartmentId() {
		return fDepartmentId;
	}

	public void setfDepartmentId(Long fDepartmentId) {
		this.fDepartmentId = fDepartmentId;
	}

	public Long getfStationId() {
		return fStationId;
	}

	public void setfStationId(Long fStationId) {
		this.fStationId = fStationId;
	}

	public Integer getfEmployeeType() {
		return fEmployeeType;
	}

	public void setfEmployeeType(Integer fEmployeeType) {
		this.fEmployeeType = fEmployeeType;
	}

	public String getfIdCard() {
		return fIdCard;
	}

	public void setfIdCard(String fIdCard) {
		this.fIdCard = fIdCard;
	}

	public Long getfBornProvice() {
		return fBornProvice;
	}

	public void setfBornProvice(Long fBornProvice) {
		this.fBornProvice = fBornProvice;
	}

	public Long getfBornCity() {
		return fBornCity;
	}

	public void setfBornCity(Long fBornCity) {
		this.fBornCity = fBornCity;
	}

	public Long getfCensusProvice() {
		return fCensusProvice;
	}

	public void setfCensusProvice(Long fCensusProvice) {
		this.fCensusProvice = fCensusProvice;
	}

	public Long getfCensusCity() {
		return fCensusCity;
	}

	public void setfCensusCity(Long fCensusCity) {
		this.fCensusCity = fCensusCity;
	}

	public String getfCensusAddr() {
		return fCensusAddr;
	}

	public void setfCensusAddr(String fCensusAddr) {
		this.fCensusAddr = fCensusAddr;
	}

	public Long getfNowProvice() {
		return fNowProvice;
	}

	public void setfNowProvice(Long fNowProvice) {
		this.fNowProvice = fNowProvice;
	}

	public Long getfNowCity() {
		return fNowCity;
	}

	public void setfNowCity(Long fNowCity) {
		this.fNowCity = fNowCity;
	}

	public String getfAddrDetail() {
		return fAddrDetail;
	}

	public void setfAddrDetail(String fAddrDetail) {
		this.fAddrDetail = fAddrDetail;
	}

	public String getfEnglishLevel() {
		return fEnglishLevel;
	}

	public void setfEnglishLevel(String fEnglishLevel) {
		this.fEnglishLevel = fEnglishLevel;
	}

	public String getfUserImage() {
		return fUserImage;
	}

	public void setfUserImage(String fUserImage) {
		this.fUserImage = fUserImage;
	}

	public String getfRoleName() {
		return fRoleName;
	}

	public void setfRoleName(String fRoleName) {
		this.fRoleName = fRoleName;
	}

	public Integer getfErrorTimes() {
		return fErrorTimes;
	}

	public void setfErrorTimes(Integer fErrorTimes) {
		this.fErrorTimes = fErrorTimes;
	}

	public Long getfUpdateId() {
		return fUpdateId;
	}

	public void setfUpdateId(Long fUpdateId) {
		this.fUpdateId = fUpdateId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public java.util.Date getfCreateTime() {
		return fCreateTime;
	}

	public void setfCreateTime(java.util.Date fCreateTime) {
		this.fCreateTime = fCreateTime;
	}

	public Long getfCreateId() {
		return fCreateId;
	}

	public void setfCreateId(Long fCreateId) {
		this.fCreateId = fCreateId;
	}

	public java.util.Date getfUpdateTime() {
		return fUpdateTime;
	}

	public void setfUpdateTime(java.util.Date fUpdateTime) {
		this.fUpdateTime = fUpdateTime;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Long getfId() {
		return fId;
	}

	public void setfId(Long fId) {
		this.fId = fId;
	}

	public String getfUserName() {
		return this.fUserName;
	}

	public void setfUserName(String fUserName) {
		this.fUserName = fUserName;
	}

	public String getfPassword() {
		return this.fPassword;
	}

	public void setfPassword(String fPassword) {
		this.fPassword = fPassword;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getfCompanyId() {
		return fCompanyId;
	}

	public void setfCompanyId(String fCompanyId) {
		this.fCompanyId = fCompanyId;
	}

	public String getfPositionName() {
		return fPositionName;
	}

	public void setfPositionName(String fPositionName) {
		this.fPositionName = fPositionName;
	}

	public String getfDepartment() {
		return fDepartment;
	}

	public void setfDepartment(String fDepartment) {
		this.fDepartment = fDepartment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getfBornDistrict() {
		return fBornDistrict;
	}

	public void setfBornDistrict(Long fBornDistrict) {
		this.fBornDistrict = fBornDistrict;
	}

	public Long getfBornTown() {
		return fBornTown;
	}

	public void setfBornTown(Long fBornTown) {
		this.fBornTown = fBornTown;
	}

	public Long getfCensusDistrict() {
		return fCensusDistrict;
	}

	public void setfCensusDistrict(Long fCensusDistrict) {
		this.fCensusDistrict = fCensusDistrict;
	}

	public Long getfCensusTown() {
		return fCensusTown;
	}

	public void setfCensusTown(Long fCensusTown) {
		this.fCensusTown = fCensusTown;
	}

	public Long getfNowDistrict() {
		return fNowDistrict;
	}

	public void setfNowDistrict(Long fNowDistrict) {
		this.fNowDistrict = fNowDistrict;
	}

	public Long getfNowTown() {
		return fNowTown;
	}

	public void setfNowTown(Long fNowTown) {
		this.fNowTown = fNowTown;
	}

	public String getfBornName() {
		return fBornName;
	}

	public void setfBornName(String fBornName) {
		this.fBornName = fBornName;
	}

	public String getfCensusName() {
		return fCensusName;
	}

	public void setfCensusName(String fCensusName) {
		this.fCensusName = fCensusName;
	}

	public String getfNowName() {
		return fNowName;
	}

	public void setfNowName(String fNowName) {
		this.fNowName = fNowName;
	}

	public String getfNationality() {
		return fNationality;
	}

	public void setfNationality(String fNationality) {
		this.fNationality = fNationality;
	}

	public String getfDepositBank() {
		return fDepositBank;
	}

	public void setfDepositBank(String fDepositBank) {
		this.fDepositBank = fDepositBank;
	}

	public String getfCardNumbers() {
		return fCardNumbers;
	}

	public void setfCardNumbers(String fCardNumbers) {
		this.fCardNumbers = fCardNumbers;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndByDay() {
		return endByDay;
	}

	public void setEndByDay(String endByDay) {
		this.endByDay = endByDay;
	}

	public String getfConfidential() {
		return fConfidential;
	}

	public void setfConfidential(String fConfidential) {
		this.fConfidential = fConfidential;
	}

	public String getfCardNo() {
		return fCardNo;
	}

	public void setfCardNo(String fCardNo) {
		this.fCardNo = fCardNo;
	}

	public String getfDepositBankPoint() {
		return fDepositBankPoint;
	}

	public void setfDepositBankPoint(String fDepositBankPoint) {
		this.fDepositBankPoint = fDepositBankPoint;
	}

	public String getPositionStr() {
		return PositionStr;
	}

	public void setPositionStr(String positionStr) {
		PositionStr = positionStr;
	}

	public Integer getfPositionLevel() {
		return fPositionLevel;
	}

	public void setfPositionLevel(Integer fPositionLevel) {
		this.fPositionLevel = fPositionLevel;
	}

	public String getfCompany() {
		return fCompany;
	}

	public void setfCompany(String fCompany) {
		this.fCompany = fCompany;
	}

	public String getfSelectItems() {
		return fSelectItems;
	}

	public void setfSelectItems(String fSelectItems) {
		this.fSelectItems = fSelectItems;
	}

}
