package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaRoleBean;
import com.zuma.mapper.ZumaRoleBeanMapper;
import com.zuma.service.ZumaRoleService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@Service
public class ZumaRoleServiceImpl implements ZumaRoleService {
	@Autowired
    private ZumaRoleBeanMapper roleMapper;
	
	@Override
	public PagerBean findPage(ZumaRoleBean bean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(bean);
        int count = roleMapper.findCountByConditions(bean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(roleMapper.findPageByConditions(bean));
        return pagerBean;
	}

	@Override
	public List<ZumaRoleBean> findListByConditions(ZumaRoleBean bean) {
		return roleMapper.findListByConditions(bean);
	}

    /*@Override
    public ZumaRoleBean findById(String fId) {
        return roleMapper.findById(fId);
    }*/

    @Override
    public Integer add(ZumaRoleBean bean) {
        return roleMapper.add(bean);
    }

    @Override
    public Integer modify(ZumaRoleBean bean) {
        return roleMapper.modify(bean);
    }

    @Override
    public void delete(ZumaRoleBean bean) {
        roleMapper.delete(bean);
    }

    
}
