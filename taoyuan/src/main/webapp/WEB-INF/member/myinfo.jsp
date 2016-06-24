<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" href="/taoyuan/other/topic/css/topic.css"
	type="text/css" />
</head>
<body>
	<!-- left begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- left end -->

	<div class="wenda clearfix">

		<div class="wenda-main">
			<ul class="wenda-tab clearfix">
				<c:choose>
					<c:when test="${requestScope.cateId == 0 }">
						<li class='tabactive'><a
							href="/taoyuan/member/toMyInfo?cateId=0">全部信息</a></li>
					</c:when>
					<c:otherwise>
						<li class=''><a href="/taoyuan/member/toMyInfo?cateId=0">全部信息</a></li>
					</c:otherwise>
				</c:choose>
				<c:forEach items="${requestScope.categories }" var="list">
					<c:choose>
						<c:when test="${requestScope.cateId == list.id }">
							<li class='tabactive'><a
								href="/taoyuan/member/toMyInfo?cateId=${list.id }">${list.categoryName }</a></li>
						</c:when>
						<c:otherwise>
							<li class=''><a
								href="/taoyuan/member/toMyInfo?cateId=${list.id }">${list.categoryName }</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ul>

			<div class="newpost clearfix">
				<a class="quealltab onactive" href="http://www.sucaihuo.com/topic/">最新</a>
				<a class="quealltab " href="http://www.sucaihuo.com/topic/0-1-0">最近评论</a>
			</div>
			<!--左侧列表内容-->
			<div class="wenda-list">

				<c:forEach items="${requestScope.pageBean.pageDatas }" var="list">
					<div class="wenda-listcon clearfix">
						<div class="headslider">
							<a title="sunzhe" target="_blank" class="wenda-head"
								href="/taoyuan/show?infoId=${list.id }"> <img
								width="40" height="40" src="${list.imageUrl }"
								alt='sunzhe' />
							</a> 
						</div>
						<div class="wendaslider">
							<a class="replynumber hasanswernum" target="_blank"
								href="/taoyuan/show?infoId=${list.id }">
								<div class="ys">
									<div class="number">
										<span>${list.commentCount }</span>
									</div>
									<div>评论</div>
								</div>
								<div class="browsenum">
									<div class="number">
										<span>${list.lookedCount }</span>
									</div>
									<div>浏览</div>
								</div>
							</a>

							<h2 class="wendaquetitle">
								<i class="icon-ad"></i>
								<div class="wendatitlecon">
									<a class="wendatitle"
										href="/taoyuan/show?infoId=${list.id }">${list.title }</a>
								</div>
							</h2>

							<div class="replycont clearfix">
								<i class="icon-msg-revert"></i>

								<div class="l replydes">
									<span class="replysign praise">[最新评论]</span> 
									<a class="replyuserhead" title="1979933952" target="_blank"
										href="/taoyuan/show?infoId=${list.id }">
										<img width="20" height="20" src="other/avatar/dir/1476.jpg"
										alt='1979933952'> 
									</a> 
									<a class="nickname"
										title="1979933952" target="_blank"
										href="http://www.sucaihuo.com/space/uid/1476">1979933952:
									</a> 
									<span class="replydet">活跃用户莱尔</span>
								</div>
							</div>

							<div class="replymegfooter clearfix">
								<div class="wenda-time l">
									<em>发布时间：${list.infoAddTime }</em>
								</div>
								<div class="keyword-list l"></div>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<div class="pager">
					共 <span class="red"> ${requestScope.pageBean.totalRecords } </span>个信息 
					<c:choose>
						<c:when test="${requestScope.pageBean.isHavePrePage }">
							<a class="prev" href="/taoyuan/member/toMyInfo?cateId=${requestScope.cateId }&page=${requestScope.pageBean.pageIndex - 1 }">上一页</a> 
						</c:when>
						<c:otherwise>
							<a class="prev" href="#">上一页</a> 
						</c:otherwise>
					</c:choose> 
					<a class="current">1</a> 
					<c:choose>
						<c:when test="${requestScope.pageBean.isHaveNextPage }">
							<a class="next" href="/taoyuan/member/toMyInfo?cateId=${requestScope.cateId }&page=${requestScope.pageBean.pageIndex + 1 }">下一页</a> 
						</c:when>
						<c:otherwise>
							<a class="next" href="#">下一页</a> 
						</c:otherwise>
					</c:choose> 
				</div>
			</div>
		</div>
		<div class="wenda-slider">
			<!-- pub new ques -->
			<div class="newques-container">
				<a id="js-newques" class="newques-btn"
					href="/taoyuan/addInfo">
					<i class="icon-addques"></i>发新信息</a>
			</div>

			<div class="panel hot">
				<div class="panel-heading">
					<h2 class="panel-title">一周热门信息</h2>
				</div>
				<div class="panel-body clearfix">
					<ul class="weekly-hot">
						<li class="padtop"><em class="hoticon hot1">热</em><a
							class="hottalk" target="_blank"
							href="http://www.sucaihuo.com/topic/37.html">真的很不错</a><i
							class="rankingnum">9<br>浏览
						</i></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- footer begin -->
	<jsp:include page="/WEB-INF/public/footer.jsp" />
	<!-- footer end -->

	<script src="/taoyuan/public/js/jquery.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/common.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/other/jquery.SuperSlide.2.1.1.js"
		type="text/javascript"></script>
</body>
</html>