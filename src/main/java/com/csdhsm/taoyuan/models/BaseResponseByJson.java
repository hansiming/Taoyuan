package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  BaseResponseByJson.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: the Model to response the ajax`s request by json
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午2:20:48   
 * @version:V1.0     
 */  
public class BaseResponseByJson {
	
	/**   
	 * @Fields status : The status of BaseResponseByJson
	 */ 
	private int status;
	
	/**   
	 * @Fields message : The message of BaseResponseByJson
	 */ 
	private String message;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
