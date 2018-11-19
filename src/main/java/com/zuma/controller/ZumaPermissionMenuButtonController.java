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
import com.zuma.entity.ZumaPermissionMenuButtonBean;
import com.zuma.service.ZumaPermissionMenuButtonService;

@RestController
@RequestMapping("/zumaPermissionMenuButton")
public class ZumaPermissionMenuButtonController {
	@Autowired
	ZumaPermissionMenuButtonService zumaPermissionMenuButtonService;
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
    public HttpEntity<PagerBean> findPage(ZumaPermissionMenuButtonBean permissionMenuButtonBean){
        return new ResponseEntity<PagerBean>(zumaPermissionMenuButtonService.findPage(permissionMenuButtonBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaPermissionMenuButtonBean>> findList(ZumaPermissionMenuButtonBean permissionMenuButtonBean){
        return new ResponseEntity<List<ZumaPermissionMenuButtonBean>>(zumaPermissionMenuButtonService.findListByConditions(permissionMenuButtonBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一用户
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaPermissionMenuButtonBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaPermissionMenuButtonBean>(zumaPermissionMenuButtonService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody HttpEntity add(@RequestBody ZumaPermissionMenuButtonBean permissionMenuButtonBean){
    	zumaPermissionMenuButtonService.add(permissionMenuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaPermissionMenuButtonBean permissionMenuButtonBean){
    	zumaPermissionMenuButtonService.modify(permissionMenuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public @ResponseBody HttpEntity delete(ZumaPermissionMenuButtonBean permissionMenuButtonBean){
    	zumaPermissionMenuButtonService.delete(permissionMenuButtonBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
