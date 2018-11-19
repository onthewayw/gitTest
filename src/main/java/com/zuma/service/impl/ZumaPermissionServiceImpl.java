package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionBean;
import com.zuma.mapper.ZumaPermissionBeanMapper;
import com.zuma.service.ZumaPermissionService;
@Service
public class ZumaPermissionServiceImpl implements ZumaPermissionService{
	@Autowired
	ZumaPermissionBeanMapper zumaPermissionBeanMapper;
	@Override
	public PagerBean findPage(ZumaPermissionBean permissionBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(permissionBean);
		int count = zumaPermissionBeanMapper.findCountByConditions(permissionBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaPermissionBeanMapper.findPageByConditions(permissionBean));
		return pagerBean;
	}

	@Override
	public List<ZumaPermissionBean> findListByConditions(ZumaPermissionBean permissionBean) {
		return zumaPermissionBeanMapper.findListByConditions(permissionBean);
	}

	@Override
	public ZumaPermissionBean findById(String fId) {
		return zumaPermissionBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaPermissionBean permissionBean) {
		Date now = new Date();
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String fId = str.replace("-", "");
		permissionBean.setfId(fId);
		permissionBean.setfCreateTime(now);
		permissionBean.setfUpdateTime(now);
		return zumaPermissionBeanMapper.add(permissionBean);
	}

	@Override
	public Integer modify(ZumaPermissionBean permissionBean) {
		return zumaPermissionBeanMapper.modify(permissionBean);
	}

	@Override
	public void delete(ZumaPermissionBean permissionBean) {
		zumaPermissionBeanMapper.delete(permissionBean);
	}

}
