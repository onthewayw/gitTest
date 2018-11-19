package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionProjectRequestBean;

public interface ZumaPermissionProjectRequestService {
	
	
	//根据传入参数分页查询
	public PagerBean findPage(ZumaPermissionProjectRequestBean projectRequestBean);
	//根据传入参数查询
	public List<ZumaPermissionProjectRequestBean> findListByConditions(ZumaPermissionProjectRequestBean projectRequestBean);
	//新增
	public void add(ZumaPermissionProjectRequestBean projectRequestBean);
	//修改
	public void modify(ZumaPermissionProjectRequestBean projectRequestBean);
	//根据物理主键查询
	public ZumaPermissionProjectRequestBean findById(String fId);
	//删除
	public void deleteByPrimary(String fId);

}
