package com.csdhsm.taoyuan.models;

public class UserInfo
{
  private int id;
  private String headImage;
  private String gender;
  private String realName;
  private String telePhone;
  private int userId;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getHeadImage()
  {
    return this.headImage;
  }
  
  public void setHeadImage(String headImage)
  {
    this.headImage = headImage;
  }
  
  public String getGender()
  {
    return this.gender;
  }
  
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  
  public String getRealName()
  {
    return this.realName;
  }
  
  public void setRealName(String realName)
  {
    this.realName = realName;
  }
  
  public String getTelePhone()
  {
    return this.telePhone;
  }
  
  public void setTelePhone(String telePhone)
  {
    this.telePhone = telePhone;
  }
  
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  public String toString()
  {
    return 
      "UserInfo [id=" + this.id + ", headImage=" + this.headImage + ", gender=" + this.gender + ", realName=" + this.realName + ", telePhone=" + this.telePhone + ", userId=" + this.userId + "]";
  }
}
