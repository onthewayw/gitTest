package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRequestBean;

public interface ZumaRequestService {
	public PagerBean findPage(ZumaRequestBean requestBean);

    public List<ZumaRequestBean> findListByConditions(ZumaRequestBean requestBean);

    public ZumaRequestBean findById(String fId);

    public Integer add(ZumaRequestBean requestBean);

    public Integer modify(ZumaRequestBean requestBean);

    public void delete(ZumaRequestBean requestBean);
}
