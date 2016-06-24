package com.csdhsm.taoyuan.service;

import com.csdhsm.taoyuan.models.UserComfirmCode;
import com.csdhsm.taoyuan.models.UserInfo;
import com.csdhsm.taoyuan.models.UserLogin;

public abstract interface UserService
{
  public abstract int checkUserNameExist(String paramString);
  
  public abstract int checkUserEmailExist(String paramString);
  
  public abstract int register(UserLogin paramUserLogin);
  
  public abstract int addVcode(UserComfirmCode paramUserComfirmCode);
  
  public abstract int comfirmUser(String paramString);
  
  public abstract UserLogin getUserLoginByUserId(int paramInt);
  
  public abstract UserLogin loginByEmailOrUserName(UserLogin paramUserLogin);
  
  public abstract int addUserInfo(UserInfo paramUserInfo);
  
  public abstract UserInfo getUserInfoByUserId(int paramInt);
}
