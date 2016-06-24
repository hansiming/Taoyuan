package com.csdhsm.taoyuan.models;

public class InfoCategory
{
  private int id;
  private String categoryName;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getCategoryName()
  {
    return this.categoryName;
  }
  
  public void setCategoryName(String categoryName)
  {
    this.categoryName = categoryName;
  }
  
  public String toString()
  {
    return "InfoCategory [id=" + this.id + ", categoryName=" + this.categoryName + "]";
  }
}
