package com.csdhsm.taoyuan.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info
{
  private int id;
  private String title;
  private int categoryId;
  private String imageUrl;
  private String content;
  private int lookedCount;
  private Date add_Time;
  private String addTime;
  private String infoAddTime;
  private int isHot;
  private int userId;
  private int commentCount;
  private String userName;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public int getCategoryId()
  {
    return this.categoryId;
  }
  
  public void setCategoryId(int categoryId)
  {
    this.categoryId = categoryId;
  }
  
  public String getImageUrl()
  {
    return this.imageUrl;
  }
  
  public void setImageUrl(String imageUrl)
  {
    this.imageUrl = imageUrl;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public void setContent(String content)
  {
    this.content = content;
  }
  
  public int getLookedCount()
  {
    return this.lookedCount;
  }
  
  public void setLookedCount(int lookedCount)
  {
    this.lookedCount = lookedCount;
  }
  
  public Date getAdd_Time()
  {
    return this.add_Time;
  }
  
  public void setAdd_Time(Date add_Time)
  {
    this.add_Time = add_Time;
    setAddTime();
    setInfoAddTime();
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public int getIsHot()
  {
    return this.isHot;
  }
  
  public void setIsHot(int isHot)
  {
    this.isHot = isHot;
  }
  
  public String getAddTime()
  {
    return this.addTime;
  }
  
  public void setAddTime()
  {
    SimpleDateFormat format = new SimpleDateFormat("MM-dd");
    this.addTime = format.format(this.add_Time);
  }
  
  public String getInfoAddTime()
  {
    return this.infoAddTime;
  }
  
  public void setInfoAddTime()
  {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    this.infoAddTime = format.format(this.add_Time);
  }
  
  public int getCommentCount()
  {
    return this.commentCount;
  }
  
  public void setCommentCount(int commentCount)
  {
    this.commentCount = commentCount;
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
      "Info [id=" + this.id + ", title=" + this.title + ", categoryId=" + this.categoryId + ", imageUrl=" + this.imageUrl + ", content=" + this.content + ", looedCount=" + this.lookedCount + ", add_Time=" + this.add_Time + "]";
  }
}
