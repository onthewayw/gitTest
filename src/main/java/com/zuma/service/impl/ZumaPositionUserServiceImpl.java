package com.zuma.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPositionUserBean;
import com.zuma.mapper.ZumaPositionUserBeanMapper;
import com.zuma.service.ZumaPositionUserService;


@Service
public class ZumaPositionUserServiceImpl implements ZumaPositionUserService {

	@Autowired
	private ZumaPositionUserBeanMapper positionUserBeanMapper;

	
	//根据传入参数分页查询
	@Override
	public PagerBean findPage(ZumaPositionUserBean positionUserBean) {
		PagerBean pagerBean = new PagerBean();
        pagerBean.setPager(positionUserBean);
        int count = positionUserBeanMapper.findCountByConditions(positionUserBean);
        pagerBean.setCount(count);
        pagerBean.setTotal(count);
        pagerBean.setData(positionUserBeanMapper.findPageByConditions(positionUserBean));
        return pagerBean;
	}

	//根据传入参数查询
	@Override
	public List<ZumaPositionUserBean> findListByConditions(ZumaPositionUserBean positionUserBean) {
		return positionUserBeanMapper.findListByConditions(positionUserBean);
	}
	
	//新增
	@Override
	public void add(ZumaPositionUserBean positionUserBean) {
		//生成UUID作为主键
		String uuid = UUID.randomUUID().toString().replace("-","");
		positionUserBean.setfId(uuid);
		//添加时间
		Date date = new Date();
		positionUserBean.setfCreateTime(date);
		positionUserBeanMapper.add(positionUserBean);
	}
	
	//修改
	@Override
	public void modify(ZumaPositionUserBean positionUserBean) {
		//修改时间
		Date date = new Date();
		positionUserBean.setfUpdateTime(date);
		positionUserBeanMapper.modify(positionUserBean);
	}
	
	//根据物理主键查询
	@Override
	public ZumaPositionUserBean findById(String fId) {
		return positionUserBeanMapper.findById(fId);
	}

	//删除
	@Override
	public void deleteByPrimary(@RequestParam String fId) {
		positionUserBeanMapper.deleteByPrimary(fId);
	}
	
	
}
