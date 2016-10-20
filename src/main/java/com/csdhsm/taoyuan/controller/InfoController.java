package com.csdhsm.taoyuan.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.csdhsm.taoyuan.models.BaseResponseByJson;
import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.InfoService;
import com.csdhsm.taoyuan.service.UserService;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  InfoController.java   
 * @Package com.csdhsm.taoyuan.controller   
 * @Description: 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 下午5:00:46   
 * @version:V1.0     
 */  
@Controller
public class InfoController {
	
	/**   
	 * @Fields service : The service of InfoController
	 */ 
	@Autowired
	private InfoService infoService;
	
	/**   
	 * @Fields userService : The userService of InfoController.java 
	 */ 
	@Autowired
	private UserService userService;
	
	/**   
	 * @Fields pageBean : 分页Java bean 在Spring中实例化
	 */ 
	@Autowired
	private PageBean<Info> pageBean;
	
	/**   
	 * @Fields json : The json of InfoController
	 */ 
	@Autowired
	private BaseResponseByJson json;
	
	/**   
	 * <p>Title: showMessage</p>   
	 * <p>Description: showMessage and jump to index </p> 
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping(value = "showMessage")
	public ModelAndView showMessage(){
		
		return new ModelAndView("showMessage");
	}
	
	/**   
	 * <p>Title: toIndex</p>   
	 * <p>Description: jump to index page</p> 
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping(value = {"/","/index"})
	public ModelAndView toIndex(){
		
		ModelAndView view = new ModelAndView("index");
		List<InfoCategory> categories = infoService.getCategories();
		//the info is newest
		List<Info> theInfoOfNew = infoService.getInfosBySorted(" add_time desc");
		//the info is ishot
		List<Info> theInfoOfRecommend = infoService.getInfosBySorted(" isHot desc");
		
		view.addObject("theInfoOfNew", theInfoOfNew);
		view.addObject("theInfoOfRecommend", theInfoOfRecommend);
		view.addObject("categories", categories);
		
		return view;
	}
	
	/**   
	 * <p>Title: toInfoList</p>   
	 * <p>Description: 信息展示界面</p> 
	 * @param:  @param cateId
	 * @param:  @param page
	 * @param:  @param order
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping(value = "/toList")
	public ModelAndView toInfoList(@Param("cateId")Integer cateId,
			@RequestParam(value = "page", required = false)Integer page,
				@RequestParam(value = "order", required = false)String order) {
		
		ModelAndView view = new ModelAndView("/list");
		
		if(cateId == null || cateId < 0) {
			cateId = 0;
		}
		
		if(page == null || page <= 0) {
			page = 1;
		}
		
		if(order != null && !order.equals("")) {
			pageBean.setOrder(order);
		}
		
		pageBean.setPageIndex(page);
		pageBean.setCateId(cateId);
		pageBean.setPageSize(8);

		List<InfoCategory> categories = infoService.getCategories();
		//get the page data
		pageBean = infoService.getInfoListByPageBean(pageBean);
		
		for(Info info : pageBean.getPageDatas()) {
			
			info.setUserName(userService.getUserLoginByUserId(info.getUserId()).getUserName());
			info.setCommentCount(infoService.getConmmentCount(info.getId()));
		}
		
		//add the pageBean
		view.addObject("pageBean", pageBean);
		view.addObject("categories", categories);
		view.addObject("cateId", cateId);
		
		return view;
	}
	
	/**   
	 * <p>Title: toShow</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId 
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping("/show")
	public ModelAndView toShow(String infoId) {
		
		ModelAndView view = new ModelAndView("/show");
		Info info = infoService.getInfoById(Integer.parseInt(infoId));
		//the info is newest
		List<Info> theInfoOfNew = infoService.getInfosBySorted(" add_time desc");
		//the info is ishot
		List<Info> theInfoOfRecommend = infoService.getInfosBySorted(" isHot desc");
		UserInfo userInfo = userService.getUserInfoByUserId(info.getUserId());
		UserLogin userLogin = userService.getUserLoginByUserId(info.getUserId());
		List<Conmment> conmments = infoService.getConmmentByInfoId(Integer.parseInt(infoId));
		
		infoService.addLookedCount(Integer.parseInt(infoId));
		
		for(Conmment conmment : conmments) {
			
			conmment.setUserName(userService.getUserLoginByUserId(conmment.getUserId()).getUserName());
			conmment.setAddtime();
		}
		
		view.addObject("theInfoOfNew", theInfoOfNew);
		view.addObject("theInfoOfRecommend", theInfoOfRecommend);
		view.addObject("info", info);
		view.addObject("userInfo", userInfo);
		view.addObject("userLogin", userLogin);
		view.addObject("conmments", conmments);
		
		
		return view;
	}
	
	/**   
	 * <p>Title: submitConm</p>   
	 * <p>Description: </p> 
	 * @param:  @param infoId
	 * @param:  @param userId
	 * @param:  @param content
	 * @param:  @return  
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping("/submitConm")
	public BaseResponseByJson submitConm(@RequestParam(value = "infoId")int infoId, 
			@RequestParam(value = "userId")int userId, 
			@RequestParam(value = "content")String content) {
		
		Conmment conmment = new Conmment();
		
		conmment.setInfold(infoId);
		conmment.setUserId(userId);
		conmment.setContent(content);
		
		infoService.addConm(conmment);
		json.setStatus(1);
		json.setMessage("评论成功");
		
		return json;
	}
}
