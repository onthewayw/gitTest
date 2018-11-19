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
import com.zuma.entity.ZumaDepartUserBean;
import com.zuma.service.ZumaDepartUserService;


/**
 * Created by XieDiyu on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaDepartUser")
public class ZumaDepartUserController {
	
	@Autowired
    private ZumaDepartUserService zumaDepartUserService;


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    /**
     * 根据传入参数分页查询列表
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaDepartUserBean departBean){
        return new ResponseEntity<PagerBean>(zumaDepartUserService.findPage(departBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaDepartUserBean>> findList(ZumaDepartUserBean departBean){
        return new ResponseEntity<List<ZumaDepartUserBean>>(zumaDepartUserService.findListByConditions(departBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaDepartUserBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaDepartUserBean>(zumaDepartUserService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaDepartUserBean departBean){
        zumaDepartUserService.add(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaDepartUserBean departBean){
        zumaDepartUserService.modify(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaDepartUserBean departBean){
        zumaDepartUserService.delete(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
