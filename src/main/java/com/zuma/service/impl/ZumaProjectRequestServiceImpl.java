package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectRequestBean;
import com.zuma.mapper.ZumaProjectRequestBeanMapper;
import com.zuma.service.ZumaProjectRequestService;

@Service
public class ZumaProjectRequestServiceImpl implements ZumaProjectRequestService {

	@Autowired
	private ZumaProjectRequestBeanMapper projectRequestMapper;
		
	@Override
	public PagerBean findPage(ZumaProjectRequestBean projectRequestBean) {
		 PagerBean pagerBean = new PagerBean();
	     pagerBean.setPager(projectRequestBean);
	     int count = projectRequestMapper.findCountByConditions(projectRequestBean);
	     pagerBean.setCount(count);
	     pagerBean.setTotal(count);
	     pagerBean.setData(projectRequestMapper.findPageByConditions(projectRequestBean));
	     return pagerBean;
	}

	@Override
	public List<ZumaProjectRequestBean> findListByConditions(ZumaProjectRequestBean projectRequestBean) {
		
		return projectRequestMapper.findListByConditions(projectRequestBean);
	}

	@Override
	public ZumaProjectRequestBean findById(String fId) {
		
		return projectRequestMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaProjectRequestBean projectRequestBean) {
		
		return projectRequestMapper.add(projectRequestBean);
	}

	@Override
	public Integer modify(ZumaProjectRequestBean projectRequestBean) {
		
		return projectRequestMapper.modify(projectRequestBean);
	}

	@Override
	public void delete(ZumaProjectRequestBean projectRequestBean) {
		projectRequestMapper.delete(projectRequestBean);
	}

}
