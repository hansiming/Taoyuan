package com.csdhsm.taoyuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csdhsm.taoyuan.mapper.InfoMapper;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.service.InfoService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoServiceImpl.java   
 * @Package com.csdhsm.taoyuan.service.impl   
 * @Description: TODO 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午7:58:50   
 * @version:V1.0     
 */  
@Service
public class InfoServiceImpl implements InfoService {

	/**   
	 * @Fields mapper : The mapper of InfoServiceImpl
	 */ 
	@Autowired
	private InfoMapper mapper;
	
	/**   
	 * <p>Title: getCategories</p>   
	 * <p>Description: get all of category </p>   
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#getCategories()   
	 */  
	public List<InfoCategory> getCategories() {

		return mapper.getCategories();
	}

	/**   
	 * <p>Title: getInfosBySorted</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#getInfosBySorted()   
	 */  
	public List<Info> getInfosBySorted(String sorted) {

		return mapper.getInfosBySorted(sorted);
	}
}
