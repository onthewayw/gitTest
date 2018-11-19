package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartUserBean;


public interface ZumaDepartUserService {

	public PagerBean findPage(ZumaDepartUserBean userBean);

	public List<ZumaDepartUserBean> findListByConditions(ZumaDepartUserBean userBean);

	public ZumaDepartUserBean findById(String fId);

	public Integer add(ZumaDepartUserBean userBean);

	public Integer modify(ZumaDepartUserBean userBean);

	public void delete(ZumaDepartUserBean userBean);

}
