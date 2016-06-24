<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <title>淘缘</title>
        <meta name="keywords" content="" /> 
        <meta name="description" content="" /> 
        <link rel="shortcut icon" href="/taoyuan/public/images/favicon.ico" type="image/x-icon" /> 
        <link rel="stylesheet" href="/taoyuan/public/css/style.css" type="text/css" /> 
                
    </head> 
    <body> 
	
	<!-- header begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- header end -->
	
	<div class="container">
    <div class="index_per index_first clearfix">
        <div class="sidebar_per sidebar_first">
            <dl>
                <dt>
                <a href="js.html?/" class="more">更多&nbsp;<span class="more-sign">&gt;</span></a>
                <strong>最新更新 <span class="name-en">/New</span></strong>
                </dt>
                	<c:forEach items="${requestScope.theInfoOfNew }" var="list">
	                	<dd class="sidebar_articles">
	                        <span>${list.addTime }</span>
	                        <a target="_blank"  href="/taoyuan/show?infoId=${list.id }">${list.title }</a>
	                    </dd> 
                    </c:forEach>         
               </dl>
        </div>
        <div class="index_left clearfix">
            <div class="banner" id="banner">
                <ul id="index_banner">
                    <li>
                        <a target="_blank" href="js.html?/0-0-52-0-0-0">
                            <img alt="响应式模板" src="/taoyuan/public/images/index/index1.jpg"/>
                        </a>
                    </li>
                    <li>
                        <a target="_blank" href="js.html?/22-0-0-0-0-0">
                            <img alt="404模板" src="/taoyuan/public/images/index/index3.jpg"/>
                        </a>
                    </li>
                    <li>
                        <a target="_blank" href="js.html?/53-0-0-0-0-0">
                            <img alt="商城,特卖模板" src="/taoyuan/public/images/index/index2.jpg"/>
                        </a>
                    </li>
                </ul>
                <div class="banner_page" id="banner_page"></div>
                <a class="banner_page_btn banner_page_left" id="banner_page_left"></a>
                <a class="banner_page_btn banner_page_right" id="banner_page_right"></a>
            </div>
            <div class='merchant_cats'>
                <div class='head'><h3>信息分类</h3></div>
                <div class="content" id="merchant_cats_menus"> 
                <c:forEach items="${requestScope.categories }" var="list">
                    <a href="toList?cateId=${list.id }&page=1">
                        <i class="merchant_arrow merchant_arrow_right"></i>
                        <span class="icon_merchant icon_merchant_fire"></span><span class="name">${list.categoryName }</span>
                        <i class="merchant_arrow_left"></i> 
                    </a>   
                </c:forEach>          
                </div> 
            </div>
        </div>
    </div>
    <div class="index_per clearfix">
        <aside class="sidebar_per sidebar_second">
            <dl>
                <dt>
                <a href="js.html?/0-0-0-6-0-0" class="more" target="_blank">更多&nbsp;<span class="more-sign">&gt;</span></a>
                <strong>推荐 <span class="name-en">/Recommend/</span></strong>
                </dt>
                	<c:forEach items="${requestScope.theInfoOfRecommend }" var="list">
                	<dd class="sidebar_articles">
                        <span>${list.addTime }</span>
                        <a target="_blank"  href="/taoyuan/show?infoId=${list.id }">${list.title }</a>
                    </dd>
                    </c:forEach>
               </dl>
        </aside>
        <div class="index_recommend" id='index_recommend_0'>
            <div class="head clearfix">
                <strong>淘缘er聚集地</strong>
                <a class="more" href="js.html?" target="_blank">更多&nbsp;<span class="more-sign">></span></a>
                  <ul class="clearfix index-coupon-menus">
                    <li class="current index-coupon-menus-first"> 爱美扮靓<span class="arrow-up-menu arrow"></span></li>
                    <li>旅游达人<span class="arrow-up-menu arrow"></span></li>
                    <li>好吃嘴<span class="arrow-up-menu arrow"></span></li>
                    <li>数码淘宝<span class="arrow-up-menu arrow"></span></li>
                    
                   </ul>

            </div>
            <div class="content clearfix">
                <div class="per current">
                    <ul class="ul_pics">
                        <li><a target="_blank"  href="js.html?/440.html">
                             <img src="/taoyuan/public/images/category/category1.jpg" alt="美容护肤" class="lazy"  />
                                    全部商品                                </a></li><li><a target="_blank"  href="js.html?/438.html">
                             <img src="/taoyuan/public/images/category/category2.jpg" alt="全部商品" class="lazy"  />
                                    全部商品                                </a></li><li><a target="_blank"  href="js.html?/437.html">
                            <img src="/taoyuan/public/images/category/category3.jpg" alt="全部商品" class="lazy"  />
                                    全部商品                                </a>

                        </li>               
                    </ul>
                    <ul class="ul_words">
                        <li><a target="_blank"  href="js.html?/442.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/441.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/439.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/436.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li>  
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">全部商品</a></li>                                                                                                                         
                   </ul>
                </div>
               <div class="per">
                        <ul class="ul_pics">
                        <li><a target="_blank"  href="js.html?/440.html">
                             <img src="/taoyuan/public/images/category/category1.jpg" original="http://www.sucaihuo.com/modals/4/440/small.jpg" alt="美容护肤" class="lazy"  />
                                    美容护肤                                </a></li><li><a target="_blank"  href="js.html?/438.html">
                             <img src="/taoyuan/public/images/category/category2.jpg" original="http://www.sucaihuo.com/modals/4/438/small.jpg" alt="美容护肤" class="lazy"  />
                                    美容护肤                                </a></li><li><a target="_blank"  href="js.html?/437.html">
                            <img src="/taoyuan/public/images/category/category3.jpg" original="http://www.sucaihuo.com/modals/4/437/small.jpg" alt="美容护肤" class="lazy"  />
                                    美容护肤                                </a>

                        </li>               
                    </ul>
                    <ul class="ul_words">
                        <li><a target="_blank"  href="js.html?/442.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/441.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/439.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/436.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li>  
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">美容护肤</a></li>                                                                                                                         
                   </ul>
                    </div>
                 <div class="per">
                        <ul class="ul_pics">
                        <li><a target="_blank"  href="js.html?/440.html">
                             <img src="/taoyuan/public/images/category/category1.jpg" original="http://www.sucaihuo.com/modals/4/440/small.jpg" alt="电子产品" class="lazy"  />
                                    电子产品                                </a></li><li><a target="_blank"  href="js.html?/438.html">
                             <img src="/taoyuan/public/images/category/category2.jpg" original="http://www.sucaihuo.com/modals/4/438/small.jpg" alt="电子产品" class="lazy"  />
                                    电子产品                                </a></li><li><a target="_blank"  href="js.html?/437.html">
                            <img src="/taoyuan/public/images/category/category3.jpg" original="http://www.sucaihuo.com/modals/4/437/small.jpg" alt="电子产品" class="lazy"  />
                                    电子产品                                </a>

                        </li>               
                    </ul>
                    <ul class="ul_words">
                        <li><a target="_blank"  href="js.html?/442.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/441.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/439.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/436.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li>  
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">电子产品</a></li>                                                                                                                         
                   </ul>
                    </div>
                 <div class="per">
                        <ul class="ul_pics">
                        <li><a target="_blank"  href="js.html?/440.html">
                             <img src="/taoyuan/public/images/category/category1.jpg" original="http://www.sucaihuo.com/modals/4/440/small.jpg" alt="生活周边" class="lazy"  />
                                    生活周边                                </a></li><li><a target="_blank"  href="js.html?/438.html">
                             <img src="/taoyuan/public/images/category/category2.jpg" original="http://www.sucaihuo.com/modals/4/438/small.jpg" alt="生活周边" class="lazy"  />
                                    生活周边                                </a></li><li><a target="_blank"  href="js.html?/437.html">
                            <img src="/taoyuan/public/images/category/category3.jpg" original="http://www.sucaihuo.com/modals/4/437/small.jpg" alt="生活周边" class="lazy"  />
                                    生活周边                                </a>

                        </li>               
                    </ul>
                    <ul class="ul_words">
                        <li><a target="_blank"  href="js.html?/442.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/441.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/439.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/436.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li>  
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li>
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li> 
                        <li><a target="_blank"  href="js.html?/435.html">生活周边</a></li>                                                                                                                         
                   </ul>
                    </div>

          </div>
        </div>


    </div>
</div>
	<!-- footer begin -->
	<jsp:include page="/WEB-INF/public/footer.jsp" />
	<!-- footer end -->
    <script src="/taoyuan/public/js/jquery.js" type="text/javascript"></script>
    <script src="/taoyuan/public/js/common.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/other/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<div class="mmsg-box mmsg-box-info" id='msg-box' style="margin-top: -23.5px; margin-left: -96.5px;">
    <div class="mmsg-content">
        <i class="mmsg-icon"></i>
        <p id='msg-box-content'></p>
    </div>
    <div class="mmsg-background"></div>
</div>
<script  type="text/javascript">

</script>
</body>
</html>