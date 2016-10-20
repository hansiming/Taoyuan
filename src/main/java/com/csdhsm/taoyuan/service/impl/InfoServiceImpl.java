package com.csdhsm.taoyuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csdhsm.taoyuan.mapper.InfoMapper;
import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;
import com.csdhsm.taoyuan.service.InfoService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoServiceImpl.java   
 * @Package com.csdhsm.taoyuan.service.impl   
 * @Description: 
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

	/**   
	 * <p>Title: getInfoListByPageBean</p>   
	 * <p>Description: </p>   
	 * @param pageBean   
	 * @see com.csdhsm.taoyuan.service.InfoService#getInfoListByPageBean(com.csdhsm.taoyuan.models.PageBean)   
	 */  
	public PageBean<Info> getInfoListByPageBean(PageBean<Info> pageBean) {
		
		//TODO 
		int totalRecords = mapper.getInfoCount(pageBean);
		//将记录总数存入pageBean
		pageBean.setTotalRecords(totalRecords);
		//得到分页数据
		List<Info> infoList = mapper.getInfoListByPageBean(pageBean);
		//将得到的数据装入pageBean中
		pageBean.setPageDatas(infoList);
		
		return pageBean;
	}
	
	/**   
	 * <p>Title: addInfo</p>   
	 * <p>Description: </p>   
	 * @param info
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#addInfo(com.csdhsm.taoyuan.models.Info)   
	 */  
	public int addInfo(Info info) {

		return mapper.addInfo(info);
	}

	/**   
	 * <p>Title: getInfoList</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#getInfoList()   
	 */  
	public List<Info> getInfoList() {
		
		return mapper.getInfoList();
	}

	/**   
	 * <p>Title: getInfoById</p>   
	 * <p>Description: </p>   
	 * @param infoId
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#getInfoById(int)   
	 */  
	public Info getInfoById(int infoId) {
		
		return mapper.getInfoById(infoId);
	}

	/**   
	 * <p>Title: getConmmentCount</p>   
	 * <p>Description: </p>   
	 * @param infoId
	 * @see com.csdhsm.taoyuan.service.InfoService#getConmmentCount(int)   
	 */  
	public int getConmmentCount(int infoId) {
		
		return mapper.getConmmentCount(infoId);
	}

	/**   
	 * <p>Title: getConmmentByInfoId</p>   
	 * <p>Description: </p>   
	 * @param infoId
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#getConmmentByInfoId(int)   
	 */  
	public List<Conmment> getConmmentByInfoId(int infoId) {

		return mapper.getConmmentByInfoId(infoId);
	}

	/**   
	 * <p>Title: addConm</p>   
	 * <p>Description: </p>   
	 * @param conmment
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#addConm(com.csdhsm.taoyuan.models.Conmment)   
	 */  
	public int addConm(Conmment conmment) {
		
		return mapper.addConm(conmment);
	}

	/**   
	 * <p>Title: addLookedCount</p>   
	 * <p>Description: </p>   
	 * @param infoId
	 * @return   
	 * @see com.csdhsm.taoyuan.service.InfoService#addLookedCount(int)   
	 */  
	public int addLookedCount(int infoId) {

		return mapper.addLookedCount(infoId);
	}
}
