package com.csdhsm.taoyuan.models;

public class UploaderParam
{
  public static final String SUCCESS = "SUCCESS";
  private String name;
  private String originalName;
  private long size;
  private String state;
  private String type;
  private String url;
  
  public UploaderParam(String name, String originalName, long size, String state, String type, String url)
  {
    this.name = name;
    this.originalName = originalName;
    this.size = size;
    this.state = state;
    this.type = type;
    this.url = url;
  }
  
  public UploaderParam() {}
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getOriginalName()
  {
    return this.originalName;
  }
  
  public void setOriginalName(String originalName)
  {
    this.originalName = originalName;
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public void setSize(long size)
  {
    this.size = size;
  }
  
  public String getState()
  {
    return this.state;
  }
  
  public void setState(String state)
  {
    this.state = state;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setUrl(String url)
  {
    this.url = url;
  }
}
