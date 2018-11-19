package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartPositionBean;

public interface ZumaDepartPositionService {

	public PagerBean findPage(ZumaDepartPositionBean positionBean);

	public List<ZumaDepartPositionBean> findListByConditions(ZumaDepartPositionBean positionBean);

	public ZumaDepartPositionBean findById(String fId);

	public Integer add(ZumaDepartPositionBean positionBean);

	public Integer modify(ZumaDepartPositionBean positionBean);

	public void delete(ZumaDepartPositionBean positionBean);

}
