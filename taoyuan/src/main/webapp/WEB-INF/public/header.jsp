<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<input type="hidden" value="${sessionScope.currentUser.userName }"
	id="hiddenUserName">
<div id="site_nav">
	<div class="sn_container clearfix">
		<ul class="tg_tools fr">
			<li class="no-hover"><a href="member_pay.html"
				class="head_pay_btn"></a></li>
			<li class="no-hover"><a id="msg_notify" class="msg_notify"
				href="member_message.html"></a></li>
			<li class='box_color nav_home'><span><a
					href="member_index.html">个人中心</a></span><b class="icon"></b>
				<ul>
					<li><a href="member_index.html"><span>我的主页</span></a></li>
					<li><a href="member/toSet"><span>个人设置</span></a></li>
					<li><a href="member_downloads.html"><span>下载记录</span></a></li>

					<li><a href="member_sign.html"><span>我的签到</span></a></li>
					<li><a href="http://www.sucaihuo.com/Download/logout?r="><span>退出登录</span></a></li>
				</ul></li>
			<li class="tg-line icon"></li>
			<li class='box_color'><span>帮助中心</span><b class="icon"></b>
				<ul>
					<li><a href="help.html"><span>淘缘</span></a></li>

				</ul></li>
		</ul>
		<ul class="tg_tools fl" id="login_area">
			<li class="tg_tools_home no-hover"><i class="icon-more"></i><span><a
					href="index.html">淘缘首页</a></span></li>

			<li class="no-hover nologin"><span><a
					href="${pageContext.request.contextPath}/login">登录</a></span></li>
			<li class="tg-line icon"></li>
			<li class="no-hover nologin"><span><a
					href="${pageContext.request.contextPath}/register">注册</a></span></li>
			<li class="no-hover hide haslogin"><span><a
					href="member_index.html"><font class="sn_login username"
						id='head_username'></font></a></span></li>
			<li class="no-hover hide haslogin"><span><a
					href="${pageContext.request.contextPath}/logout">退出</a></span></li>
		</ul>
	</div>
</div>
<nav id="header">
	<div class="tg_tools_home">
		<div class="bbs_enter">
			<a class="bbs-banner" href="${pageContext.request.contextPath}"
				target="_blank"><img src="/taoyuan/public/images/banner.jpg" /></a>
		</div>
		<div class="logo">
			<a class="logo-bd" href="${pageContext.request.contextPath}"><img
				src="/taoyuan/public/images/logo.jpg" alt="logo" /></a>
		</div>
		<form action="search.html" method="get" id="form_search"
			onsubmit="return searchSub()">
			<div id='search'>
				<div class="search_area">
					<input type='submit' value='搜 索' class='btn_search' />
					<div class="search_select">
						<span class="icon-search"></span>
					</div>
					<input type='text' value='请输入搜索内容' class="search_input"
						autocomplete="off" id="search_input" data-default="请输入搜索内容"
						onblur="checkInputBlur($(this))"
						onfocus="checkInputFocus($(this))" /> <input type="hidden"
						name="keyword" />
				</div>
			</div>
		</form>
	</div>
</nav>

<div id='nav' class='nav'>
	<div class='nav_main clearfix'>
		<a href='${pageContext.request.contextPath}' class="menu">首 页</a>
	    <a href="${pageContext.request.contextPath}/toList?order='lookedCount'" class="menu">最 热</a> 
	    <a href="${pageContext.request.contextPath}/toList?order='add_time'" class="menu">最新</a> 
	    <a href="${pageContext.request.contextPath}/toList?order='lookedCount'" class="menu">精 选</a> 
	    <a href="${pageContext.request.contextPath}/toList?order='isHot'" class="menu">推 荐</a> 
	    <a href='${pageContext.request.contextPath}/member/toMyInfo' class="menu">我的二手</a> 
	    <a href='${pageContext.request.contextPath}/addInfo' class="menu">发布信息</a> 
	    <span class='icon_hot'></span>
	</div>
</div>