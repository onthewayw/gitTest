package com.zuma.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPositionBean;
import com.zuma.mapper.ZumaPositionBeanMapper;
import com.zuma.service.ZumaPositionService;

@Service
public class ZumaPositionServiceImpl implements ZumaPositionService {

	@Autowired
	private ZumaPositionBeanMapper positionBeanMapper;
	
	
	//根据传入参数查询
	@Override
	public PagerBean findPage(ZumaPositionBean positionBean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(positionBean);
        int count = positionBeanMapper.findCountByConditions(positionBean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(positionBeanMapper.findPageByConditions(positionBean));
        return pagerBean;
	}
	//根据传入参数查询
	@Override
	public List<ZumaPositionBean> findListByConditions(ZumaPositionBean positionBean) {
		return positionBeanMapper.findListByConditions(positionBean);
	}
	//新增
	@Override
	public void add(ZumaPositionBean positionBean) {
		//生成UUID作为主键
		String uuid = UUID.randomUUID().toString().replace("-","");
		positionBean.setfId(uuid);
		//添加时间
		Date date = new Date();
		positionBean.setfCreateTime(date);
		positionBeanMapper.add(positionBean);
	}
	//修改
	@Override
	public void modify(ZumaPositionBean positionBean) {
		//修改时间
		Date date = new Date();
		positionBean.setfUpdateTime(date);
		positionBeanMapper.modify(positionBean);
	}
	//根据物理主键查询
	@Override
	public ZumaPositionBean findById(String fId) {
		return positionBeanMapper.findById(fId);
	}
	//删除
	@Override
	public void deleteByPrimary(String fId) {
		positionBeanMapper.deleteByPrimary(fId);
	}
	
}
