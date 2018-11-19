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
import com.zuma.entity.ZumaMenuButtonBean;
import com.zuma.service.ZumaMenuButtonService;

@RestController
@RequestMapping("/zumaMenuButton")
public class ZumaMenuButtonController {
	@Autowired
	ZumaMenuButtonService zumaMenuButtonService;
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	 /**
     * 根据传入参数分页查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaMenuButtonBean menuButtonBean){
        return new ResponseEntity<PagerBean>(zumaMenuButtonService.findPage(menuButtonBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaMenuButtonBean>> findList(ZumaMenuButtonBean menuButtonBean){
        return new ResponseEntity<List<ZumaMenuButtonBean>>(zumaMenuButtonService.findListByConditions(menuButtonBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一用户
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaMenuButtonBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaMenuButtonBean>(zumaMenuButtonService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody HttpEntity add(@RequestBody ZumaMenuButtonBean menuButtonBean){
    	zumaMenuButtonService.add(menuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaMenuButtonBean menuButtonBean){
    	zumaMenuButtonService.modify(menuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public @ResponseBody HttpEntity delete(ZumaMenuButtonBean menuButtonBean){
    	zumaMenuButtonService.delete(menuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
