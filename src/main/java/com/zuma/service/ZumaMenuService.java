package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaMenuBean;

public interface ZumaMenuService {
	public PagerBean findPage(ZumaMenuBean menuBean);

    public List<ZumaMenuBean> findListByConditions(ZumaMenuBean menuBean);

    public ZumaMenuBean findById(String fId);

    public Integer add(ZumaMenuBean menuBean);

    public Integer modify(ZumaMenuBean menuBean);

    public void delete(ZumaMenuBean menuBean);
}
