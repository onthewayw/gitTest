package com.zuma.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaProjectBean;
import com.zuma.entity.ZumaRoleBean;
import com.zuma.service.ZumaProjectService;



@RestController
@RequestMapping("/zumaProjectBean")
public class ZumaProjectController {
	@Autowired
    private ZumaProjectService zumaProjectService;
	
	/**
     * 根据传入参数分页查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaProjectBean projectBean){
        return new ResponseEntity<PagerBean>(zumaProjectService.findPage(projectBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaProjectBean>> findList(ZumaProjectBean projectBean){
        return new ResponseEntity<List<ZumaProjectBean>>(zumaProjectService.findListByConditions(projectBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaProjectBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaProjectBean>(zumaProjectService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody HttpEntity add(@RequestBody ZumaProjectBean projectBean){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	projectBean.setfId(uuid);
    	projectBean.setfCreateTime(new Date());
    	projectBean.setfCreateType(1);
    	projectBean.setfCreateId("001");
    	zumaProjectService.add(projectBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaProjectBean projectBean){
    	projectBean.setfUpdateTime(new Date());
    	zumaProjectService.modify(projectBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaProjectBean projectBean){
    	zumaProjectService.delete(projectBean);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
