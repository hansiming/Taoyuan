<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="site_nav">
            <div  class="sn_container clearfix">
                <ul class="tg_tools fr">
                    <li class="no-hover">
                        <a href="member_pay.html" class="head_pay_btn"></a>
                    </li>
                    <li class="no-hover">
                        <a id="msg_notify" class="msg_notify" href="member_message.html"></a>
                    </li>
                    <li class='box_color nav_home'>
                        <span><a href="member_index.html">个人中心</a></span><b class="icon"></b>
                        <ul>
                            <li><a href="member_index.html"><span>我的主页</span></a></li>
                            <li><a href="member_set.html"><span>个人设置</span></a></li>
                            <li><a href="member_downloads.html"><span>下载记录</span></a></li>
                            
                            <li><a href="member_sign.html"><span>我的签到</span></a></li>
                            <li><a href="http://www.sucaihuo.com/Download/logout?r="><span>退出登录</span></a></li>
                        </ul>
                    </li>
                    <li class="tg-line icon"></li>
                    <li class='box_color'>
                        <span>帮助中心</span><b class="icon"></b>
                        <ul>
                            <li><a href="help.html"><span>淘缘</span></a></li>

                        </ul>
                    </li>
                </ul>
                <ul class="tg_tools fl" id="login_area" >
                    <li class="tg_tools_home no-hover"><i class="icon-more"></i><span><a href="index.html">淘缘首页</a></span></li>

                                            <li class="no-hover nologin"><span><a href="http://www.sucaihuo.com/Index/login/type/qq.html"><img alt="Connect_logo_6.png" src="http://qzonestyle.gtimg.cn/qzone/vas/opensns/res/img/Connect_logo_6.png" style="position: relative;top:3px;"/></a></span></li>
                        <!--                                                <li class="no-hover nologin"><span><a href="http://www.sucaihuo.com/login.html" class="sn_login">登录</a></span></li>-->
                        <li class="no-hover hide haslogin"><span><a href="member_index.html"><font class="sn_login username" id='head_username'></font></a></span></li>
                        <li class="tg-line icon"></li>
                        <li class="no-hover nologin"><span><a href="http://www.sucaihuo.com/reg.html">注册</a></span></li>
                        <li class="no-hover hide haslogin"><span><a href="http://www.sucaihuo.com/Download/logout?r=">退出</a></span></li>                    <li class='box_color nav_home' id="nav_login">
                            <span><a href="http://www.sucaihuo.com/login.html" class="sn_login">登录</a></span><b class="icon"></b>
                            <ul>
                                <li><a href="http://www.sucaihuo.com/Index/login/type/sina.html"><span>新浪微博</span></a></li>
                                <li><a href="http://www.sucaihuo.com/Index/login/type/renren.html"><span>人人网<i style="visibility: hidden">站</i></span></a></li>
                            </ul>
                        </li>                </ul>
            </div>
        </div>
        <div id="header">
            <div class="tg_tools_home">
                <div class="bbs_enter">
                    <a class="bbs-banner"  href="help.html" target="_blank"><img src="Public/images/other/banner.jpg" alt="扒模板"/></a>
                </div>
                <div class="logo">
                    <a class="logo-bd"  href="index.html"><img src="Public/images/logo.png" alt="素材火logo"/></a>
                </div>
                <form action="search.html" method="get" id="form_search" onsubmit="return searchSub()">
                    <div id='search'>
                        <div class="search_area">
                            <input type='submit' value='搜 索' class='btn_search'/>
                            <div class="search_select">
                                <span class="icon-search"></span>
                            </div>
                            <input type='text' value='请输入搜索内容'  class="search_input"  autocomplete="off" id="search_input" data-default="请输入搜索内容" onblur="checkInputBlur($(this))" onfocus="checkInputFocus($(this))" />
                            <input type="hidden" name="keyword"/>
                        </div>
                        <div class="search_box hide" id="search_box"></div>
                        <div class='search_keywords' >
                            <span></span>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=手机" class="red"></a>
                            <a href="js.html?/8-0-0-0"></a>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=bootstrap"></a>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=后台"></a>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=上传"class="red"></a>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=购物车"></a>
                            <a href="js.html?/106-0-0-0" class="red"></a>
                            <a href="http://www.sucaihuo.com/search/search.html?keyword=弹出层"></a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
</body>
</html>