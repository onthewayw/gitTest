package com.zuma.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartBean;
import com.zuma.mapper.ZumaDepartBeanMapper;
import com.zuma.service.ZumaDepartService;

@Service
public class ZumaDepartServiceImpl implements ZumaDepartService{
	
	@Autowired
	private ZumaDepartBeanMapper zumaDepartBeanMapper;
	
	@Override
	public PagerBean findPage(ZumaDepartBean departBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(departBean);
		int count = zumaDepartBeanMapper.findCountByConditions(departBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaDepartBeanMapper.findPageByConditions(departBean));
		return pagerBean;
	}

	@Override
	public List<ZumaDepartBean> findListByConditions(ZumaDepartBean departBean) {
		return zumaDepartBeanMapper.findListByConditions(departBean);
	}

	@Override
	public ZumaDepartBean findById(String fId) {
		return zumaDepartBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaDepartBean departBean) {
		departBean.setfId(UUID.randomUUID().toString().replaceAll("-", ""));
		return zumaDepartBeanMapper.add(departBean);
	}

	@Override
	public Integer modify(ZumaDepartBean departBean) {
		return zumaDepartBeanMapper.modify(departBean);
	}

	@Override
	public void delete(ZumaDepartBean departBean) {
		zumaDepartBeanMapper.delete(departBean);
	}
}
