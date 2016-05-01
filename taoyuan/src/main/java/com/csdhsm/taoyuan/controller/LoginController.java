package com.csdhsm.taoyuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.csdhsm.taoyuan.service.UserService;
  
/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  LoginController.java   
 * @Package com.csdhsm.taoyuan.controller   
 * @Description: The controller of user to login or user to register
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月1日 下午3:57:26   
 * @version:V1.0     
 */  
@Controller
public class LoginController {
	
	/**   
	 * @Fields service : UserService 
	 */ 
	@Autowired
	private UserService service;

	/**   
	 * @Title: login   
	 * @Description: TODO 
	 * @return: ModelAndView      
	 * @throws: 
	 * @Autor: Han
	 */ 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String userName, String passwd) {
		
		ModelAndView view = new ModelAndView();
		
		return view;
	}
}
