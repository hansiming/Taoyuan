package com.csdhsm.taoyuan.mapper;

import java.util.List;

import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoMapper.java   
 * @Package com.csdhsm.taoyuan.mapper   
 * @Description: the mapper of info
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午7:51:04   
 * @version:V1.0     
 */  
public interface InfoMapper {
	
	/**   
	 * <p>Title: getCategories</p>   
	 * <p>Description: get all category</p> 
	 * @param:  @return  
	 * @return: List<InfoCategory>
	 * @Autor: Han  
	 */  
	public List<InfoCategory> getCategories();
	
	/**   
	 * <p>Title: getInfosBySorted</p>   
	 * <p>Description: </p> 
	 * @param:  @param sorted like lookedCount desc
	 * @param:  @return  
	 * @return: List<Info>
	 * @Autor: Han  
	 */  
	public List<Info> getInfosBySorted(String sorted);
}
