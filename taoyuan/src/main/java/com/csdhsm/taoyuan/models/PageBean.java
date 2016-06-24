package com.csdhsm.taoyuan.models;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T>
{
  private int pageIndex = 1;
  private int totalPages = 1;
  private int pageSize = 8;
  private int totalRecords = 0;
  private boolean isHavePrePage = false;
  private boolean isHaveNextPage = false;
  private String wheres;
  private String order;
  private int cateId;
  private int recordStartIndex = 0;
  private List<T> pageDatas = new ArrayList<T>();
  
  public int getPageIndex()
  {
    return this.pageIndex;
  }
  
  public void setPageIndex(int pageIndex)
  {
    this.pageIndex = pageIndex;
    this.recordStartIndex = ((pageIndex - 1) * this.pageSize);
  }
  
  public void setTotalPages(int totalPages)
  {
    this.totalPages = totalPages;
  }
  
  public int getPageSize()
  {
    return this.pageSize;
  }
  
  public void setPageSize(int pageSize)
  {
    this.pageSize = pageSize;
  }
  
  public int getTotalRecords()
  {
    return this.totalRecords;
  }
  
  public void setTotalRecords(int totalRecords)
  {
    if (totalRecords < 0) {
      throw new RuntimeException("����������������0!");
    }
    this.totalRecords = totalRecords;
    
    this.totalPages = (this.totalRecords / this.pageSize);
    if (this.totalRecords % this.pageSize != 0) {
      this.totalPages += 1;
    }
    if (this.pageIndex > 1) {
      this.isHavePrePage = true;
    } else {
      this.isHavePrePage = false;
    }
    if (this.pageIndex < this.totalPages) {
      this.isHaveNextPage = true;
    } else {
      this.isHaveNextPage = false;
    }
  }
  
  public boolean getIsHavePrePage()
  {
    return this.isHavePrePage;
  }
  
  public boolean getIsHaveNextPage()
  {
    return this.isHaveNextPage;
  }
  
  public List<T> getPageDatas()
  {
    return this.pageDatas;
  }
  
  public void setPageDatas(List<T> pageDatas)
  {
    this.pageDatas = pageDatas;
  }
  
  public String getWheres()
  {
    return this.wheres;
  }
  
  public void setWheres(String wheres)
  {
    this.wheres = wheres;
  }
  
  public String getOrder()
  {
    return this.order;
  }
  
  public void setOrder(String order)
  {
    this.order = order;
  }
  
  public int getCateId()
  {
    return this.cateId;
  }
  
  public void setCateId(int cateId)
  {
    this.cateId = cateId;
  }
  
  public int getTotalPages()
  {
    return this.totalPages;
  }
  
  public int getRecordStartIndex()
  {
    return this.recordStartIndex;
  }
}
