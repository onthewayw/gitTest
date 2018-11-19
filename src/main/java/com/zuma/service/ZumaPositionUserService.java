package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPositionUserBean;

public interface ZumaPositionUserService {

	
	//根据传入参数分页查询
	public PagerBean findPage(ZumaPositionUserBean positionUserBean);
	//根据传入参数查询
	public List<ZumaPositionUserBean> findListByConditions(ZumaPositionUserBean positionUserBean);
	//新增
	public void add(ZumaPositionUserBean positionUserBean);
	//修改
	public void modify(ZumaPositionUserBean positionUserBean);
	//根据物理主键查询
	public ZumaPositionUserBean findById(String fId);
	//删除
	public void deleteByPrimary(String fId);

}
