package com.csdhsm.taoyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.service.InfoService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoController.java   
 * @Package com.csdhsm.taoyuan.controller   
 * @Description: TODO 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午5:00:46   
 * @version:V1.0     
 */  
@Controller
public class InfoController {
	
	/**   
	 * @Fields service : The service of InfoController
	 */ 
	@Autowired
	private InfoService service;
	
	/**   
	 * <p>Title: showMessage</p>   
	 * <p>Description: showMessage and jump to index </p> 
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping(value = "showMessage")
	public ModelAndView showMessage(){
		
		return new ModelAndView("showMessage");
	}
	
	/**   
	 * <p>Title: toIndex</p>   
	 * <p>Description: jump to index page</p> 
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping(value = {"/","/index"})
	public ModelAndView toIndex(){
		
		ModelAndView view = new ModelAndView("index");
		List<InfoCategory> categories = service.getCategories();
		//the info is newest
		List<Info> theInfoOfNew = service.getInfosBySorted(" add_time desc");
		//the info is ishot
		List<Info> theInfoOfRecommend = service.getInfosBySorted(" isHot desc");
		
		view.addObject("theInfoOfNew", theInfoOfNew);
		view.addObject("theInfoOfRecommend", theInfoOfRecommend);
		view.addObject("categories", categories);
		
		return view;
	}
}
