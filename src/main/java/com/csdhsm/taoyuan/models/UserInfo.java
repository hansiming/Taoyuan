package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UserInfo.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: The entity of UserInfo 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午12:55:58   
 * @version:V1.0     
 */  
public class UserInfo {
	
	/**   
	 * @Fields id : the id of userInfo 
	 */ 
	private int id;
	
	/**   
	 * @Fields headImage : The headImage of UserInfo
	 */ 
	private String headImage;
	
	/**   
	 * @Fields gender : The gender of UserInfo
	 */ 
	private String gender;
	
	/**   
	 * @Fields realName : The realName of UserInfo 
	 */ 
	private String realName;
	
	/**   
	 * @Fields telePhone : The telePhone of UserInfo
	 */ 
	private String telePhone;
	
	/**   
	 * @Fields userId : The userId of UserInfo
	 */ 
	private int userId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHeadImage() {
		return headImage;
	}
	
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getTelePhone() {
		return telePhone;
	}
	
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", headImage=" + headImage + ", gender=" + gender + ", realName=" + realName
				+ ", telePhone=" + telePhone + ", userId=" + userId + "]";
	}
}
