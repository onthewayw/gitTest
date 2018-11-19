package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionMenuButtonBean;
import com.zuma.mapper.ZumaPermissionMenuButtonBeanMapper;
import com.zuma.service.ZumaPermissionMenuButtonService;
@Service
public class ZumaPermissionMenuButtonServiceImpl implements ZumaPermissionMenuButtonService{
	@Autowired
	ZumaPermissionMenuButtonBeanMapper zumaPermissionMenuBeanMapper;
	@Override
	public PagerBean findPage(ZumaPermissionMenuButtonBean permissionMenuBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(permissionMenuBean);
		int count = zumaPermissionMenuBeanMapper.findCountByConditions(permissionMenuBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaPermissionMenuBeanMapper.findPageByConditions(permissionMenuBean));
		return pagerBean;
	}

	@Override
	public List<ZumaPermissionMenuButtonBean> findListByConditions(ZumaPermissionMenuButtonBean permissionMenuBean) {
		return zumaPermissionMenuBeanMapper.findListByConditions(permissionMenuBean);
	}

	@Override
	public ZumaPermissionMenuButtonBean findById(String fId) {
		return zumaPermissionMenuBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaPermissionMenuButtonBean permissionMenuBean) {
		Date now = new Date();
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String fId = str.replace("-", "");
		permissionMenuBean.setfId(fId);
		permissionMenuBean.setfCreateTime(now);
		permissionMenuBean.setfUpdateTime(now);
		return zumaPermissionMenuBeanMapper.add(permissionMenuBean);
	}

	@Override
	public Integer modify(ZumaPermissionMenuButtonBean permissionMenuBean) {
		return zumaPermissionMenuBeanMapper.modify(permissionMenuBean);
	}

	@Override
	public void delete(ZumaPermissionMenuButtonBean permissionMenuBean) {
		zumaPermissionMenuBeanMapper.delete(permissionMenuBean);
	}

}
