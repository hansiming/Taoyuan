package com.csdhsm.taoyuan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.csdhsm.taoyuan.models.BaseResponseByJson;
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
 * @Title:  MemberController.java   
 * @Package com.csdhsm.taoyuan.controller   
 * @Description: 个人中心Controller
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月21日 下午10:06:12   
 * @version:V1.0     
 */ 
@Controller
public class MemberController {
	
	/**   
	 * @Fields infoService : The infoService of MemberController
	 */ 
	@Autowired
	private InfoService infoService;
	
	/**   
	 * @Fields service : The service of MemberController
	 */ 
	@Autowired
	private UserService userService;
	
	/**   
	 * @Fields json : The json of MemberController
	 */ 
	@Autowired
	private BaseResponseByJson json;
	
	/**   
	 * <p>Title: toSet</p>   
	 * <p>Description: </p> 
	 * @param:  @return  
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping("member/toSet")
	public ModelAndView toSet(HttpSession session) {
		
		if(!isLogined(session)) {

			return new ModelAndView("/account/login");
		}
		
		ModelAndView view = new ModelAndView("member/set");
		
		int userId = 68;
		UserInfo userInfo = userService.getUserInfoByUserId(userId);
		
		view.addObject("userInfo", userInfo);
		
		return view;
	}
	
	/**   
	 * <p>Title: toSave</p>   
	 * <p>Description: </p> 
	 * @param:  @return  
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping("member/toSave")
	public BaseResponseByJson toSave() {
		
		return json;
	}
	
	/**   
	 * <p>Title: toMyInfo</p>   
	 * <p>Description: </p> 
	 * @param:  @param cateId
	 * @return: ModelAndView
	 * @Autor: Han  
	 */  
	@RequestMapping("member/toMyInfo")
	public ModelAndView toMyInfo(@RequestParam(value = "cateId", required = false, defaultValue = "0")int cateId, 
			HttpSession session) {
		
		if(!isLogined(session)) {
			
			return new ModelAndView("/account/login");
		}
		
		ModelAndView view = new ModelAndView("/member/myinfo");
		List<InfoCategory> categories = infoService.getCategories();
		PageBean<Info> pageBean = new PageBean<Info>();
		
		pageBean.setCateId(cateId);
		pageBean.setWheres(" userId = 59 ");
		
		PageBean<Info> list = infoService.getInfoListByPageBean(pageBean);
		
		view.addObject("pageBean", list);
		view.addObject("categories", categories);
		view.addObject("cateId", cateId);
		
		return view;
	}
	
	/**   
	 * <p>Title: addInfo</p>   
	 * <p>Description: jump to addInfo.jsp</p> 
	 * @param:  @return  
	 * @return: String
	 * @Autor: Han  
	 */  
	@RequestMapping("/addInfo")
	public ModelAndView addInfo(HttpSession session) {
		
		if(!isLogined(session)) {

			return new ModelAndView("/account/login");
		}
		
		ModelAndView view = new ModelAndView("/member/addInfo");
		List<InfoCategory> categories = infoService.getCategories();
		
		//将Categories装入Request
		view.addObject("categories", categories);
		
		return view;
	}	
	
	/**   
	 * <p>Title: addInfo</p>   
	 * <p>Description: </p> 
	 * @param:  @param title
	 * @param:  @param cateId
	 * @param:  @param content
	 * @param:  @param file_path
	 * @return: BaseResponseByJson
	 * @Autor: Han  
	 */  
	@ResponseBody
	@RequestMapping(value = "toAddInfo")
	public BaseResponseByJson toAddInfo(@RequestParam(value = "title", required = false)String title, 
			@RequestParam(value = "cat_id")Integer cateId,
			@RequestParam(value = "content", required = false)String content,
			@RequestParam(value = "file_path", required = false)String file_path, 
			@RequestParam(value = "code")String code,
			HttpSession session) {

		UserLogin login = (UserLogin)session.getAttribute("currentUser");
		
		Info info = new Info();
		
		info.setTitle(title);
		info.setCategoryId(cateId);
		info.setContent(content);
		info.setImageUrl(file_path);
 
		
		infoService.addInfo(info);
		
		String vcode = (String)session.getAttribute("verifyCode");
		
		if(!vcode.equalsIgnoreCase(code)) {
			
			json.setStatus(0);
			json.setMessage("验证码输入错误");
			
			return json;
		}
		
		json.setStatus(1);
		json.setMessage("发布信息成功");
		session.setAttribute("message", "发布信息成功,正在跳转...");
		
		return json;
	}
	
	private boolean isLogined(HttpSession session) {
		
		UserLogin login = (UserLogin)session.getAttribute("currentUser");
		
		if(login == null) {
			
			return false;
		} else {
			
			return true;
		}
	}
}
