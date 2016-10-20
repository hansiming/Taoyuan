package com.csdhsm.taoyuan.service;

import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserService.java   
 * @Package com.csdhsm.taoyuan.service   
 * @Description: the service of user
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午2:08:43   
 * @version:V1.0     
 */  
public interface UserService {
	
	public int checkUserNameExist(String userName);
	
	public int checkUserEmailExist(String email);
	
	public int register(UserLogin userLogin);
	
	public int addVcode(UserComfirmCode code);
	
	public int comfirmUser(String vcode);
	
	public UserLogin getUserLoginByUserId(int userId);
	
	public UserLogin loginByEmailOrUserName(UserLogin login);
	
	public int addUserInfo(UserInfo info);
	
	public UserInfo getUserInfoByUserId(int userId);
}
