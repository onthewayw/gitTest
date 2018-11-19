package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectMenuBean;
import com.zuma.mapper.ZumaProjectMenuBeanMapper;
import com.zuma.service.ZumaProjectMenuService;

@Service
public class ZumaProjectMenuServiceImpl implements ZumaProjectMenuService {

	@Autowired
	private ZumaProjectMenuBeanMapper projectMenuMapper;
	
	@Override
	public PagerBean findPage(ZumaProjectMenuBean projectMenuBean) {
		PagerBean pagerBean = new PagerBean();
	     pagerBean.setPager(projectMenuBean);
	     int count = projectMenuMapper.findCountByConditions(projectMenuBean);
	     pagerBean.setCount(count);
	     pagerBean.setTotal(count);
	     pagerBean.setData(projectMenuMapper.findPageByConditions(projectMenuBean));
	     return pagerBean;
	}

	@Override
	public List<ZumaProjectMenuBean> findListByConditions(ZumaProjectMenuBean projectMenuBean) {
		// TODO Auto-generated method stub
		return projectMenuMapper.findListByConditions(projectMenuBean);
	}

	@Override
	public ZumaProjectMenuBean findById(String fId) {
		// TODO Auto-generated method stub
		return projectMenuMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaProjectMenuBean projectMenuBean) {
		// TODO Auto-generated method stub
		return projectMenuMapper.add(projectMenuBean);
	}

	@Override
	public Integer modify(ZumaProjectMenuBean projectMenuBean) {
		// TODO Auto-generated method stub
		return projectMenuMapper.modify(projectMenuBean);
	}

	@Override
	public void delete(ZumaProjectMenuBean projectMenuBean) {
		projectMenuMapper.delete(projectMenuBean);
	}

}
