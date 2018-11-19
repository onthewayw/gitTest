package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaButtonBean;
import com.zuma.mapper.ZumaButtonBeanMapper;
import com.zuma.service.ZumaButtonService;

@Service
public class ZumaButtonServiceImpl implements ZumaButtonService {
	
	@Autowired
	private ZumaButtonBeanMapper zumaButtonBeanMapper;
	
	@Override
	public PagerBean findPage(ZumaButtonBean buttonBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(buttonBean);
		int count = zumaButtonBeanMapper.findCountByConditions(buttonBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaButtonBeanMapper.findPageByConditions(buttonBean));
		return pagerBean;
	}

	@Override
	public List<ZumaButtonBean> findListByConditions(ZumaButtonBean buttonBean) {
		return zumaButtonBeanMapper.findListByConditions(buttonBean);
	}

	@Override
	public ZumaButtonBean findById(String fId) {
		return zumaButtonBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaButtonBean buttonBean) {
		return zumaButtonBeanMapper.add(buttonBean);
	}

	@Override
	public Integer modify(ZumaButtonBean buttonBean) {
		return zumaButtonBeanMapper.modify(buttonBean);
	}

	@Override
	public void delete(ZumaButtonBean buttonBean) {
		zumaButtonBeanMapper.delete(buttonBean);
	}

}
