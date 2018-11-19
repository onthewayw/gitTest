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
import com.zuma.entity.ZumaMenuBean;
import com.zuma.service.ZumaMenuService;

@RestController
@RequestMapping("/zumaMenu")
public class ZumaMenuController {
	@Autowired
	ZumaMenuService zumaMenuService;
	
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
    public HttpEntity<PagerBean> findPage(ZumaMenuBean menuBean){
        return new ResponseEntity<PagerBean>(zumaMenuService.findPage(menuBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaMenuBean>> findList(ZumaMenuBean menuBean){
        return new ResponseEntity<List<ZumaMenuBean>>(zumaMenuService.findListByConditions(menuBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一用户
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaMenuBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaMenuBean>(zumaMenuService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody  HttpEntity add(@RequestBody ZumaMenuBean menuBean){
    	zumaMenuService.add(menuBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaMenuBean menuBean){
    	zumaMenuService.modify(menuBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public @ResponseBody HttpEntity delete( ZumaMenuBean menuBean){
    	zumaMenuService.delete(menuBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
