package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaButtonBean;

public interface ZumaButtonService {

	public PagerBean findPage(ZumaButtonBean buttonBean);

	public List<ZumaButtonBean> findListByConditions(ZumaButtonBean buttonBean);

	public ZumaButtonBean findById(String fId);

	public Integer add(ZumaButtonBean buttonBean);

	public Integer modify(ZumaButtonBean buttonBean);

	public void delete(ZumaButtonBean buttonBean);

}
