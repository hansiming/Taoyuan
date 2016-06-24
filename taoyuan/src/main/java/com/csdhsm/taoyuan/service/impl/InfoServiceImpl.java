package com.csdhsm.taoyuan.service.impl;

import com.csdhsm.taoyuan.mapper.InfoMapper;
import com.csdhsm.taoyuan.models.Conmment;
import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.InfoCategory;
import com.csdhsm.taoyuan.models.PageBean;
import com.csdhsm.taoyuan.service.InfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl
  implements InfoService
{
  @Autowired
  private InfoMapper mapper;
  
  public List<InfoCategory> getCategories()
  {
    return this.mapper.getCategories();
  }
  
  public List<Info> getInfosBySorted(String sorted)
  {
    return this.mapper.getInfosBySorted(sorted);
  }
  
  public PageBean<Info> getInfoListByPageBean(PageBean<Info> pageBean)
  {
    int totalRecords = this.mapper.getInfoCount(pageBean);
    
    pageBean.setTotalRecords(totalRecords);
    
    List<Info> infoList = this.mapper.getInfoListByPageBean(pageBean);
    
    pageBean.setPageDatas(infoList);
    
    return pageBean;
  }
  
  public int addInfo(Info info)
  {
    return this.mapper.addInfo(info);
  }
  
  public List<Info> getInfoList()
  {
    return this.mapper.getInfoList();
  }
  
  public Info getInfoById(int infoId)
  {
    return this.mapper.getInfoById(infoId);
  }
  
  public int getConmmentCount(int infoId)
  {
    return this.mapper.getConmmentCount(infoId);
  }
  
  public List<Conmment> getConmmentByInfoId(int infoId)
  {
    return this.mapper.getConmmentByInfoId(infoId);
  }
  
  public int addConm(Conmment conmment)
  {
    return this.mapper.addConm(conmment);
  }
  
  public int addLookedCount(int infoId)
  {
    return this.mapper.addLookedCount(infoId);
  }
}
