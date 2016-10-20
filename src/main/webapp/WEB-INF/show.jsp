<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>淘缘</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="shortcut icon" href="/taoyuan/public/images/favicon.ico"
	type="image/x-icon" />
<link rel="stylesheet" href="/taoyuan/public/css/style.css"
	type="text/css" />

</head>
<body>

	<!-- header begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- header end -->
	
	<input type="hidden" id="hiddenInfoId" value="${requestScope.info.id }"/>
	<input type="hidden" id="hiddenUserId" value="${sessionScope.currentUser.id }"/>
	<div class="breadcrumbs">
		<span>&gt;</span><a>二手信息</a> <span>&gt;</span>${requestScope.info.title }
	</div>
	<div class="container clearfix">
		<div class="sidebar">
			<div class="sidebar_per sidebar_first">
				<dl>
					<dt>
						<a href="js.html?/0-0-6-0" class="more">更多&nbsp;<span
							class="more-sign">&gt;</span></a> <strong>推荐信息 <span
							class="name-en">/Recommed</span></strong>
					</dt>
					<c:forEach items="${requestScope.theInfoOfRecommend }" var="list">
                	<dd class="sidebar_articles">
                        <span>${list.addTime }</span>
                        <a target="_blank"  href="js.html?/436.html">${list.title }</a>
                    </dd>
                    </c:forEach>
				</dl>
			</div>
			<div class="sidebar_per">
			</div>
			<div class="sidebar_per">
				<dl>
					<dt>
						<a href="js.html?/" class="more">更多&nbsp;<span
							class="more-sign">&gt;</span></a> <strong>最新信息 <span
							class="name-en">/New</span></strong>
					</dt>
					<c:forEach items="${requestScope.theInfoOfNew }" var="list">
	                	<dd class="sidebar_articles">
	                        <span>${list.addTime }</span>
	                        <a target="_blank"  href="js.html?/436.html">${list.title }</a>
	                    </dd>
                    </c:forEach>
				</dl>
			</div>

			<div class="sidebar_per">
				
			</div>

			<div class="sidebar_per">
				
			</div>
		</div>
		<div class="detail">
			<div class="head">
				<div class="head_inner">
					<img class="round-image" width="50" height="50" alt="头像"
						src="${requestScope.userInfo.headImage }" />
					<h1>${requestScope.info.title }</h1>
					<p class="info">
						<span class="fr"></span><a style="color:orange;font-size:17px;"> ${requestScope.userLogin.userName }</a> <span
							class="addtime">${requestScope.info.infoAddTime }</span><span>浏览(<span>${requestScope.info.lookedCount }</span>)
						</span>
						<a class="poster_likes " onclick="getCollect($(this), '714', '2')"
							href="javascript:void(0)"> <i class="like_status lm_like"></i><em>收藏</em>
						</a>

					</p>
				</div>
			</div>
			<div class="content">
				
				${requestScope.info.content }

				<div class="comments">
					<div class="title">
						评论<span class="num_area">（<em class="comments_num"
							id="comments_num">${fn:length(requestScope.conmments) }</em>）
						</span>
					</div>

					<div class="comment_send clearfix">
						<div class="comment_avatar">
							<span class="userPic">
							</span> <font class="username"></font>
						</div>
						<div class="comment_sendPart" id='reply_0'>
							<textarea id="textareaComment" class="textarea_comment"
								name="content" autocomplete="off" data-default="发布评论"
								onblur="checkInputBlur($(this))"
								onfocus="checkInputFocus($(this));
                        if ($(this).val() != '发布评论')
                            $(this).css({'color': '#333'})">发布评论</textarea>
							<div class="btn_p clearfix">
								<span class="comment_tip" id="comment_tip_0" data-top="11"
									data-foot="36"></span>
								<button class="btn_subGrey btn" type="button"
									onclick="submitConm()">提 交</button>
							</div>
						</div>
					</div>
					<div class="comment_wrap">
						<ul class="comment_listBox" id="comment_list">
							<c:if test="${fn:length(requestScope.conmments) == 0}">
								无评论
							</c:if>
							<c:forEach items="${requestScope.conmments}" var="list" varStatus="vs">
								<li class="comment_list clearfix" id="comment_7908"
									style='border-bottom: none'>
									<div class="comment_avatar">
										<span class='userPic'><img width="36" height="36"
											src="/taoyuan/public/headerImg/default.jpg" alt="头像"></span> <span
											class="grey">${vs.count } 楼 </span>
									</div>
									<div class="comment_conBox">
										<div class="comment_avatar_time">
											<div class="time">${list.addtime }</div>
											${list.userName }
										</div>
										<div class="comment_conWrap clearfix">
											<div class="comment_action">
											</div>
											<div class="comment_con">${list.content }</div>
										</div>
										<div class="blockquote_wrap"></div>
									</div>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- footer begin -->
	<jsp:include page="/WEB-INF/public/footer.jsp" />
	<!-- footer end -->

	<script type="text/javascript">
		function submitConm() {
			
			var infoId = $("#hiddenInfoId").val();
			var userId = $("#hiddenUserId").val();
			var content = $("#textareaComment").val();
			
			if(userId == "") {
				window.location.href='login';
			}
			$.ajax({
				
				type:'post',
				url: 'submitConm',
				timeout: 3000,
				data: {infoId : infoId, userId : userId, content : content},
				dataType:'json',
				success:function(data){
					if(data.status == 1){
						
						window.location.reload();
					}
				}
			});
		}
	</script>
	<script src="/taoyuan/public/js/jquery.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/common.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/other/jquery.SuperSlide.2.1.1.js"
		type="text/javascript"></script>
</body>
</html>