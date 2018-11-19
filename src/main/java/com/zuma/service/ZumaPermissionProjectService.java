package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionProjectBean;

public interface ZumaPermissionProjectService {

	//删除
	public void deleteByPrimary(String fId);
	//根据物理主键查询
	public ZumaPermissionProjectBean findById(String fId);
	//修改
	public void modify(ZumaPermissionProjectBean permissionProjectBean);
	//新增
	public void add(ZumaPermissionProjectBean permissionProjectBean);
	//根据传入参数查询
	public List<ZumaPermissionProjectBean> findListByConditions(ZumaPermissionProjectBean permissionProjectBean);
	//根据传入参数分页查询
	public PagerBean findPage(ZumaPermissionProjectBean permissionProjectBean);
	
	
	
}
