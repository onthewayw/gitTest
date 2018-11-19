package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaUserRelationBean;

/**
 * Created by yehaomiao on 2018/1/10.
 */
public interface ZumaUserRelationService {

	public PagerBean findPage(ZumaUserRelationBean userBean);

	public List<ZumaUserRelationBean> findListByConditions(ZumaUserRelationBean userBean);

	//public ZumaUserRelationBean findById(String fId);

	public Integer add(ZumaUserRelationBean userBean);

	public Integer modify(ZumaUserRelationBean userBean);

	public void delete(ZumaUserRelationBean userBean);
}