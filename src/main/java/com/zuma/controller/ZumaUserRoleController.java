package com.zuma.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaUserRoleBean;
import com.zuma.entity.ZumaUserRoleBean;
import com.zuma.service.ZumaUserRoleService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaUserRole")
public class ZumaUserRoleController {

    @Autowired
    private ZumaUserRoleService zumaUserRoleService;


    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }*/
    /**
     * 根据传入参数分页查询用户列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaUserRoleBean model){
        return new ResponseEntity<PagerBean>(zumaUserRoleService.findPage(model), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询用户列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaUserRoleBean>> findList(ZumaUserRoleBean model){
        return new ResponseEntity<List<ZumaUserRoleBean>>(zumaUserRoleService.findListByConditions(model), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一用户
     * @param fId
     * @return
     */
    /*@RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaUserRoleBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaUserRoleBean>(zumaUserRoleService.findById(fId), HttpStatus.OK);
    }*/

    /**
     * 新增用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaUserRoleBean model){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	model.setfId(uuid);
    	model.setfCreateTime(new Date());
    	model.setfCreateType(1);
    	model.setfCreateId("001");
        zumaUserRoleService.add(model);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaUserRoleBean model){
    	model.setfUpdateTime(new Date());
    	model.setfUpdateType(1);
    	model.setfUpdateId("001");
        zumaUserRoleService.modify(model);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaUserRoleBean model){
        zumaUserRoleService.delete(model);
        return new ResponseEntity(HttpStatus.OK);
    }
}
