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
import com.zuma.entity.ZumaPermissionProjectRequestBean;
import com.zuma.service.ZumaPermissionProjectRequestService;


/**
 * 
    * @ClassName: ZumaPermissionProjectRequestController
    * @Description: TODO()
    * @author zhangli
    * @date 2018年1月10日 下午3:58:32
    *
 */
@RestController
@RequestMapping("/projectRequestController")
public class ZumaPermissionProjectRequestController {

	
	@Autowired
	private ZumaPermissionProjectRequestService projectRequestService;
	
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
    public HttpEntity<PagerBean> findPage(ZumaPermissionProjectRequestBean projectRequestBean){
        return new ResponseEntity<PagerBean>(projectRequestService.findPage(projectRequestBean), HttpStatus.OK);
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
    public HttpEntity<List<ZumaPermissionProjectRequestBean>> findList(ZumaPermissionProjectRequestBean projectRequestBean){
        return new ResponseEntity<List<ZumaPermissionProjectRequestBean>>(projectRequestService.findListByConditions(projectRequestBean), HttpStatus.OK);
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
    public HttpEntity add(@RequestBody ZumaPermissionProjectRequestBean projectRequestBean){
		projectRequestService.add(projectRequestBean);
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
    public HttpEntity modify(@RequestBody ZumaPermissionProjectRequestBean projectRequestBean){
		projectRequestService.modify(projectRequestBean);
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
    public HttpEntity<ZumaPermissionProjectRequestBean> findById(@PathVariable String fId){
        return new ResponseEntity<ZumaPermissionProjectRequestBean>(projectRequestService.findById(fId), HttpStatus.OK);
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
		projectRequestService.deleteByPrimary(fId);
        return new ResponseEntity(HttpStatus.OK);
    }
	
}
