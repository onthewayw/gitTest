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
import com.zuma.entity.ZumaDepartBean;
import com.zuma.service.ZumaDepartService;


/**
 * Created by XieDiyu on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaDepart")
public class ZumaDepartController {
	
	@Autowired
    private ZumaDepartService zumaDepartService;


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
    public HttpEntity<PagerBean> findPage(ZumaDepartBean departBean){
        return new ResponseEntity<PagerBean>(zumaDepartService.findPage(departBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaDepartBean>> findList(ZumaDepartBean departBean){
        return new ResponseEntity<List<ZumaDepartBean>>(zumaDepartService.findListByConditions(departBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaDepartBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaDepartBean>(zumaDepartService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaDepartBean departBean){
        zumaDepartService.add(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaDepartBean departBean){
        zumaDepartService.modify(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param departBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaDepartBean departBean){
        zumaDepartService.delete(departBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
