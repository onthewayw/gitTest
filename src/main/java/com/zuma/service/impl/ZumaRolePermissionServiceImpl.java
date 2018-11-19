package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRolePermissionBean;
import com.zuma.mapper.ZumaRolePermissionBeanMapper;
import com.zuma.service.ZumaRolePermissionService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@Service
public class ZumaRolePermissionServiceImpl implements ZumaRolePermissionService {
	@Autowired
    private ZumaRolePermissionBeanMapper rolePermissionMapper;

	@Override
	public PagerBean findPage(ZumaRolePermissionBean bean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(bean);
        int count = rolePermissionMapper.findCountByConditions(bean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(rolePermissionMapper.findPageByConditions(bean));
        return pagerBean;
	}

	@Override
	public List<ZumaRolePermissionBean> findListByConditions(ZumaRolePermissionBean bean) {
		return rolePermissionMapper.findListByConditions(bean);
	}

    /*@Override
    public ZumaRolePermissionBean findById(String fId) {
        return rolePermissionMapper.findById(fId);
    }*/

    @Override
    public Integer add(ZumaRolePermissionBean bean) {
        return rolePermissionMapper.add(bean);
    }

    @Override
    public Integer modify(ZumaRolePermissionBean bean) {
        return rolePermissionMapper.modify(bean);
    }

    @Override
    public void delete(ZumaRolePermissionBean bean) {
        rolePermissionMapper.delete(bean);
    }
	
	

    
}
