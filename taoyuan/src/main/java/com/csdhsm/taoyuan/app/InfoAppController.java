package com.csdhsm.taoyuan.app;

import com.csdhsm.taoyuan.models.Info;
import com.csdhsm.taoyuan.models.PageBean;
import com.csdhsm.taoyuan.service.InfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoAppController
{
  @Autowired
  private InfoService service;
  
  @ResponseBody
  @RequestMapping({"app/getInfoList"})
  public List<Info> getInfoList()
  {
    List<Info> list = this.service.getInfoList();
    
    return list;
  }
  
  @ResponseBody
  @RequestMapping({"app/getInfoListByCateId"})
  public List<Info> getInfoList(@RequestParam("cateId") int cateId)
  {
    PageBean<Info> pageBean = new PageBean<Info>();
    
    pageBean.setCateId(cateId);
    
    PageBean<Info> list = this.service.getInfoListByPageBean(pageBean);
    
    return list.getPageDatas();
  }
}
