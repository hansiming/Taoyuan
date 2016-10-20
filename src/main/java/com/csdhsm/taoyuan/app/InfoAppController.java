package com.csdhsm.taoyuan.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.PageBean;
import com.csdhsm.taoyuan.service.InfoService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoController.java   
 * @Package com.csdhsm.taoyuan.app   
 * @Description: 移动App InfoController
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月21日 下午7:22:18   
 * @version:V1.0     
 */  
@Controller
public class InfoAppController {
	
	/**   
	 * @Fields service : The service of InfoController
	 */ 
	@Autowired
	private InfoService service;
	
	/**   
	 * <p>Title: getInfoList</p>   
	 * <p>Description: </p> 
	 * @param:  @return  
	 * @return: List<Info>
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping("app/getInfoList")
	public List<Info> getInfoList() {
		
		List<Info> list = service.getInfoList();
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("app/getInfoListByCateId")
	public List<Info> getInfoList(@RequestParam(value = "cateId")int cateId) {
		
		PageBean<Info> pageBean = new PageBean<Info>();
		
		pageBean.setCateId(cateId);
		
		PageBean<Info> list = service.getInfoListByPageBean(pageBean);
		
		return list.getPageDatas();
	}
}
