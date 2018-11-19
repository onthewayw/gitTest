package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartBean;

public interface ZumaDepartService {

	public PagerBean findPage(ZumaDepartBean departBean);

	public List<ZumaDepartBean> findListByConditions(ZumaDepartBean departBean);

	public ZumaDepartBean findById(String fId);

	public Integer add(ZumaDepartBean departBean);

	public Integer modify(ZumaDepartBean departBean);

	public void delete(ZumaDepartBean departBean);

}
