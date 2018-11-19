package com.zuma.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaButtonBean;
import com.zuma.service.ZumaButtonService;


/**
 * Created by XieDiyu on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaButton")
public class ZumaButtonController {
	
	@Autowired
    private ZumaButtonService zumaButtonService;


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    /**
     * 根据传入参数分页查询按钮列表
     * @param buttonBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaButtonBean buttonBean){
        return new ResponseEntity<PagerBean>(zumaButtonService.findPage(buttonBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询按钮列表
     * @param buttonBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaButtonBean>> findList(ZumaButtonBean buttonBean){
        return new ResponseEntity<List<ZumaButtonBean>>(zumaButtonService.findListByConditions(buttonBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一按钮
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaButtonBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaButtonBean>(zumaButtonService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增按钮
     * @param buttonBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaButtonBean buttonBean){
        zumaButtonService.add(buttonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改按钮
     * @param buttonBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaButtonBean buttonBean){
        zumaButtonService.modify(buttonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除按钮
     * @param buttonBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaButtonBean buttonBean){
        zumaButtonService.delete(buttonBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
