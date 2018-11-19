package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaUserRoleBean;

/**
 * Created by yehaomiao on 2018/1/10.
 */
public interface ZumaUserRoleService {

	public PagerBean findPage(ZumaUserRoleBean userBean);

	public List<ZumaUserRoleBean> findListByConditions(ZumaUserRoleBean bean);

	//public ZumaUserRoleBean findById(String fId);

	public Integer add(ZumaUserRoleBean userBean);

	public Integer modify(ZumaUserRoleBean userBean);

	public void delete(ZumaUserRoleBean userBean);
}