package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRoleBean;

/**
 * Created by yehaomiao on 2018/1/10.
 */
public interface ZumaRoleService {

	public PagerBean findPage(ZumaRoleBean userBean);

	public List<ZumaRoleBean> findListByConditions(ZumaRoleBean userBean);

	//public ZumaRoleBean findById(String fId);

	public Integer add(ZumaRoleBean userBean);

	public Integer modify(ZumaRoleBean userBean);

	public void delete(ZumaRoleBean userBean);
}