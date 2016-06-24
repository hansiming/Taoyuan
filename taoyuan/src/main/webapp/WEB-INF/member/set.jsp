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
		<link rel="stylesheet" href="/taoyuan/public/css/style.css"
			type="text/css" />
		<link rel="stylesheet" href="/taoyuan/public/css/member.css"
			type="text/css" />
	</head>
<body>
	<!-- left begin -->
	<jsp:include page="/WEB-INF/public/member_left.jsp" />
	<!-- left end -->
	
		<div class="member_main">
			<div class="perInfo">
				<div class="titleInfoBorder">
					<span>我的设置</span>
				</div>
				<div class="firstTabBox lineSpace">
					<a class="tab currentTab" href="member_set.html">个人资料</a>
				</div>
			</div>
        <div class="setting-right-wrap wrap-boxes settings">
            <div id="setting-profile" class="setting-wrap setting-profile">
                <div class="wlfg-wrap">
                    <label class="label-name" for="nick">昵称</label>
                    <input id="nickname" class="rlf-input rlf-input-nick" type="text" placeholder="请输入昵称." value="${sessionScope.currentUser.userName }" data-validate="nick" autocomplete="off" name="nickname">
                </div>
                <div class="wlfg-wrap">
                    <label class="label-name" for="job">职位</label>
                    <select id="job" class="rlf-select" hidefocus="true" name="job" autocomplete="off">
                        <option value="">请选择职位</option>
                        <option value="页面重构设计" >页面重构设计</option>
                        <option value="交互设计师" >交互设计师</option>
                        <option value="产品经理" >产品经理</option>
                        <option value="UI设计师" >UI设计师</option>
                        <option value="JS工程师" >JS工程师</option>
                        <option value="Web前端工程师" >Web前端工程师</option>
                        <option value="移动开发工程师" >移动开发工程师</option>
                        <option value="PHP开发工程师" >PHP开发工程师</option>
                        <option value="软件测试工程师" >软件测试工程师</option>
                        <option value="Linux系统工程师" >Linux系统工程师</option>
                        <option value="JAVA开发工程师" >JAVA开发工程师</option>
                        <option value="技术总监" selected>技术总监</option>
                        <option value="CEO" >CEO</option>
                        <option value="学生" >学生</option>
                        <option value="其它" >其它</option>
                   </select>
                </div>
                <div class="wlfg-wrap">
                    <label class="label-name" for="province-select">城市</label>
                    <span id="city_area">
                        <select class="prov"></select> 
                        <select class="city" disabled="disabled"></select>
                        <select class="dist" disabled="disabled"></select>
                    </span>
                </div>
                <div class="wlfg-wrap">
                    <label class="label">性别</label>
                    <label>
                        <input type="radio" name="sex" value="0" hidefocus="true" autocomplete="off" />保密
                    </label>
                    <label>
                        <input type="radio" name="sex" value="1" hidefocus="true" autocomplete="off" checked/>男
                    </label>
                    <label>
                        <input type="radio" name="sex" value="2" hidefocus="true" autocomplete="off" />女
                    </label>

                </div>
                <div class="wlfg-wrap">
                    <label class="label-name label_signature" for="aboutme">个性签名</label>
                    <textarea  class="textarea textarea_signature" rows="5" cols="30" id='signature'>继续来吧.</textarea>

                </div>
                <div class="wlfg-wrap">
                    <label class="label-name"></label>
                    <button class="btn" type="button" id='btn_submit'>保存</button>
                </div>
            </div>
        </div>
        <div class="pager">
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
	<script type="text/javascript" src="/taoyuan/public/js/other/jquery.cityselect.js"></script>
	<script type="text/javascript">
	    $(function() {
	        $("#city_area").citySelect({
	            prov: "北京",
	            city: "东城区",
	            dist: "null",
	            nodata: "none",
	            url: "Public/js/other/city.min.js"
	        });
	        $("#btn_submit").click(function() {
	            var nickname = $("#nickname").val();
	            var job = $("#job").val();
	            var sex = $("input[name=sex]:checked").val();
	            var signature = $("#signature").val();
	            var area = '';
	            $("#city_area").children("select").each(function() {
	                area += $(this).val() + ",";
	            })
	            checkBefore('#btn_submit');
	            $.post(getUrl("Ajax/updateInfo"), {nickname: nickname, job: job, area: area, sex: sex, signature: signature}, function(data) {
	                $("#signed_textarea").val(signature);
	                $(".job-title").html(job);
	                $(".myname").html(nickname);
	                checkAfter('#btn_submit');
	                showSuccessTip('资料修改成功！');
	            }, "json")
	        })
	    })
	</script>
</body>
</html>