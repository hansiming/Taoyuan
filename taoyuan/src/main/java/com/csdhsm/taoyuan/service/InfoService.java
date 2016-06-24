package com.csdhsm.taoyuan.service;

import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;
import java.util.List;

public abstract interface InfoService
{
  public abstract List<InfoCategory> getCategories();
  
  public abstract List<Info> getInfosBySorted(String paramString);
  
  public abstract PageBean<Info> getInfoListByPageBean(PageBean<Info> paramPageBean);
  
  public abstract int addInfo(Info paramInfo);
  
  public abstract List<Info> getInfoList();
  
  public abstract Info getInfoById(int paramInt);
  
  public abstract int getConmmentCount(int paramInt);
  
  public abstract List<Conmment> getConmmentByInfoId(int paramInt);
  
  public abstract int addConm(Conmment paramConmment);
  
  public abstract int addLookedCount(int paramInt);
}
