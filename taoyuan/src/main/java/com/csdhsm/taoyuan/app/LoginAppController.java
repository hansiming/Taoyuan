package com.csdhsm.taoyuan.app;

import com.csdhsm.taoyuan.models.BaseResponseByJson;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.UserService;
import com.csdhsm.taoyuan.utils.MD5Util;
import javax.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAppController
{
  @Autowired
  private UserService service;
  @Autowired
  private BaseResponseByJson json;
  @Autowired
  private UserLogin userLogin;
  
  @ResponseBody
  @RequestMapping(value={"/app/checkUserName"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public BaseResponseByJson checkUserName(String userName)
  {
    int status = this.service.checkUserNameExist(userName);
    if (status == 0)
    {
      this.json.setStatus(status);
      this.json.setMessage("����������������");
    }
    else
    {
      this.json.setStatus(status);
      this.json.setMessage("����!����������������");
    }
    return this.json;
  }
  
  @ResponseBody
  @RequestMapping(value={"/app/checkEmail"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public BaseResponseByJson checkUserEmail(String email)
  {
    int status = this.service.checkUserEmailExist(email);
    if (status == 0)
    {
      this.json.setStatus(status);
      this.json.setMessage("��������������");
    }
    else
    {
      this.json.setStatus(status);
      this.json.setMessage("����!��������������");
    }
    return this.json;
  }
  
  @ResponseBody
  @RequestMapping(value={"/app/toRegister"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public BaseResponseByJson toRegister(@Param("userName") String userName, @Param("email") String email, @Param("pwd") String pwd, HttpSession session)
  {
    int status = this.service.checkUserNameExist(userName);
    if (status == 0)
    {
      this.json.setStatus(status);
      this.json.setMessage("����������������");
      
      return this.json;
    }
    status = this.service.checkUserNameExist(userName);
    if (status == 0)
    {
      this.json.setStatus(status);
      this.json.setMessage("��������������");
      
      return this.json;
    }
    pwd = MD5Util.getMD5(pwd);
    
    this.userLogin.setUserName(userName);
    this.userLogin.setPwd(pwd);
    this.userLogin.setEmail(email);
    this.userLogin.setUserStatusId(1);
    
    this.service.register(this.userLogin);
    
    session.setAttribute("currentUser", this.userLogin);
    
    return this.json;
  }
  
  @ResponseBody
  @RequestMapping(value={"/app/toLogin"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public BaseResponseByJson toLogin(@Param("userName") String userName, @Param("pwd") String pwd, HttpSession session)
  {
    this.userLogin.setUserName(userName);
    this.userLogin.setEmail(userName);
    this.userLogin.setPwd(MD5Util.getMD5(pwd));
    
    UserLogin tempUserLogin = this.service.loginByEmailOrUserName(this.userLogin);
    if (tempUserLogin == null)
    {
      this.json.setStatus(0);
      this.json.setMessage("����������������");
    }
    else
    {
      session.setAttribute("currentUser", tempUserLogin);
      this.json.setStatus(1);
      this.json.setMessage("��������");
    }
    return this.json;
  }
  
  @ResponseBody
  @RequestMapping({"/app/getUserInfo"})
  public UserInfo getUserLoginByUserId(int userId)
  {
    return this.service.getUserInfoByUserId(userId);
  }
}
