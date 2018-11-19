package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionMenuButtonBean;

public interface ZumaPermissionMenuButtonService {
	public PagerBean findPage(ZumaPermissionMenuButtonBean menuBean);

    public List<ZumaPermissionMenuButtonBean> findListByConditions(ZumaPermissionMenuButtonBean menuBean);

    public ZumaPermissionMenuButtonBean findById(String fId);

    public Integer add(ZumaPermissionMenuButtonBean menuBean);

    public Integer modify(ZumaPermissionMenuButtonBean menuBean);

    public void delete(ZumaPermissionMenuButtonBean menuBean);
}
