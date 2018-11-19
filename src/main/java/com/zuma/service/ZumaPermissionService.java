package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionBean;

public interface ZumaPermissionService {
	public PagerBean findPage(ZumaPermissionBean permissionBean);

    public List<ZumaPermissionBean> findListByConditions(ZumaPermissionBean permissionBean);

    public ZumaPermissionBean findById(String fId);

    public Integer add(ZumaPermissionBean permissionBean);

    public Integer modify(ZumaPermissionBean permissionBean);

    public void delete(ZumaPermissionBean permissionBean);	
}
