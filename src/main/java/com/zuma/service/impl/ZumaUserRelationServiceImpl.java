package com.zuma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaUserRelationBean;
import com.zuma.mapper.ZumaUserRelationBeanMapper;
import com.zuma.service.ZumaUserRelationService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@Service
public class ZumaUserRelationServiceImpl implements ZumaUserRelationService {
	@Autowired
    private ZumaUserRelationBeanMapper userRelationMapper;

	@Override
	public PagerBean findPage(ZumaUserRelationBean bean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(bean);
        int count = userRelationMapper.findCountByConditions(bean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(userRelationMapper.findPageByConditions(bean));
        return pagerBean;
	}

	@Override
	public List<ZumaUserRelationBean> findListByConditions(ZumaUserRelationBean bean) {
		return userRelationMapper.findListByConditions(bean);
	}

    /*@Override
    public ZumaUserRelationBean findById(String fId) {
        return userRelationMapper.findById(fId);
    }*/

    @Override
    public Integer add(ZumaUserRelationBean bean) {
        return userRelationMapper.add(bean);
    }

    @Override
    public Integer modify(ZumaUserRelationBean bean) {
        return userRelationMapper.modify(bean);
    }

    @Override
    public void delete(ZumaUserRelationBean bean) {
        userRelationMapper.delete(bean);
    }
}
