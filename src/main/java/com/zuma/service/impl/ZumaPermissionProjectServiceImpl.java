package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionProjectBean;
import com.zuma.mapper.ZumaPermissionProjectBeanMapper;
import com.zuma.service.ZumaPermissionProjectService;


@Service
public class ZumaPermissionProjectServiceImpl implements ZumaPermissionProjectService {

	@Autowired
	private ZumaPermissionProjectBeanMapper permissionProjectBeanMapper;

	//删除
	@Override
	public void deleteByPrimary(String fId) {
		permissionProjectBeanMapper.deleteByPrimary(fId);
	}
	//根据物理主键查询
	@Override
	public ZumaPermissionProjectBean findById(String fId) {
		return permissionProjectBeanMapper.findById(fId);
	}
	//修改
	@Override
	public void modify(ZumaPermissionProjectBean permissionProjectBean) {
		//修改时间
		Date date = new Date();
		permissionProjectBean.setfUpdateTime(date);
		permissionProjectBeanMapper.modify(permissionProjectBean);
	}
	//新增
	@Override
	public void add(ZumaPermissionProjectBean permissionProjectBean) {
		//生成UUID作为主键
		String uuid = UUID.randomUUID().toString().replace("-","");
		permissionProjectBean.setfId(uuid);
		//添加时间
		Date date = new Date();
		permissionProjectBean.setfCreateTime(date);
		permissionProjectBeanMapper.add(permissionProjectBean);
	}
	//根据传入参数查询
	@Override
	public List<ZumaPermissionProjectBean> findListByConditions(ZumaPermissionProjectBean permissionProjectBean) {
		return permissionProjectBeanMapper.findListByConditions(permissionProjectBean);
	}
	//根据传入参数分页查询
	@Override
	public PagerBean findPage(ZumaPermissionProjectBean permissionProjectBean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(permissionProjectBean);
        int count = permissionProjectBeanMapper.findCountByConditions(permissionProjectBean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(permissionProjectBeanMapper.findPageByConditions(permissionProjectBean));
        return pagerBean;
	}
	
	
	
	
}
