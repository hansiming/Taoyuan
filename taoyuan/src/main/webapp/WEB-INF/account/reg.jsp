<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <title>淘缘二手交易市场</title>
        <meta name="keywords" content="会员注册" /> 
        <meta name="description" content="淘缘二手交易市场" /> 
        <link rel="shortcut icon" href="/taoyuan/public/images/favicon.ico" type="image/x-icon" /> 
        <link rel="stylesheet" href="/taoyuan/public/css/style.css" type="text/css" /> 
		<link rel="stylesheet" href="/taoyuan/public/login/base.css" />
    </head> 
    <body> 
        <jsp:include page="/WEB-INF/public/header.jsp" />

	<div class="wrap">
    <div class="pop-title clearfix">
        <a class="a_underline" href="http://www.sucaihuo.com/login.html">登录</a>    
        <div class="pop_name">
            注册<span class="grey"></span>
        </div>

    </div>
    <form onsubmit="return false">
        <div class="pop-content accountPage">
            <div class="form_item">
                <div class="item_tip">用户名</div>
                <input type="text" tabindex="1" value="" name="username" data-type="username" data-minlength="5" class="form_input" id="username" onfocus="focusInputLoginArea($(this))" onblur="blurInputLoginArea($(this))" autocomplete="off"/>
                <span class="error">不能为空</span>
                <i class="icon-loginright"></i>
                <span class="grey">允许用中英文、数字、下划线，提交后不可修改</span>
            </div>
            <div class="form_item">
                <div class="item_tip">邮箱</div>

                <input type="text" tabindex="2" value="" data-type="email" name="email" class="form_input" id="email" onfocus="focusInputLoginArea($(this))" onblur="blurInputLoginArea($(this))" autocomplete="off"/>
                <span class="error">不能为空</span>	
                <i class="icon-loginright"></i>
            </div>		
            <div class="form_item">
                <div class="item_tip">密码</div>
                <input type="password" tabindex="3" name="pwd" id="pwd" data-minlength="6" data-maxlength="20" class="form_input"   onfocus="focusInputLoginArea($(this))" onblur="blurInputLoginArea($(this))" autocomplete="off"/>
                <span class="error">不能为空</span>
                <span class="grey">6 - 20位</span>
                <i class="icon-loginright"></i>
            </div>			
            <div class="form_item">
                <div class="item_tip">确认密码</div>
                <input type="password" tabindex="4" name="pwd2" data-equal="#pwd" data-equal-error="两次输入的密码不一致" class="form_input" id="pwd2"  onfocus="focusInputLoginArea($(this))" onblur="blurInputLoginArea($(this))" autocomplete="off"/>
                <span class="error">不能为空</span>
                <i class="icon-loginright"></i>
            </div>
            <div class="form_item" style="margin:30px  0 0">
                <input type="submit" tabindex="7" value="注&nbsp;&nbsp;册" class="btn_reg btn" id="btn_reg" onclick="subReg()"/>
            </div>

        </div>
    </form>
</div>

<!-- footer begin -->

<jsp:include page="/WEB-INF/public/footer.jsp" />

<!-- footer end -->

<script src="/taoyuan/public/js/jquery.js" type="text/javascript">
</script><script src="/taoyuan/public/js/common.js" type="text/javascript"></script>

<div class="mmsg-box mmsg-box-info" id='msg-box' style="margin-top: -23.5px; margin-left: -96.5px;">
    <div class="mmsg-content">
        <i class="mmsg-icon"></i>
        <p id='msg-box-content'></p>
    </div>
    <div class="mmsg-background"></div>
</div>

<script type="text/javascript">
    function subReg() {
        blurInputLoginArea($("#username"), 1);
        blurInputLoginArea($("#email"), 1);
        blurInputLoginArea($("#pwd"));
        blurInputLoginArea($("#pwd2"));
        var i = 0;
        $(".error").each(function() {
            if ($(this).css("display") == 'inline') {
                i++;
            }
        })

        if (i == 0) {
            var obj = $("#btn_reg");
            obj.addClass('disabled').val('注册中...');
            $.ajax({
    			
    			type:'post',
    			url: 'register/toadd',
    			timeout: 3000,
    			data: {userName : $("#username").val(), email : $("#email").val(), pwd : $("#pwd").val()},
    			dataType:'json',
    			success:function(data){
    				if(data.status == 1){
    					
    					window.location.href='showMessage';
    				}
    			}
    		});
        }
    }
</script>
</body>
</html>