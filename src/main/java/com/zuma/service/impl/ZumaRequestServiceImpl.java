package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRequestBean;
import com.zuma.mapper.ZumaRequestBeanMapper;
import com.zuma.service.ZumaRequestService;
@Service
public class ZumaRequestServiceImpl implements ZumaRequestService {

	@Autowired
	private ZumaRequestBeanMapper requestMapper;
		
	@Override
	public PagerBean findPage(ZumaRequestBean requestBean) {
		 PagerBean pagerBean = new PagerBean();
	     pagerBean.setPager(requestBean);
	     int count = requestMapper.findCountByConditions(requestBean);
	     pagerBean.setCount(count);
	     pagerBean.setTotal(count);
	     pagerBean.setData(requestMapper.findPageByConditions(requestBean));
	     return pagerBean;
	}

	@Override
	public List<ZumaRequestBean> findListByConditions(ZumaRequestBean requestBean) {
		
		return requestMapper.findListByConditions(requestBean);
	}

	@Override
	public ZumaRequestBean findById(String fId) {
		
		return requestMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaRequestBean requestBean) {
		
		return requestMapper.add(requestBean);
	}

	@Override
	public Integer modify(ZumaRequestBean requestBean) {
		
		return requestMapper.modify(requestBean);
	}

	@Override
	public void delete(ZumaRequestBean requestBean) {
		requestMapper.delete(requestBean);
	}

}
