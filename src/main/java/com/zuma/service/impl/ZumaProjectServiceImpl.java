package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectBean;
import com.zuma.mapper.ZumaProjectBeanMapper;
import com.zuma.service.ZumaProjectService;

@Service
public class ZumaProjectServiceImpl implements ZumaProjectService {
	
	@Autowired
	private ZumaProjectBeanMapper projectMapper;
	
	@Override
	public PagerBean findPage(ZumaProjectBean projectBean) {
		 PagerBean pagerBean = new PagerBean();
	     pagerBean.setPager(projectBean);
	     int count = projectMapper.findCountByConditions(projectBean);
	     pagerBean.setCount(count);
	     pagerBean.setTotal(count);
	     pagerBean.setData(projectMapper.findPageByConditions(projectBean));
	     return pagerBean;
	}
	
	@Override
	public List<ZumaProjectBean> findListByConditions(ZumaProjectBean projectBean) {
		// TODO Auto-generated method stub
		return projectMapper.findPageByConditions(projectBean);
	}


	@Override
	public ZumaProjectBean findById(String fId) {
		// TODO Auto-generated method stub
		return projectMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaProjectBean projectBean) {
		return projectMapper.add(projectBean);
	}

	@Override
	public Integer modify(ZumaProjectBean projectBean) {
		return projectMapper.modify(projectBean);
	}

	@Override
	public void delete(ZumaProjectBean projectBean) {
		projectMapper.delete(projectBean);
	}
}
