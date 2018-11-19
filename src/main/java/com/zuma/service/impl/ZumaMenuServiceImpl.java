package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaMenuBean;
import com.zuma.mapper.ZumaMenuBeanMapper;
import com.zuma.service.ZumaMenuService;
@Service
public class ZumaMenuServiceImpl implements ZumaMenuService{
	@Autowired
    private ZumaMenuBeanMapper zumaMenuBeanMapper;
	@Override
	public PagerBean findPage(ZumaMenuBean menuBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(menuBean);
		int count = zumaMenuBeanMapper.findCountByConditions(menuBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaMenuBeanMapper.findPageByConditions(menuBean));
		return pagerBean;
	}

	@Override
	public List<ZumaMenuBean> findListByConditions(ZumaMenuBean menuBean) {
		return zumaMenuBeanMapper.findListByConditions(menuBean);
	}

	@Override
	public ZumaMenuBean findById(String fId) {
		return zumaMenuBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaMenuBean menuBean) {
	 	Date now = new Date();
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String fId = str.replace("-", "");
		menuBean.setfId(fId);
		menuBean.setfCreateTime(now);
		menuBean.setfUpdateTime(now);
		return zumaMenuBeanMapper.add(menuBean);
	}

	@Override
	public Integer modify(ZumaMenuBean menuBean) {
		return zumaMenuBeanMapper.modify(menuBean);
	}

	@Override
	public void delete(ZumaMenuBean menuBean) {
		zumaMenuBeanMapper.delete(menuBean);
	}

}
