package com.csdhsm.taoyuan.app;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csdhsm.taoyuan.models.BaseResponseByJson;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.UserService;
import com.csdhsm.taoyuan.utils.MD5Util;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  LoginController.java   
 * @Package com.csdhsm.taoyuan.app   
 * @Description: 移动APP登陆，注册接口(实现RestFul接口)
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月18日 下午8:18:24   
 * @version:V1.0     
 */  
@Controller
public class LoginAppController {
	
	/**
	 * @Fields service : UserService
	 */
	@Autowired
	private UserService service;
	
	/**   
	 * @Fields json : The json to return 
	 */ 
	@Autowired
	private BaseResponseByJson json;
	
	/**   
	 * @Fields userLogin : The userLogin to login
	 */ 
	@Autowired
	private UserLogin userLogin;
	
	/**   
	 * <p>Title: checkUserName</p>   
	 * <p>Description: 检查用户名是否存在 </p> 
	 * @param:  @param userName
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "/app/checkUserName", method = RequestMethod.POST)
	public BaseResponseByJson checkUserName(String userName) {
		
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
	 * <p>Title: checkUserEmail</p>   
	 * <p>Description: 检测邮箱是否被使用 </p> 
	 * @param:  @param email
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "/app/checkEmail", method = RequestMethod.POST)
	public BaseResponseByJson checkUserEmail(String email) {
		
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
	 * <p>Title: toRegister</p>   
	 * <p>Description: 手机移动端注册 </p> 
	 * @param:  @param userName
	 * @param:  @param email
	 * @param:  @param pwd
	 * @param:  @param session
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "/app/toRegister", method = RequestMethod.POST)
	public BaseResponseByJson toRegister(@Param("userName")String userName, @Param("email")String email,
			@Param("pwd")String pwd, HttpSession session) {
		
		int status = service.checkUserNameExist(userName);

		if (status == 0) {

			// if the status is 1 ,the userName has been used
			json.setStatus(status);
			json.setMessage("该用户名已被注册");
			
			return json;
		}
		
		status = service.checkUserNameExist(userName);
		
		if(status == 0) {
			
			// if the status is 1 ,the email has been used
			json.setStatus(status);
			json.setMessage("该邮箱已被注册");
			
			return json;
		}
		
		// get the md5 of password
		pwd = MD5Util.getMD5(pwd);

		userLogin.setUserName(userName);
		userLogin.setPwd(pwd);
		userLogin.setEmail(email);
		userLogin.setUserStatusId(1);

		service.register(userLogin);

		// set the UserLogin to session
		session.setAttribute("currentUser", userLogin);
			
		return json;
	}
	
	/**   
	 * <p>Title: toLogin</p>   
	 * <p>Description: 手机App端注册 </p> 
	 * @param:  @param userName
	 * @param:  @param pwd
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "/app/toLogin", method = RequestMethod.POST)
	public BaseResponseByJson toLogin(@Param("userName")String userName,
			@Param("pwd")String pwd, HttpSession session) {
		
		//set a userLogin
		userLogin.setUserName(userName);
		userLogin.setEmail(userName);
		userLogin.setPwd(MD5Util.getMD5(pwd));
		
		//check the userLogin is correct or not
		UserLogin tempUserLogin = service.loginByEmailOrUserName(userLogin);
				
		//set the response by json
		if(tempUserLogin == null){
					
				//the username or password is uncorrect
				json.setStatus(0);
				json.setMessage("用户名或密码错误");
		}else{

				//login successfully
				session.setAttribute("currentUser", tempUserLogin);
				json.setStatus(1);
				json.setMessage("登陆成功");
		}
		
		return json;
	}
	
	/**   
	 * <p>Title: getUserLoginByUserId</p>   
	 * <p>Description: </p> 
	 * @param:  @param userId
	 * @param:  @return  
	 * @return: UserInfo
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "/app/getUserInfo")
	public UserInfo getUserLoginByUserId(int userId) {
		
		return service.getUserInfoByUserId(userId);
	}
}
