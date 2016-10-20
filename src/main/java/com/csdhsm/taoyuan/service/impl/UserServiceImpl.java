package com.csdhsm.taoyuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csdhsm.taoyuan.mapper.UserMapper;
import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.UserService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserServiceImpl.java   
 * @Package com.csdhsm.taoyuan.service.impl   
 * @Description: The implement of UserService to login or register 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月1日 下午4:00:09   
 * @version:V1.0     
 */  
@Service
public class UserServiceImpl implements UserService {

	/**   
	 * @Fields mapper : The mapper of UserServiceImpl
	 */ 
	@Autowired
	private UserMapper mapper;
	
	/**   
	 * <p>Title: checkUserNameExist</p>   
	 * <p>Description: </p>   
	 * @param userName
	 * @return   int if the user is exist return 0 else return 1;
	 * @see com.csdhsm.taoyuan.service.UserService#checkUserNameExist(java.lang.String)   
	 */  
	public int checkUserNameExist(String userName) {
		
		int status = mapper.checkUserNameExist(userName);
		
		if(status == 1)
			return 0;
		else
			return 1;
	}

	/**   
	 * <p>Title: register</p>   
	 * <p>Description: </p>   
	 * @param userLogin
	 * @return   if return 1 is register success
	 * @see com.csdhsm.taoyuan.service.UserService#register(com.csdhsm.taoyuan.models.UserLogin)   
	 */  
	public int register(UserLogin userLogin) {
		
		return mapper.register(userLogin);
	}

	/**   
	 * <p>Title: checkUserEmailExist</p>   
	 * <p>Description: </p>   
	 * @param email
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#checkUserEmailExist(java.lang.String)   
	 */  
	public int checkUserEmailExist(String email) {
		
		int status = mapper.checkUserEmailExist(email);
		
		//if the email is exist will return 0, else return 1
		if(status == 1)
			return 0;
		else {
			return 1;
		}
	}

	/**   
	 * <p>Title: addVcode</p>   
	 * <p>Description: </p>   
	 * @param code
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#addVcode(com.csdhsm.taoyuan.models.UserComfirmCode)   
	 */  
	public int addVcode(UserComfirmCode code) {

		return mapper.addVcode(code);
	}

	/**   
	 * <p>Title: comfirmUser</p>   
	 * <p>Description: </p>   
	 * @param vcode
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#comfirmUser(java.lang.String)   
	 */  
	public int comfirmUser(String vcode) {
		
		int userId = mapper.getUserIdByVcode(vcode);
		
		if(userId > 0)
			mapper.updateUserStatusId(userId);
		
		return userId;
	}

	/**   
	 * <p>Title: getUserLoginByUserId</p>   
	 * <p>Description: </p>   
	 * @param userId
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#getUserLoginByUserId(int)   
	 */  
	public UserLogin getUserLoginByUserId(int userId) {

		return mapper.getUserLoginByUserId(userId);
	}

	/**   
	 * <p>Title: loginByEmailOrUserName</p>   
	 * <p>Description: </p>   
	 * @param login
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#loginByEmailOrUserName(com.csdhsm.taoyuan.models.UserLogin)   
	 */  
	public UserLogin loginByEmailOrUserName(UserLogin login) {

		return mapper.loginByEmailOrUserName(login);
	}

	/**   
	 * <p>Title: addUserInfo</p>   
	 * <p>Description: </p>   
	 * @param info
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#addUserInfo(com.csdhsm.taoyuan.models.UserInfo)   
	 */  
	public int addUserInfo(UserInfo info) {
		
		return mapper.addUserInfo(info);
	}

	/**   
	 * <p>Title: getUserInfoByUserId</p>   
	 * <p>Description: </p>   
	 * @param userId
	 * @return   
	 * @see com.csdhsm.taoyuan.service.UserService#getUserInfoByUserId(int)   
	 */  
	public UserInfo getUserInfoByUserId(int userId) {
		
		return mapper.getUserInfoByUserId(userId);
	}
}
