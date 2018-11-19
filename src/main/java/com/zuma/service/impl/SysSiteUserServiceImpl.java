package com.zuma.service.impl;

import com.zuma.service.SysSiteUserService;
import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.SysSiteUserBean;
import com.zuma.mapper.SysSiteUserBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuenxi on 2018/1/8.
 */
@Service
public class SysSiteUserServiceImpl implements SysSiteUserService {

    @Autowired
    private SysSiteUserBeanMapper userMapper;

    @Override
    public PagerBean findPage(SysSiteUserBean userBean) {
        PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(userBean);
        int count = userMapper.findCountByConditions(userBean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(userMapper.findPageByConditions(userBean));
        return pagerBean;
    }

    @Override
    public List<SysSiteUserBean> findListByConditions(SysSiteUserBean userBean) {
        return userMapper.findListByConditions(userBean);
    }

    @Override
    public SysSiteUserBean findById(String fId) {
        return userMapper.findById(fId);
    }

    @Override
    public Integer add(SysSiteUserBean userBean) {
        return userMapper.add(userBean);
    }

    @Override
    public Integer modify(SysSiteUserBean userBean) {
        return userMapper.modify(userBean);
    }

    @Override
    public void delete(SysSiteUserBean userBean) {
        userMapper.delete(userBean);
    }
}
