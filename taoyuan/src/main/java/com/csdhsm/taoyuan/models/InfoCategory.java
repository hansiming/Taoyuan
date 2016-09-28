package com.csdhsm.taoyuan.models;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoCategory.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: the entity of infoCategory 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午7:54:18   
 * @version:V1.0     
 */  
public class InfoCategory {
	
	/**   
	 * @Fields id : The id of InfoCategory
	 */ 
	private int id;
	
	/**   
	 * @Fields categoryName : The categoryName of InfoCategory
	 */ 
	private String categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "InfoCategory [id=" + id + ", categoryName=" + categoryName + "]";
	}
}
