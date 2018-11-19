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
import com.zuma.entity.ZumaRequestBean;
import com.zuma.service.ZumaProjectService;
import com.zuma.service.ZumaRequestService;

@RestController
@RequestMapping("/zumaRequestBean")
public class ZumaRequestController {
	@Autowired
    private ZumaRequestService zumaRequestService;
	
	/**
     * 根据传入参数分页查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaRequestBean requestBean){
        return new ResponseEntity<PagerBean>(zumaRequestService.findPage(requestBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaRequestBean>> findList(ZumaRequestBean requestBean){
        return new ResponseEntity<List<ZumaRequestBean>>(zumaRequestService.findListByConditions(requestBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaRequestBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaRequestBean>(zumaRequestService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaRequestBean requestBean){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	requestBean.setfId(uuid);
    	requestBean.setfCreateTime(new Date());
    	zumaRequestService.add(requestBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaRequestBean requestBean){
    	requestBean.setfUpdateTime(new Date());
    	zumaRequestService.modify(requestBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaRequestBean requestBean){
    	zumaRequestService.delete(requestBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
