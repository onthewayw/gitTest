package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectRequestBean;

public interface ZumaProjectRequestService {
	public PagerBean findPage(ZumaProjectRequestBean projectRequestBean);

    public List<ZumaProjectRequestBean> findListByConditions(ZumaProjectRequestBean projectRequestBean);

    public ZumaProjectRequestBean findById(String fId);

    public Integer add(ZumaProjectRequestBean projectRequestBean);

    public Integer modify(ZumaProjectRequestBean projectRequestBean);

    public void delete(ZumaProjectRequestBean projectRequestBean);
}
