package com.zuma.mapper;

import java.util.List;

import com.zuma.entity.ZumaRoleBean;

public interface ZumaRoleBeanMapper {
	public Integer findCountByConditions(ZumaRoleBean bean);

    public List<ZumaRoleBean> findPageByConditions(ZumaRoleBean bean);

    public List<ZumaRoleBean> findListByConditions(ZumaRoleBean bean);

    //public ZumaRoleBean findById(String fId);

    public Integer add(ZumaRoleBean bean);

    public Integer modify(ZumaRoleBean bean);

    public void delete(ZumaRoleBean bean);
}