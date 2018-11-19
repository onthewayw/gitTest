package com.zuma.service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.SysSiteUserBean;

import java.util.List;

/**
 * Created by liuenxi on 2018/1/8.
 */
public interface SysSiteUserService {

    public PagerBean findPage(SysSiteUserBean userBean);

    public List<SysSiteUserBean> findListByConditions(SysSiteUserBean userBean);

    public SysSiteUserBean findById(String fId);

    public Integer add(SysSiteUserBean userBean);

    public Integer modify(SysSiteUserBean userBean);

    public void delete(SysSiteUserBean userBean);
}
