package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  UploaderParam.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: 上传图片响应实体类
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月19日 下午4:28:59   
 * @version:V1.0     
 */  
public class UploaderParam {
	
	/**   
	 * @Fields SUCCESS : The SUCCESS of UploaderParam
	 */ 
	public static final String SUCCESS = "SUCCESS";
	
	/**   
	 * @Fields name : The name of UploaderParam
	 */ 
	private String name;
	
	/**   
	 * @Fields originalName : The originalName of UploaderParam 
	 */ 
	private String originalName;
	
	/**   
	 * @Fields size : The size of UploaderParam 
	 */ 
	private long size;
	
	/**   
	 * @Fields state : The state of UploaderParam 
	 */ 
	private String state;
	
	/**   
	 * @Fields type : The type of UploaderParam 
	 */ 
	private String type;
	
	/**   
	 * @Fields url : The url of UploaderParam 
	 */ 
	private String url;
	
	public UploaderParam(String name, String originalName, long size, String state, String type, String url) {

		this.name = name;
		this.originalName = originalName;
		this.size = size;
		this.state = state;
		this.type = type;
		this.url = url;
	}
	
	public UploaderParam() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
