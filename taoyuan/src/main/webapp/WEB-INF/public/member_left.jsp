<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- header begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- header end -->

	<div class="container clearfix">
		<div class="member_right">
			<div class="member_per">
				<div class="panel clearfix">
					<div class="panel-info clearfix">
						<a href="member_avatar.html"><img class="round-image"
							width="50" height="50" src="${requestScope.userInfo.headImage }" alt="头像"></a>
						<div class="name-job">
							<h4 class="myname">素材火管理员</h4>
							<p class="job-title">技术总监</p>
						</div>
					</div>
					<div class="sign-wrap">
						<textarea id="signed_textarea" class="signed_textarea" disabled
							autocomplete="off">继续来吧.</textarea>
						<em id="signed_edit" class="signed_edit"></em>
					</div>
					<p id="signed_error" class="signed_error"></p>
					<div class="rank-points">
						<ul>
							<li class="mp-item"><a class="mp-atag"
								href="member_points.html"> <span class="mp-title">积分</span>
									<span class="mp-num">20552</span>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="member_per">
				<ul class="nav panel">
					<li><a href="member_index.html"><i
							class="icon-nav icon-tick"></i>我的主页</a></li>
					<li><a href="member_set.html"><i
							class="icon-nav icon-note"></i>我的设置</a></li>
					<li><a href="member_comment.html"><i
							class="icon-nav icon-plan"></i>我的评论</a></li>
					<li><a href="member_topic.html"><i
							class="icon-nav icon-ques"></i>我的话题</a></li>
					<!--            <li>
                <a href="" class=""><i class="icon-nav icon-code"></i>我的代码</a>
            </li>-->
					<li style='border-bottom: none'><a href="member_message.html"
						class=""><i class="icon-nav icon-msg"></i>我的消息</a></li>
				</ul>
			</div>
			<div class="member_per">
				<ul class="space-data panel">
					<li><span class="icon-clock icon" title="下载"></span> 下载： <a
						href="member_downloads.html">53次</a></li>
					<li><span class="icon-tick icon" title="收藏"></span> 收藏： <a
						href="http://www.sucaihuo.com/Member/collects.html">3条</a></li>
					<li><span class="icon-note icon" title="签到"></span> 签到： <a
						class="countNote" href="member_sign.html">15次</a></li>
					<!--            <li>
                <span class="icon-ques icon" title="发表"></span>
                话题：
                <a href="">0条</a>
            </li>-->
					<!--            <li>
                <span class="icon-chat icon" title="回答"></span>
                回答：
                <a href="">0条</a>
            </li>-->
					<li><span class="icon-code icon" title="代码"></span> 代码： <a
						href="">0条</a></li>
					<li><span class="icon-user icon" title="粉丝"></span> 粉丝： <a
						href="">0个</a></li>
				</ul>
			</div>
		</div>
</body>
</html>