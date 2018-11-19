package com.zuma.controller;

import com.zuma.service.SysSiteUserService;
import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.SysSiteUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by liuenxi on 2018/1/8.
 */
@RestController
@RequestMapping("/sysSiteUserBean")
public class SysSiteUserController {

    @Autowired
    private SysSiteUserService sysSiteUserService;


    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }*/
    /**
     * 根据传入参数分页查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(SysSiteUserBean userBean){
        return new ResponseEntity<PagerBean>(sysSiteUserService.findPage(userBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询用户列表
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<SysSiteUserBean>> findList(SysSiteUserBean userBean){
        return new ResponseEntity<List<SysSiteUserBean>>(sysSiteUserService.findListByConditions(userBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一用户
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<SysSiteUserBean> findById(@PathVariable String fId){
        return new ResponseEntity<SysSiteUserBean>(sysSiteUserService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody SysSiteUserBean userBean){
        sysSiteUserService.add(userBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody SysSiteUserBean userBean){
        sysSiteUserService.modify(userBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除用户
     * @param userBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(@RequestBody SysSiteUserBean userBean){
        sysSiteUserService.delete(userBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
