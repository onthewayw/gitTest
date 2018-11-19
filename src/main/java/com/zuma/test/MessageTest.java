package com.zuma.test;

import com.zuma.entity.SysSiteUserBean;
import com.zuma.service.SysSiteUserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuenxi on 2018/1/13.
 */
@Service
public class MessageTest implements InitializingBean {

    @Autowired
    private SysSiteUserService sysSiteUserService;
    @Override
    public void afterPropertiesSet() throws Exception {
        List<SysSiteUserBean> userBeanList = sysSiteUserService.findListByConditions(new SysSiteUserBean());
        System.out.println("---size--" + userBeanList.size());
        System.out.println("---test--");
    }
}
