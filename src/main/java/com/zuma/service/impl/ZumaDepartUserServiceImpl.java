package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaDepartUserBean;
import com.zuma.mapper.ZumaDepartUserBeanMapper;
import com.zuma.service.ZumaDepartUserService;

@Service
public class ZumaDepartUserServiceImpl implements ZumaDepartUserService {
	
	@Autowired
	private ZumaDepartUserBeanMapper zumaDepartUserBeanMapper;
	
	@Override
	public PagerBean findPage(ZumaDepartUserBean userBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(userBean);
		int count = zumaDepartUserBeanMapper.findCountByConditions(userBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaDepartUserBeanMapper.findPageByConditions(userBean));
		return pagerBean;
	}

	@Override
	public List<ZumaDepartUserBean> findListByConditions(ZumaDepartUserBean userBean) {
		return zumaDepartUserBeanMapper.findListByConditions(userBean);
	}

	@Override
	public ZumaDepartUserBean findById(String fId) {
		return zumaDepartUserBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaDepartUserBean userBean) {
		return zumaDepartUserBeanMapper.add(userBean);
	}

	@Override
	public Integer modify(ZumaDepartUserBean userBean) {
		return zumaDepartUserBeanMapper.modify(userBean);
	}

	@Override
	public void delete(ZumaDepartUserBean userBean) {
		zumaDepartUserBeanMapper.delete(userBean);
	}

}
