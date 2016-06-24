package com.csdhsm.taoyuan.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conmment
{
  private int id;
  private String content;
  private int userId;
  private int infold;
  private Date add_time;
  private String addtime;
  private String userName;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public void setContent(String content)
  {
    this.content = content;
  }
  
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  public int getInfold()
  {
    return this.infold;
  }
  
  public void setInfold(int infold)
  {
    this.infold = infold;
  }
  
  public Date getAdd_time()
  {
    return this.add_time;
  }
  
  public void setAdd_time(Date add_time)
  {
    this.add_time = add_time;
  }
  
  public String getAddtime()
  {
    return this.addtime;
  }
  
  public void setAddtime()
  {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    this.addtime = df.format(this.add_time);
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
}
