package com.csdhsm.taoyuan.mapper;

import java.util.List;

import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;

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
	 * @return: List<InfoCategory>
	 * @Autor: Han  
	 */  
	public List<InfoCategory> getCategories();
	
	/**   
	 * <p>Title: getInfosBySorted</p>   
	 * <p>Description: </p> 
	 * @param:  @param sorted like lookedCount desc
	 * @return: List<Info>
	 * @Autor: Han  
	 */  
	public List<Info> getInfosBySorted(String sorted);
	
	/**   
	 * <p>Title: getInfoCount</p>   
	 * <p>Description: </p> 
	 * @param:  @param pageBean
	 * @return: int
	 * @Autor: Han  
	 */  
	public int getInfoCount(PageBean<Info> pageBean);
	
	/**   
	 * <p>Title: getInfoListByPageBean</p>   
	 * <p>Description: </p> 
	 * @param:  @param pageBean
	 * @return: List<Info>
	 * @Autor: Han  
	 */  
	public List<Info> getInfoListByPageBean(PageBean<Info> pageBean);
	
	/**   
	 * <p>Title: getInfoList</p>   
	 * <p>Description: </p> 
	 * @param:  @return  
	 * @return: List<Info>
	 * @Autor: Han  
	 */  
	public List<Info> getInfoList();
	
	/**   
	 * <p>Title: addInfo</p>   
	 * <p>Description: </p> 
	 * @param:  @param info
	 * @return: int
	 * @Autor: Han  
	 */  
	public int addInfo(Info info);
	
	/**   
	 * <p>Title: getInfoById</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId
	 * @return: Info
	 * @Autor: Han  
	 */  
	public Info getInfoById(int infoId);
	
	/**   
	 * <p>Title: getConmmentCount</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId
	 * @param:  @return  
	 * @return: int
	 * @Autor: Han  
	 */  
	public int getConmmentCount(int infoId);
	
	/**   
	 * <p>Title: getConmmentByInfoId</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId
	 * @param:  @return  
	 * @return: Conmment
	 * @Autor: Han  
	 */  
	public List<Conmment> getConmmentByInfoId(int infoId);
	
	/**   
	 * <p>Title: addConm</p>   
	 * <p>Description: </p> 
	 * @param:  @param conmment
	 * @param:  @return  
	 * @return: int
	 * @Autor: Han  
	 */  
	public int addConm(Conmment conmment);	
	
	/**   
	 * <p>Title: addLookedCount</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId
	 * @param:  @return  
	 * @return: int
	 * @Autor: Han  
	 */  
	public int addLookedCount(int infoId);
}
