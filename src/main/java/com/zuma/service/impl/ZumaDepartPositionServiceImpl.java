package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartPositionBean;
import com.zuma.mapper.ZumaDepartPositionBeanMapper;
import com.zuma.service.ZumaDepartPositionService;

@Service
public class ZumaDepartPositionServiceImpl implements ZumaDepartPositionService {
	
	@Autowired
	private ZumaDepartPositionBeanMapper zumaDepartPositionBeanMapper;
	
	@Override
	public PagerBean findPage(ZumaDepartPositionBean positionBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(positionBean);
		int count = zumaDepartPositionBeanMapper.findCountByConditions(positionBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaDepartPositionBeanMapper.findPageByConditions(positionBean));
		return pagerBean;
	}

	@Override
	public List<ZumaDepartPositionBean> findListByConditions(ZumaDepartPositionBean positionBean) {
		return zumaDepartPositionBeanMapper.findListByConditions(positionBean);
	}

	@Override
	public ZumaDepartPositionBean findById(String fId) {
		return zumaDepartPositionBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaDepartPositionBean positionBean) {
		return zumaDepartPositionBeanMapper.add(positionBean);
	}

	@Override
	public Integer modify(ZumaDepartPositionBean positionBean) {
		return zumaDepartPositionBeanMapper.modify(positionBean);
	}

	@Override
	public void delete(ZumaDepartPositionBean positionBean) {
		zumaDepartPositionBeanMapper.delete(positionBean);
	}

}
