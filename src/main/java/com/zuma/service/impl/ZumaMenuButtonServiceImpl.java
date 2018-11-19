package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaMenuButtonBean;
import com.zuma.mapper.ZumaMenuButtonBeanMapper;
import com.zuma.service.ZumaMenuButtonService;
@Service
public class ZumaMenuButtonServiceImpl implements ZumaMenuButtonService{
	@Autowired
	ZumaMenuButtonBeanMapper zumaMenuButtonBeanMapper;
	@Override
	public PagerBean findPage(ZumaMenuButtonBean menuButtonBean) {
		PagerBean pagerBean = new PagerBean();
		pagerBean.setPager(menuButtonBean);
		int count = zumaMenuButtonBeanMapper.findCountByConditions(menuButtonBean);
		pagerBean.setCount(count);
		pagerBean.setTotal(count);
		pagerBean.setData(zumaMenuButtonBeanMapper.findPageByConditions(menuButtonBean));
		return pagerBean;
	}

	@Override
	public List<ZumaMenuButtonBean> findListByConditions(ZumaMenuButtonBean menuButtonBean) {
		return zumaMenuButtonBeanMapper.findListByConditions(menuButtonBean);
	}

	@Override
	public ZumaMenuButtonBean findById(String fId) {
		return zumaMenuButtonBeanMapper.findById(fId);
	}

	@Override
	public Integer add(ZumaMenuButtonBean menuButtonBean) {
		Date now = new Date();
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String fId = str.replace("-", "");
		menuButtonBean.setfId(fId);
		menuButtonBean.setfCreateTime(now);
		menuButtonBean.setfUpdateTime(now);
		return zumaMenuButtonBeanMapper.add(menuButtonBean);
	}

	@Override
	public Integer modify(ZumaMenuButtonBean menuButtonBean) {
		return zumaMenuButtonBeanMapper.modify(menuButtonBean);
	}

	@Override
	public void delete(ZumaMenuButtonBean menuButtonBean) {
		zumaMenuButtonBeanMapper.delete(menuButtonBean);
	}

}
