package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserLogin.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: The entity of UserLogin
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午12:52:23   
 * @version:V1.0     
 */  
public class UserLogin {
	
	/**   
	 * @Fields id : the id of user 
	 */ 
	private int id;
	
	/**   
	 * @Fields userName : the userName of user 
	 */ 
	private String userName;
	
	/**   
	 * @Fields pwd : the pwd of user  
	 */ 
	private String pwd;
	
	/**   
	 * @Fields userStatusId : the userStatusId of user  
	 */ 
	private int userStatusId;

	/**   
	 * @Fields email : The email of user
	 */ 
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getUserStatusId() {
		return userStatusId;
	}

	public void setUserStatusId(int userStatusId) {
		this.userStatusId = userStatusId;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", userName=" + userName + ", pwd=" + pwd + ", userStatusId=" + userStatusId
				+ ", email=" + email + "]";
	}
}
