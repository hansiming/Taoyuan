package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserComfirmCode.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: the entity UserComfirmCode
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午2:34:55   
 * @version:V1.0     
 */  
public class UserComfirmCode {
	
	/**   
	 * @Fields id : The id of UserComfirmCode
	 */ 
	private int id;
	
	/**   
	 * @Fields userId : The userId of UserComfirmCode
	 */ 
	private int userId;
	
	/**   
	 * @Fields vcode : The vcode of UserComfirmCode
	 */ 
	private String vcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	@Override
	public String toString() {
		return "UserComfirmCode [id=" + id + ", userId=" + userId + ", vcode=" + vcode + "]";
	}
}
