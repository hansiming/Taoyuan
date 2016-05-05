package com.csdhsm.taoyuan.service;

import java.util.List;

import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoService.java   
 * @Package com.csdhsm.taoyuan.service   
 * @Description: the service of info
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午7:57:58   
 * @version:V1.0     
 */  
public interface InfoService {
	
	public List<InfoCategory> getCategories();
	
	public List<Info> getInfosBySorted(String sorted);
}
