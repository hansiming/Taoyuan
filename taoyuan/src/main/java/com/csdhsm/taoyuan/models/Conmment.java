package com.csdhsm.taoyuan.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  Conmment.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: 评论 实体
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月24日 上午10:07:47   
 * @version:V1.0     
 */  
public class Conmment {
	
	/**   
	 * @Fields id : The id of Conmment
	 */ 
	private int id;
	
	/**   
	 * @Fields content : The content of Conmment
	 */ 
	private String content;
	
	/**   
	 * @Fields userId : The userId of Conmment
	 */ 
	private int userId;
	
	/**   
	 * @Fields infoId : The infoId of Conmment
	 */ 
	private int infold;
	
	/**   
	 * @Fields add_time : The add_time of Conmment
	 */ 
	private Date add_time;
	
	/**   
	 * @Fields addtime : The addtime of Conmment
	 */ 
	private String addtime;
	
	/**   
	 * @Fields userName : The userName of Conmment
	 */ 
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getInfold() {
		return infold;
	}

	public void setInfold(int infold) {
		this.infold = infold;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime() {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.addtime = df.format(add_time);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
