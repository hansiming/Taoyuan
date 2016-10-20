package com.csdhsm.taoyuan.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.csdhsm.taoyuan.models.BaseResponseByJson;
import com.csdhsm.taoyuan.models.SendMail;
import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.UserService;
import com.csdhsm.taoyuan.utils.EmailUtil;
import com.csdhsm.taoyuan.utils.MD5Util;

/**
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title: LoginController.java
 * @Package com.csdhsm.taoyuan.controller
 * @Description: The controller of user to login or user to register
 * @author: Han
 * @E-mail: 294098789@qq.com
 * @date: 2016年5月1日 下午3:57:26
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
	 * @Fields json : The json of LoginController
	 */
	@Autowired
	private BaseResponseByJson json;

	/**
	 * @Fields mail : The mail of LoginController
	 */
	@Autowired
	private SendMail mail;

	/**
	 * @Fields userLogin : The userLogin of LoginController
	 */
	@Autowired
	private UserLogin userLogin;

	/**
	 * @Fields code : The code of LoginController
	 */
	@Autowired
	private UserComfirmCode code;

	/**
	 * <p>Title: checkUserNameExist</p>
	 * <p> Description:</p>
	 * @param: @param userName
	 * @return: BaseResponseByJson
	 * @Autor: Han
	 */
	@ResponseBody
	@RequestMapping(value = "/register/checkUserName", method = RequestMethod.POST)
	public BaseResponseByJson checkUserNameExist(String userName) {

		int status = service.checkUserNameExist(userName);

		if (status == 0) {

			// if the status is 1 ,the userName has been used
			json.setStatus(status);
			json.setMessage("该用户名已被注册");
		} else {

			// the username has not been use
			json.setStatus(status);
			json.setMessage("恭喜!该用户名可以使用");
		}

		return json;
	}

	/**
	 * <p>Title: checkUserEmailExist</p>
	 * <p>Description: 检测用户是否被注册</p>
	 * @param: @param email
	 * @return: BaseResponseByJson
	 * @Autor: Han
	 */
	@ResponseBody
	@RequestMapping(value = "/register/checkemil", method = RequestMethod.POST)
	public BaseResponseByJson checkUserEmailExist(String email) {

		int status = service.checkUserEmailExist(email);

		if (status == 0) {

			// if the status is 1 ,the userName has been used
			json.setStatus(status);
			json.setMessage("该邮箱已被注册");
		} else {

			// the username has not been use
			json.setStatus(status);
			json.setMessage("恭喜!该邮箱可以使用");
		}

		return json;
	}

	/**
	 * <p>Title: login</p>
	 * <p>Description:</p>
	 * @return: ModelAndView
	 * @Autor: Han
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login() {

		// to forward to the page of login
		ModelAndView view = new ModelAndView("/account/login");

		return view;
	}
	
	/**   
	 * <p>Title: toLogin</p>   
	 * <p>Description: to login</p> 
	 * @param:  @param userName
	 * @param:  @param pwd
	 * @param:  @param session
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping("login/tologin")
	public BaseResponseByJson toLogin(@Param("userName")String userName, @Param("pwd")String pwd, HttpSession session){
		
		//set a userLogin
		userLogin.setUserName(userName);
		userLogin.setEmail(userName);
		userLogin.setPwd(MD5Util.getMD5(pwd));
		
		//check the userLogin is correct or not
		UserLogin tempUserLogin = service.loginByEmailOrUserName(userLogin);
		
		UserInfo userInfo = service.getUserInfoByUserId(userLogin.getId());
		
		//set the response by json
		if(tempUserLogin == null){
			
			//the username or password is uncorrect
			json.setStatus(0);
			json.setMessage("用户名或密码错误");
		}else{

			//login successfully
			//set showMessage text
			session.setAttribute("message", "登陆成功,正在跳转...");
			session.setAttribute("currentUser", tempUserLogin);
			session.setAttribute("currentUserInfo", userInfo);
			json.setStatus(1);
			json.setMessage("登陆成功");
		}
		
		return json;
	}

	/**
	 * <p>Title: toRegister</p>
	 * <p>Description:</p>
	 * @return: ModelAndView
	 * @Autor: Han
	 */
	@RequestMapping(value = "/register")
	public ModelAndView toRegister() {

		// to forward to the page of login
		ModelAndView view = new ModelAndView("/account/reg");

		return view;
	}

	/**
	 * <p>Title: register</p>
	 * <p>Description:</p>
	 * @param: @param session
	 * @param: @param userName
	 * @param: @param pwd
	 * @return: BaseResponseByJson
	 * @throws Exception 
	 * @throws ServletException 
	 * @Autor: Han
	 */
	@ResponseBody
	@RequestMapping("/register/toadd")
	public BaseResponseByJson register(HttpServletRequest request, HttpSession session,
			@Param("userName") String userName, @Param("email") String email, @Param("pwd") String pwd) throws Exception {

		int status = service.checkUserNameExist(userName);

		if (status == 0) {

			// if the status is 1 ,the userName has been used
			json.setStatus(status);
			json.setMessage("该用户名已被注册");
		} else {

			// get the md5 of password
			pwd = MD5Util.getMD5(pwd);

			userLogin.setUserName(userName);
			userLogin.setPwd(pwd);
			userLogin.setEmail(email);
			userLogin.setUserStatusId(3);

			service.register(userLogin);

			String vcode = MD5Util.getMD5(userName);
			
			// add the vcode to database
			code.setUserId(userLogin.getId());
			code.setVcode(vcode);
			
			service.addVcode(code);
			
			// register successful
			json.setStatus(status);
			json.setMessage("注册成功");
			
			//add userinfo
			UserInfo info = new UserInfo();
			//http路径
			String data = "http://" + request.getServerName() + ":" + request.getServerPort() +
					 request.getContextPath() + "/public/headerImg/default.jpg";
			info.setHeadImage(data);
			info.setUserId(userLogin.getId());
			
			service.addUserInfo(info);
			
			UserInfo userInfo = service.getUserInfoByUserId(userLogin.getId());
			
			// set the text of showMessage
			session.setAttribute("message", "邮件已经发送至您的邮箱,请注意查收！正在跳转...");
			
			// get the check email
			mail.setToAddress(email);
			mail.setSubject("淘缘验证邮件");
			
			//set the mail content
			mail.setContent(getTheConfirmEmail(request, vcode));

			// send the check email
			EmailUtil.sendHtmlMail(mail);

			// set the UserLogin to session
			session.setAttribute("currentUser", userLogin);
			
			session.setAttribute("currentUserInfo", userInfo);
			
		}
		return json;
	}
	
	/**   
	 * <p>Title: registerComfirm</p>   
	 * <p>Description: to check the register </p> 
	 * @param:  @param session
	 * @param:  @param vcode
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping("/register/toadd/comfirm")
	public ModelAndView registerComfirm(HttpSession session, String vcode){
	
		//get userId by vcode
		int userId = service.comfirmUser(vcode);
		//get userLogin by userId
		userLogin = service.getUserLoginByUserId(userId);

		//set thr currentUser to session
		session.setAttribute("currentUser", userLogin);
		
		return new ModelAndView("showMessage");
	}
	
	/**   
	 * <p>Title: logout</p>   
	 * <p>Description: Logout</p> 
	 * @param:  @param session
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		
		//remove the currentUser from session
		session.removeAttribute("currentUser");
		
		return "/index";
	}

	/**   
	 * <p>Title: getTheConfirmEmail</p>   
	 * <p>Description: set the register check email </p> 
	 * @param:  @param request
	 * @param:  @param vcode
	 * @param:  @return  
	 * @return: String
	 * @Autor: Han  
	 */  
	private String getTheConfirmEmail(HttpServletRequest request, String vcode) {

		StringBuilder html = new StringBuilder();
		String url = request.getRequestURL().toString();

		//taoyuan/comfirm?vcode=.....
		html.append(
				"<div><strong style=\"font-size:25px\">欢迎注册淘缘二手交易平台</strong></div><div>点击下方链接进行验证</div><div><a style=\"color:red,font-size:30px\" href=\"");
		html.append(url + "/comfirm?vcode=" + vcode + "\">点我验证</a>");
		html.append("</div>");

		return html.toString();
	}
}
