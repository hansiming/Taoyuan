package com.csdhsm.taoyuan.mapper;

import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserMapper.java   
 * @Package com.csdhsm.taoyuan.mapper   
 * @Description: the mapper of user
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午1:19:43   
 * @version:V1.0     
 */  
public interface UserMapper {
	
	/**   
	 * <p>Title: checkUserNameExist</p>   
	 * <p>Description: </p> 
	 * @param:  @param userName
	 * @return: int
	 * @Autor: Han  
	 */  
	public int checkUserNameExist(String userName);
	
	/**   
	 * <p>Title: checkUserEmailExist</p>   
	 * <p>Description: </p> 
	 * @param:  @param email
	 * @return: int
	 * @Autor: Han  
	 */  
	public int checkUserEmailExist(String email);
	
	/**   
	 * <p>Title: register</p>   
	 * <p>Description: </p> 
	 * @param:  @param userLogin
	 * @return: int
	 * @Autor: Han  
	 */  
	public int register(UserLogin userLogin);
	
	/**   
	 * <p>Title: addVcode</p>   
	 * <p>Description: add vcode to UserComfirmCode </p> 
	 * @param:  @param code
	 * @return: int
	 * @Autor: Han  
	 */  
	public int addVcode(UserComfirmCode code);
	
	/**   
	 * <p>Title: getUserIdByVcode</p>   
	 * <p>Description: get userId rom UserComfirmCode by vcode </p> 
	 * @param:  @param Vcode
	 * @return: int
	 * @Autor: Han  
	 */  
	public int getUserIdByVcode(String vcode);
	
	/**   
	 * <p>Title: updateUserStatusId</p>   
	 * <p>Description: </p> 
	 * @param:  @param userId
	 * @return: int
	 * @Autor: Han  
	 */  
	public int updateUserStatusId(int userId);
	
	/**   
	 * <p>Title: getUserLoginByUserId</p>   
	 * <p>Description: </p> 
	 * @param:  @param userId
	 * @param:  @return  
	 * @return: UserLogin
	 * @Autor: Han  
	 */  
	public UserLogin getUserLoginByUserId(int userId);
	
	/**   
	 * <p>Title: loginByEmailOrUserName</p>   
	 * <p>Description: to Login </p> 
	 * @param:  @param login
	 * @param:  @return  
	 * @return: UserLogin
	 * @Autor: Han  
	 */  
	public UserLogin loginByEmailOrUserName(UserLogin login);
	
	/**   
	 * <p>Title: addUserInfo</p>   
	 * <p>Description: </p> 
	 * @param:  @param info
	 * @param:  @return  
	 * @return: int
	 * @Autor: Han  
	 */  
	public int addUserInfo(UserInfo info);
	
	/**   
	 * <p>Title: getUserInfoByUserId</p>   
	 * <p>Description: </p> 
	 * @param:  @param userId
	 * @param:  @return  
	 * @return: UserInfo
	 * @Autor: Han  
	 */  
	public UserInfo getUserInfoByUserId(int userId);
}
