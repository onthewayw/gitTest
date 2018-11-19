package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPermissionProjectRequestBean;
import com.zuma.mapper.ZumaPermissionProjectRequestBeanMapper;
import com.zuma.service.ZumaPermissionProjectRequestService;



@Service
public class ZumaPermissionProjectRequestServiceImpl implements ZumaPermissionProjectRequestService {

	@Autowired
	private ZumaPermissionProjectRequestBeanMapper projectRequestBeanMapper;
	//根据传入参数分页查询
	@Override
	public PagerBean findPage(ZumaPermissionProjectRequestBean projectRequestBean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(projectRequestBean);
        int count = projectRequestBeanMapper.findCountByConditions(projectRequestBean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(projectRequestBeanMapper.findPageByConditions(projectRequestBean));
        return pagerBean;
	}
	//根据传入参数查询
	@Override
	public List<ZumaPermissionProjectRequestBean> findListByConditions(ZumaPermissionProjectRequestBean projectRequestBean) {
		return projectRequestBeanMapper.findListByConditions(projectRequestBean);
	}
	//新增
	@Override
	public void add(ZumaPermissionProjectRequestBean projectRequestBean) {
		//生成UUID作为主键
		String uuid = UUID.randomUUID().toString().replace("-","");
		projectRequestBean.setfId(uuid);
		//添加时间
		Date date = new Date();
		projectRequestBean.setfCreateTime(date);
		projectRequestBeanMapper.add(projectRequestBean);
	}
	//修改
	@Override
	public void modify(ZumaPermissionProjectRequestBean projectRequestBean) {
		//修改时间
		Date date = new Date();
		projectRequestBean.setfUpdateTime(date);
		projectRequestBeanMapper.modify(projectRequestBean);
	}
	//根据物理主键查询
	@Override
	public ZumaPermissionProjectRequestBean findById(String fId) {
		return projectRequestBeanMapper.findById(fId);
	}
	//删除
	@Override
	public void deleteByPrimary(String fId) {
		projectRequestBeanMapper.deleteByPrimary(fId);
	}
	
	
	
}
