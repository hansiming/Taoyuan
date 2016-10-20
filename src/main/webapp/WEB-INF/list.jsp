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

</head>
<body>

	<!-- header begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- header end -->

	<div id="classify" class="tg_classify">
		<div class="tg_tab_box on">
			<div class="tg_classify_wrap clearfix">
				<dl class="tg_classify_all tg_classify_flat dl_left">
					<dt class="">
						<i class="icon_order"></i> 信息分类
					</dt>
				</dl>


				<dl class="tg_classify_all tg_classify_flat clearfix dl_right">

					<c:choose>
						<c:when test="${requestScope.cateId == 0 }">
							<dd class='on'>
								<a href="toList?cateId=0"><span>不限</span></a>
							</dd>
						</c:when>
						<c:otherwise>
							<dd class="" style="">
								<a href="toList?cateId=0"><span>不限</span></a>
							</dd>
						</c:otherwise>
					</c:choose>
					<c:forEach items="${requestScope.categories }" var="list">
						<c:choose>
							<c:when test="${requestScope.cateId == list.id }">
								<dd class='on'>
									<a href="toList?cateId=${list.id }"><span>${list.categoryName }</span></a>
								</dd>
							</c:when>
							<c:otherwise>
								<dd class="" style="">
									<a href="toList?cateId=${list.id }"><span>${list.categoryName }</span></a>
								</dd>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</dl>
			</div>
		</div>
	</div>
	<div id="container">
		<div id="sort" class="tg_sort clearfix">
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="on">
						<a href="toList?cateId=${requestScope.cateId }"> <i
							class="icon_order"></i> <span>默认</span> <b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-2-0"> <i class="icon_order"></i> <span>下载</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-3-0"> <i class="icon_order"></i> <span>评论</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-4-0"> <i class="icon_order"></i> <span>浏览</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_simplecheck">
					<dt class="">
						<a href="js.html?/0-0-6-0"> <i class="icon_order"></i> <span>推荐</span>
						</a>
					</dt>
				</dl>
			</div>
			<div id="order-page" class="order-page">
				<span class='find_results_num'>共<span class="red">
						${requestScope.pageBean.totalRecords } </span>个 <span class="red">
						${requestScope.pageBean.wheres }</span>信息
				</span> <span class='page-small'> <!-- 上一页按钮 begin --> 
				<c:choose>
						<c:when test="${requestScope.pageBean.isHavePrePage }">
							<a class="prev-btn page-btn"
								href="toList?cateId=${list.id }&page=${requestScope.pageBean.pageIndex - 1 }"><span
								class="arrow-left arrow"></span></a>
						</c:when>
						<c:otherwise>
							<a class="prev-btn page-btn" href="#"><span
								class="arrow-left arrow arrow-left-none"></span></a>
						</c:otherwise>
					</c:choose> 
					<!-- 上一页按钮 end --> 
					<span class="orange">${requestScope.pageBean.pageIndex }</span>/${requestScope.pageBean.totalPages }
					<!-- 下一页按钮 begin --> <c:choose>
						<c:when test="${requestScope.pageBean.isHaveNextPage }">
							<a class="pnext-btn page-btn"
								href="toList?cateId=${list.id }&page=${requestScope.pageBean.pageIndex + 1 }"><span
								class="arrow-right arrow"></span></a>
						</c:when>
						<c:otherwise>
							<a class="pnext-btn page-btn" href="#"><span
								class="arrow-right arrow arrow-right-none"></span></a>
						</c:otherwise>
					</c:choose> <!-- 下一页按钮 end --> <!-- <a class="pnext-btn page-btn" href="js.html?/0-0-0-2"><span class="arrow-right arrow "></span></a> -->
				</span>
			</div>
		</div>
		<div class="list">
			<div class="list_main clearfix">
				<!-- 遍历输出分页信息 -->
				<c:forEach items="${requestScope.pageBean.pageDatas }" var="list"
					varStatus="statu">
					<c:choose>
						<c:when test="${statu.index % 4 == 3 }">
							<div class="per" style="margin-right: 0">
								<a target="_blank" href="/taoyuan/show?infoId=${list.id }" class="img_link">
									<img src="${list.imageUrl }" alt="${list.title }" class="lazy" />
								</a>
								<div class="foot">
									<p class="title">
										<a target="_blank" href="/taoyuan/show?infoId=${list.id }">${list.title }</a>
									</p>
									<div class="statics">
                                	<a class='download citecommon'>发布者 <em>${list.userName }</em></a>
									<a class='comment citecommon'>评论 <em>${list.commentCount }条</em></a> 
									<a class='scores citecommon'>浏览 <em>${list.lookedCount }次</em></a>
									</div>
								</div>
							</div>
						</c:when>
						<c:otherwise>
							<div class="per">
								<a target="_blank" href="/taoyuan/show?infoId=${list.id }" class="img_link">
									<img src="${list.imageUrl }" alt="${list.title }" class="lazy" />
								</a>
								<div class="foot">
									<p class="title">
										<a target="_blank" href="/taoyuan/show?infoId=${list.id }">${list.title }</a>
									</p>
									<div class="statics">
	                                	<a class='download citecommon'>发布者 <em>${list.userName }</em></a>
										<a class='comment citecommon'>评论 <em>${list.commentCount }条</em></a> 
										<a class='scores citecommon'>浏览 <em>${list.lookedCount }次</em></a>
									</div>
								</div>
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
		</div>
		<div class="pager">
			共<span class="red"> ${requestScope.pageBean.totalRecords } </span>个${requestScope.pageBean.wheres }信息
			<c:choose>
				<c:when test="${requestScope.pageBean.isHavePrePage }">
					<a class="prev"
						href="toList?cateId=${list.id }&page=${requestScope.pageBean.pageIndex - 1 }">
						上一页 </a>
				</c:when>
				<c:otherwise>
					<a class="prev">上一页</a>
				</c:otherwise>
			</c:choose>
			<c:forEach begin="1" end="${requestScope.pageBean.totalPages }"
				var="index" varStatus="count">
				<c:choose>
					<c:when test="${count.count == requestScope.pageBean.pageIndex }">
						<a class="current">${count.count }</a>
					</c:when>
					<c:otherwise>
						<a class="num" href="toList?cateId=${list.id }&page=${count.count }">${count.count }</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:choose>
				<c:when test="${requestScope.pageBean.isHaveNextPage }">
					<a class="next"
						href="toList?cateId=${list.id }&page=${requestScope.pageBean.pageIndex + 1 }">
						下一页 </a>
				</c:when>
				<c:otherwise>
					<a class="next">下一页</a>
				</c:otherwise>
			</c:choose>
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