package com.csdhsm.taoyuan.models;

public class UserComfirmCode
{
  private int id;
  private int userId;
  private String vcode;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  public String getVcode()
  {
    return this.vcode;
  }
  
  public void setVcode(String vcode)
  {
    this.vcode = vcode;
  }
  
  public String toString()
  {
    return "UserComfirmCode [id=" + this.id + ", userId=" + this.userId + ", vcode=" + this.vcode + "]";
  }
}
