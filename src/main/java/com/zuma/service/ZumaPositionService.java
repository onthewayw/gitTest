package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPositionBean;

public interface ZumaPositionService {
	//根据传入参数查询
	public PagerBean findPage(ZumaPositionBean positionBean);
	//根据传入参数查询
	public List<ZumaPositionBean> findListByConditions(ZumaPositionBean positionBean);
	//新增
	public void add(ZumaPositionBean positionBean);
	//修改
	public void modify(ZumaPositionBean positionBean);
	//根据物理主键查询
	public ZumaPositionBean findById(String fId);
	//删除
	public void deleteByPrimary(String fId);

}
