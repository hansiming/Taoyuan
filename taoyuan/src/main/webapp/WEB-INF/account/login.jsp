<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <title>淘缘二手交易市场</title>
        <meta name="keywords" content="会员登录" /> 
        <meta name="description" content="淘缘二手交易市场" /> 
        <link rel="shortcut icon" href="/taoyuan/public/images/favicon.ico" type="image/x-icon" /> 
        <link rel="stylesheet" href="/taoyuan/public/css/style.css" type="text/css" /> 
		<link rel="stylesheet" href="/taoyuan/public/login/base.css" />
    </head> 
    <body> 
        <jsp:include page="/WEB-INF/public/header.jsp" />

	<div class="wrap">
	    <div class="pop-title clearfix">
	        <a class="a_underline" href="/taoyuan/register">注册</a>   
	        <div class="pop_name">
	            登录<span class="grey"></span>
	        </div>
	
	    </div>
	    <form onsubmit="return false">
	        <div class="pop-content accountPage">
	            <div class="form_item">
	                <div class="item_tip">用户名/邮箱</div>
	                <input type="text" tabindex="1" value="" name="username"  class="form_input" id="username" onblur="blurInputLoginBox($(this))"  onfocus ="focusInputLoginBox($(this))" autocomplete="off"/>
	                <span class="error">不能为空</span>
	                <i class="icon-loginright"></i>
	                <span class="grey">允许用中英文、数字、下划线，提交后不可修改</span>
	            </div>	
	            <div class="form_item">
	                <div class="item_tip">密码</div>
	                <input type="password" tabindex="3" name="pwd" class="form_input" id="pwd" onblur="blurInputLoginBox($(this))"  onfocus ="focusInputLoginBox($(this))" autocomplete="off"/>
	                <span class="error">不能为空</span>
	                <span class="grey">6 - 20位</span>
	                <i class="icon-loginright"></i>
	            </div>
	            <div class="twoWeeks">
	                <input type="checkbox" class="ckeckBox" name="rememberme" id="rememberme"/>
	                <label for="rememberme">记住我</label>
	            </div>
	            <p class="notice_error" id="notice_error"></p>
	            <input type="submit" tabindex="7" value="登&nbsp;&nbsp;录" class="btn_reg btn" id="btn_reg" onclick="subLogin($(this))"/>
	        </div>
	    </form>
	</div>

<!-- footer begin -->

<jsp:include page="/WEB-INF/public/footer.jsp" />

<!-- footer end -->

<script src="/taoyuan/public/js/jquery.js" type="text/javascript"></script>
<script src="/taoyuan/public/js/common.js" type="text/javascript"></script>

<div class="mmsg-box mmsg-box-info" id='msg-box' style="margin-top: -23.5px; margin-left: -96.5px;">
    <div class="mmsg-content">
        <i class="mmsg-icon"></i>
        <p id='msg-box-content'></p>
    </div>
    <div class="mmsg-background"></div>
</div>
<script  type="text/javascript">

function subLogin(obj) {
    var username = $.trim($('#username').val());
    var pwd = $.trim($('#pwd').val());
    if (username == '') {
        showLoginError("请输入用户名或邮箱");
        return false;
    }
    if (pwd == '') {
        showLoginError("请输入密码");
        return false;
    }

    obj.addClass('disabled').val('登录中...');
    
    $.ajax({
		
		type:'post',
		url: '/taoyuan/login/tologin',
		timeout: 3000,
		data: {userName : username, pwd : pwd},
		dataType:'json',
		success:function(data){
			if(data.status == 1){
				
	            showSuccessTip(data.message);
				window.location.href='/taoyuan/showMessage';
			}else{
				
				showLoginError(data.message);
			}
            obj.removeClass('disabled').val('登录');
		}
	});

}
function showLoginError(tip) {
    $("#notice_error").text(tip);
    $("#notice_error").fadeOut(2500);
}
</script>
</body>
</html>