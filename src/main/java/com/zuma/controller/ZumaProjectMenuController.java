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
import com.zuma.entity.ZumaProjectMenuBean;
import com.zuma.service.ZumaProjectMenuService;

@RestController
@RequestMapping("/zumaProjectMenuBean")
public class ZumaProjectMenuController {
	@Autowired
    private ZumaProjectMenuService zumaProjectMenuService;
	
	/**
     * 根据传入参数分页查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaProjectMenuBean projectMenuBean){
        return new ResponseEntity<PagerBean>(zumaProjectMenuService.findPage(projectMenuBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaProjectMenuBean>> findList(ZumaProjectMenuBean projectMenuBean){
        return new ResponseEntity<List<ZumaProjectMenuBean>>(zumaProjectMenuService.findListByConditions(projectMenuBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaProjectMenuBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaProjectMenuBean>(zumaProjectMenuService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaProjectMenuBean projectMenuBean){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	projectMenuBean.setfId(uuid);
    	projectMenuBean.setfCreateTime(new Date());
    	zumaProjectMenuService.add(projectMenuBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaProjectMenuBean projectMenuBean){
    	projectMenuBean.setfUpdateTime(new Date());
    	zumaProjectMenuService.modify(projectMenuBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaProjectMenuBean projectMenuBean){
    	zumaProjectMenuService.delete(projectMenuBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
