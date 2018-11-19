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
import com.zuma.entity.ZumaProjectRequestBean;
import com.zuma.service.ZumaProjectRequestService;



@RestController
@RequestMapping("/zumaProjectRequestBean")
public class ZumaProjectRequestController {
	@Autowired
    private ZumaProjectRequestService zumaProjectRequestService;
	
	/**
     * 根据传入参数分页查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaProjectRequestBean projectRequestBean){
        return new ResponseEntity<PagerBean>(zumaProjectRequestService.findPage(projectRequestBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaProjectRequestBean>> findList(ZumaProjectRequestBean projectRequestBean){
        return new ResponseEntity<List<ZumaProjectRequestBean>>(zumaProjectRequestService.findListByConditions(projectRequestBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaProjectRequestBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaProjectRequestBean>(zumaProjectRequestService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaProjectRequestBean projectRequestBean){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	projectRequestBean.setfId(uuid);
    	projectRequestBean.setfCreateTime(new Date());
    	zumaProjectRequestService.add(projectRequestBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaProjectRequestBean projectRequestBean){
    	projectRequestBean.setfUpdateTime(new Date());
    	zumaProjectRequestService.modify(projectRequestBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaProjectRequestBean projectRequestBean){
    	zumaProjectRequestService.delete(projectRequestBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
