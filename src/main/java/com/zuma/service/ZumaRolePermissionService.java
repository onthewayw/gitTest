package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRolePermissionBean;

/**
 * Created by yehaomiao on 2018/1/10.
 */
public interface ZumaRolePermissionService {

	public PagerBean findPage(ZumaRolePermissionBean userBean);

	public List<ZumaRolePermissionBean> findListByConditions(ZumaRolePermissionBean userBean);

	//public ZumaRolePermissionBean findById(String fId);

	public Integer add(ZumaRolePermissionBean userBean);

	public Integer modify(ZumaRolePermissionBean userBean);

	public void delete(ZumaRolePermissionBean userBean);
}