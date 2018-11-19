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
import com.zuma.entity.ZumaDepartPositionBean;
import com.zuma.service.ZumaDepartPositionService;


/**
 * Created by XieDiyu on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaDepartPosition")
public class ZumaDepartPositionController {
	
	@Autowired
    private ZumaDepartPositionService zumaDepartPositionService;


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    /**
     * 根据传入参数分页查询列表
     * @param positionBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaDepartPositionBean positionBean){
        return new ResponseEntity<PagerBean>(zumaDepartPositionService.findPage(positionBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询列表
     * @param positionBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaDepartPositionBean>> findList(ZumaDepartPositionBean positionBean){
        return new ResponseEntity<List<ZumaDepartPositionBean>>(zumaDepartPositionService.findListByConditions(positionBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询
     * @param fId
     * @return
     */
    @RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaDepartPositionBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaDepartPositionBean>(zumaDepartPositionService.findById(fId), HttpStatus.OK);
    }

    /**
     * 新增
     * @param positionBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaDepartPositionBean positionBean){
        zumaDepartPositionService.add(positionBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改
     * @param positionBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaDepartPositionBean positionBean){
        zumaDepartPositionService.modify(positionBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除
     * @param positionBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaDepartPositionBean positionBean){
        zumaDepartPositionService.delete(positionBean);
        return new ResponseEntity(HttpStatus.OK);
    }
}
