package com.zuma.service;

import java.util.List;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectMenuBean;

public interface ZumaProjectMenuService {
	public PagerBean findPage(ZumaProjectMenuBean projectMenuBean);

    public List<ZumaProjectMenuBean> findListByConditions(ZumaProjectMenuBean projectMenuBean);

    public ZumaProjectMenuBean findById(String fId);

    public Integer add(ZumaProjectMenuBean projectMenuBean);

    public Integer modify(ZumaProjectMenuBean projectMenuBean);

    public void delete(ZumaProjectMenuBean projectMenuBean);
}
