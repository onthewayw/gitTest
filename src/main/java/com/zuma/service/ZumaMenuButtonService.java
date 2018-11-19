package com.zuma.service;

import java.util.List;
import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaMenuButtonBean;

public interface ZumaMenuButtonService {
	public PagerBean findPage(ZumaMenuButtonBean menuButtonBean);

    public List<ZumaMenuButtonBean> findListByConditions(ZumaMenuButtonBean menuButtonBean);

    public ZumaMenuButtonBean findById(String fId);

    public Integer add(ZumaMenuButtonBean menuButtonBean);

    public Integer modify(ZumaMenuButtonBean menuButtonBean);

    public void delete(ZumaMenuButtonBean menuButtonBean);	
}
