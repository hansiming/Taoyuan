package com.csdhsm.taoyuan.service;

import java.util.List;

import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;

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
	
	public PageBean<Info> getInfoListByPageBean(PageBean<Info> pageBean);
	
	public int addInfo(Info info);
	
	public List<Info> getInfoList();
	
	public Info getInfoById(int infoId);
	
	public int getConmmentCount(int infoId);
	
	public List<Conmment> getConmmentByInfoId(int infoId);

	public int addConm(Conmment conmment);
	
	public int addLookedCount(int infoId);
}
