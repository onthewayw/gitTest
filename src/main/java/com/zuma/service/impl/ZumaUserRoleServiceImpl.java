package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaUserRoleBean;
import com.zuma.mapper.ZumaUserRoleBeanMapper;
import com.zuma.service.ZumaUserRoleService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@Service
public class ZumaUserRoleServiceImpl implements ZumaUserRoleService{
	@Autowired
    private ZumaUserRoleBeanMapper userRoleMapper;
	
	@Override
	public PagerBean findPage(ZumaUserRoleBean bean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(bean);
        int count = userRoleMapper.findCountByConditions(bean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(userRoleMapper.findPageByConditions(bean));
        return pagerBean;
	}

	@Override
	public List<ZumaUserRoleBean> findListByConditions(ZumaUserRoleBean bean) {
		return userRoleMapper.findListByConditions(bean);
	}

    /*@Override
    public ZumaUserRoleBean findById(String fId) {
        return userRoleMapper.findById(fId);
    }*/

    @Override
    public Integer add(ZumaUserRoleBean bean) {
        return userRoleMapper.add(bean);
    }

    @Override
    public Integer modify(ZumaUserRoleBean bean) {
        return userRoleMapper.modify(bean);
    }

    @Override
    public void delete(ZumaUserRoleBean bean) {
        userRoleMapper.delete(bean);
    }
}
