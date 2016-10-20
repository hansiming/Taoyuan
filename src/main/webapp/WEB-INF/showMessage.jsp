<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="refresh" content="5; url=${pageContext.request.contextPath }/index" > 
<title>页面跳转</title>

<link rel="shortcut icon" href="/taoyuan/public/images/favicon.ico" type="image/x-icon" /> 
<link rel="stylesheet" href="/taoyuan/public/css/style.css" type="text/css" /> 
<link rel="stylesheet" href="/taoyuan/public/login/base.css" />

<style type="text/css">
body,h2,p{ margin:0;padding:0;}
body{ background:url(bg404all.gif) repeat;}
.con_404{ width:500px; height:371px;  position:absolute; left:50%; margin-left:-250px; top:100px;}
.in_404{  width:460px; margin:220px 20px 0 20px; float:left;}
.in_404 h2{ font-size:16px; line-height:30px;}
.in_404 p{ line-height:22px; margin:5px 0; font-size:12px; letter-spacing:1px;}
.in_404 p a{ color:#333333; text-decoration:none;}
.back{ }
.back label{ float:left; padding-top:5px;}
.back a,.back a img{ float:left;}
#last_btn{ border:none; background:none; color:red; width:10px;}
</style>

<script language="javascript">

var wait_time = 5; 
var secs_time = 0;         
for(var i=1;i<=wait_time;i++)
{
 window.setTimeout("sTimer("+i+")",i*1000);
}
function sTimer(num)
{
 if(num==wait_time)
 {
	document.getElementById("last_btn").value="0";
  document.getElementById("last_btn").disabled=false;
 }
 else
 {
  secs_time=wait_time-num;
  document.getElementById("last_btn").value=""+secs_time+"";
 }
}
</script> 

</head>
<body>

	<!-- header begin -->

	<jsp:include page="/WEB-INF/public/header.jsp" />

	<!-- header end -->

	<div class="wrap" style="float: left">
		<div class="pop-title clearfix">
			<div class="con_404">
				<div class="in_404">
					<h2></h2>
					<img src="/taoyuan/public/images/validmail-icon.png" border="0"
						style="display: inline; vertical-align: middle;">
					<p style="display: inline">
						<input type="submit" value="5" disabled="disabled" id="last_btn">
						${sessionScope.message }
					</p>
					   <p class="back">
      					<a href="index"></a> 
    					</p>
     		</div>  
    	</div>  
    </div>
  </div>

	<!-- footer begin -->

	<div class="footer" style="margin: 300px 0 0;" ; id="footer"
		data-url="http://www.sucaihuo.com/"
		data-logout="http://www.sucaihuo.com/Download/logout?r=" data-id=""
		data-mtype="">
		<div class="footer_main clearfix">
			<div class="guide">
				<span class="guide_icon"></span>
				<ul class="ul_foot">
					<li><strong>购物指南</strong></li>
					<li><a href="js.html?/3-0-0-0-0-0">购物流程</a><a
						href="js.html?/7-0-0-0-0-0">服务协议</a></li>
					<li><a href="js.html?/4-0-0-0-0-0">购买说明</a><a
						href="js.html?/8-0-0-0-0-0">购买服务</a></li>

				</ul>
			</div>
			<div class="stores">
				<span class="stores_icon"></span>
				<ul class="ul_foot">
					<li><strong>支付方式</strong></li>
					<li><a href="js.html?/7-0-0-0">银联支付</a><a
						href="js.html?/7-0-0-0">支付宝支付</a></li>
					<li><a href="js.html?/8-0-0-0">其他</a><a
						href="js.html?/14-0-0-0"></a></li>
				</ul>
			</div>
			<div class="rebate">
				<span class="rebate_icon"></span>
				<ul class="ul_foot">
					<li><strong>配送方式</strong></li>
					<li><a href="js.html?/177.html">配送说明</a><a
						href="js.html?/44.html"></a></li>

				</ul>
			</div>
			<div class="follow">
				<span class="follow_icon"></span>
				<ul>
					<li><strong>联系我们</strong></li>
					<li>qq：294098789</li>
					<li>手机：18482195202</li>
				</ul>
			</div>
			<div class="friendly">
				<div class="foot_menu">
					<a href="help.html" target="_blank"></a> <span class="address">Copyright&copy;2016-2017
						淘缘 All Rights Reserved.</span>
				</div>
			</div>
		</div>
	</div>

	<!-- footer end -->
</body>
</html>