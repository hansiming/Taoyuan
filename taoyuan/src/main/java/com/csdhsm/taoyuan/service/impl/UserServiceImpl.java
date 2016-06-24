package com.csdhsm.taoyuan.service.impl;

import com.csdhsm.taoyuan.mapper.UserMapper;
import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;
import com.csdhsm.taoyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
  implements UserService
{
  @Autowired
  private UserMapper mapper;
  
  public int checkUserNameExist(String userName)
  {
    int status = this.mapper.checkUserNameExist(userName);
    if (status == 1) {
      return 0;
    }
    return 1;
  }
  
  public int register(UserLogin userLogin)
  {
    return this.mapper.register(userLogin);
  }
  
  public int checkUserEmailExist(String email)
  {
    int status = this.mapper.checkUserEmailExist(email);
    if (status == 1) {
      return 0;
    }
    return 1;
  }
  
  public int addVcode(UserComfirmCode code)
  {
    return this.mapper.addVcode(code);
  }
  
  public int comfirmUser(String vcode)
  {
    int userId = this.mapper.getUserIdByVcode(vcode);
    if (userId > 0) {
      this.mapper.updateUserStatusId(userId);
    }
    return userId;
  }
  
  public UserLogin getUserLoginByUserId(int userId)
  {
    return this.mapper.getUserLoginByUserId(userId);
  }
  
  public UserLogin loginByEmailOrUserName(UserLogin login)
  {
    return this.mapper.loginByEmailOrUserName(login);
  }
  
  public int addUserInfo(UserInfo info)
  {
    return this.mapper.addUserInfo(info);
  }
  
  public UserInfo getUserInfoByUserId(int userId)
  {
    return this.mapper.getUserInfoByUserId(userId);
  }
}
