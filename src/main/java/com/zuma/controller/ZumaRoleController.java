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
import com.zuma.entity.ZumaRoleBean;
import com.zuma.service.ZumaRoleService;

/**
 * Created by yehaomiao on 2018/1/10.
 */
@RestController
@RequestMapping("/zumaRole")
public class ZumaRoleController {

    @Autowired
    private ZumaRoleService zumaRoleService;


    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }*/
    /**
     * 根据传入参数分页查询角色列表
     * @param roleBean
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaRoleBean roleBean){
        return new ResponseEntity<PagerBean>(zumaRoleService.findPage(roleBean), HttpStatus.OK);
    }

    /**
     * 根据传入参数查询角色列表
     * @param roleBean
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaRoleBean>> findList(ZumaRoleBean roleBean){
        return new ResponseEntity<List<ZumaRoleBean>>(zumaRoleService.findListByConditions(roleBean), HttpStatus.OK);
    }
    /**
     * 根据物理主键查询单一角色
     * @param fId
     * @return
     */
    /*@RequestMapping(value = "/findByfId", method = RequestMethod.GET)
    public @ResponseBody HttpEntity<ZumaRoleBean> findById(String fId){
        return new ResponseEntity<ZumaRoleBean>(zumaRoleService.findById(fId), HttpStatus.OK);
    }*/

    /**
     * 新增角色
     * @param roleBean
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody HttpEntity add(@RequestBody ZumaRoleBean roleBean){
    	String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    	roleBean.setfId(uuid);
    	roleBean.setfCreateTime(new Date());
    	roleBean.setfCreateType(1);
    	roleBean.setfCreateId("001");
    	zumaRoleService.add(roleBean);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 修改角色
     * @param roleBean
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaRoleBean roleBean){
    	roleBean.setfUpdateTime(new Date());
    	roleBean.setfUpdateType(1);
    	roleBean.setfUpdateId("001");
    	zumaRoleService.modify(roleBean);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
    /**
     * 删除角色
     * @param roleBean
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(ZumaRoleBean roleBean){
    	zumaRoleService.delete(roleBean);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
