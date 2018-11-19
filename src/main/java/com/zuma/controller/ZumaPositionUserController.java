package com.zuma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zuma.common.utils.rpc.PagerBean;
import com.zuma.entity.ZumaPositionBean;
import com.zuma.entity.ZumaPositionUserBean;
import com.zuma.service.ZumaPositionUserService;



/**
 * 
    * @ClassName: ZumaPositionUserController
    * @Description: TODO()
    * @author zhangli
    * @date 2018年1月10日 下午4:51:13
    *
 */
@RestController
@RequestMapping("/positionUserController")
public class ZumaPositionUserController {

	@Autowired
	private ZumaPositionUserService positionUserService;
	
	
	/**
	 * 
	    * @Title: findPage
	    * @Description: TODO(根据传入参数分页查询)
	    * @param @param userBean
	    * @param @return    参数
	    * @return HttpEntity<PagerBean>    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/page", method = RequestMethod.GET)
    public HttpEntity<PagerBean> findPage(ZumaPositionUserBean positionUserBean){
        return new ResponseEntity<PagerBean>(positionUserService.findPage(positionUserBean), HttpStatus.OK);
    }
	
	
	/**
	 * 
	    * @Title: findList
	    * @Description: TODO(根据传入参数查询)
	    * @param @param userBean
	    * @param @return    参数
	    * @return HttpEntity<List<SysSiteUserBean>>    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public HttpEntity<List<ZumaPositionUserBean>> findList(ZumaPositionUserBean positionUserBean){
        return new ResponseEntity<List<ZumaPositionUserBean>>(positionUserService.findListByConditions(positionUserBean), HttpStatus.OK);
    }
	
	
	/**
	 * 
	    * @Title: add
	    * @Description: TODO(新增)
	    * @param @param userBean
	    * @param @return    参数
	    * @return HttpEntity    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpEntity add(@RequestBody ZumaPositionUserBean positionUserBean){
		positionUserService.add(positionUserBean);
        return new ResponseEntity(HttpStatus.OK);
    }
	
	
	
	/**
	 * 
	    * @Title: modify
	    * @Description: TODO(修改)
	    * @param @param userBean
	    * @param @return    参数
	    * @return HttpEntity    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public HttpEntity modify(@RequestBody ZumaPositionUserBean positionUserBean){
		positionUserService.modify(positionUserBean);
        return new ResponseEntity(HttpStatus.OK);
    }
	
	
	/**
	 * 
	    * @Title: findById
	    * @Description: TODO(根据物理主键查询)
	    * @param @param fId
	    * @param @return    参数
	    * @return HttpEntity<SysSiteUserBean>    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/{fId}", method = RequestMethod.GET)
    public HttpEntity<ZumaPositionUserBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaPositionUserBean>(positionUserService.findById(fId), HttpStatus.OK);
    }
	
	
	/**
	 * 
	    * @Title: delete
	    * @Description: TODO(删除)
	    * @param @param permissionProjectBean
	    * @param @return    参数
	    * @return HttpEntity    返回类型
	    * @throws
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpEntity delete(@RequestParam String fId){
		positionUserService.deleteByPrimary(fId);
        return new ResponseEntity(HttpStatus.OK);
    }
	
}
