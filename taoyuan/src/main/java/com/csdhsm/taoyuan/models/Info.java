package com.csdhsm.taoyuan.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  Info.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: the entity of info 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午8:17:11   
 * @version:V1.0     
 */  
public class Info {
	
	/**   
	 * @Fields id : The id of Info 
	 */ 
	private int id;
	
	/**   
	 * @Fields title : The title of Info
	 */ 
	private String title;
	
	/**   
	 * @Fields categoryId : The categoryId of Info
	 */ 
	private int categoryId;
	
	/**   
	 * @Fields imageUrl : The imageUrl of Info 
	 */ 
	private String imageUrl;
	
	/**   
	 * @Fields content : The content of Info
	 */ 
	private String content;
	
	/**   
	 * @Fields looedCount : The looedCount of Info
	 */ 
	private int looedCount;
	
	/**   
	 * @Fields date : The date of Info
	 */ 
	private Date add_Time;
	
	/**   
	 * @Fields addTime : The addTime of Info
	 */ 
	private String addTime;
	
	/**   
	 * @Fields isHot : The isHot of Info
	 */ 
	private int isHot;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLooedCount() {
		return looedCount;
	}

	public void setLooedCount(int looedCount) {
		this.looedCount = looedCount;
	}

	public Date getAdd_Time() {
		return add_Time;
	}

	public void setAdd_Time(Date add_Time) {
		this.add_Time = add_Time;
		setAddTime();
	}
	
	public int getIsHot() {
		return isHot;
	}

	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}
	
	public String getAddTime() {
		return addTime;
	}

	public void setAddTime() {
		
		SimpleDateFormat format = new SimpleDateFormat("MM-dd");
		this.addTime = format.format(this.add_Time);
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", title=" + title + ", categoryId=" + categoryId + ", imageUrl=" + imageUrl
				+ ", content=" + content + ", looedCount=" + looedCount + ", add_Time=" + add_Time + "]";
	}
}
