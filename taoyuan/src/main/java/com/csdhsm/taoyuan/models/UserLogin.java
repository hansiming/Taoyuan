package com.csdhsm.taoyuan.models;

public class UserLogin
{
  private int id;
  private String userName;
  private String pwd;
  private int userStatusId;
  private String email;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public String getPwd()
  {
    return this.pwd;
  }
  
  public void setPwd(String pwd)
  {
    this.pwd = pwd;
  }
  
  public int getUserStatusId()
  {
    return this.userStatusId;
  }
  
  public void setUserStatusId(int userStatusId)
  {
    this.userStatusId = userStatusId;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String toString()
  {
    return 
      "UserLogin [id=" + this.id + ", userName=" + this.userName + ", pwd=" + this.pwd + ", userStatusId=" + this.userStatusId + ", email=" + this.email + "]";
  }
}
