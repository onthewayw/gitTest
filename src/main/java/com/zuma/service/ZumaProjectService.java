package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectBean;

public interface ZumaProjectService {
	
	public PagerBean findPage(ZumaProjectBean projectBean);

    public List<ZumaProjectBean> findListByConditions(ZumaProjectBean projectBean);

    public ZumaProjectBean findById(String fId);

    public Integer add(ZumaProjectBean projectBean);

    public Integer modify(ZumaProjectBean projectBean);

    public void delete(ZumaProjectBean projectBean);
}
