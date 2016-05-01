<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <title>淘缘二手交易市场</title>
        <meta name="keywords" content="会员登录" /> 
        <meta name="description" content="淘缘二手交易市场" /> 
        <link rel="shortcut icon" href="/Public/images/favicon.ico" type="image/x-icon" /> 
        <link rel="stylesheet" href="/Public/css/style.css" type="text/css" /> 
                
    </head> 
    <body> 
        <jsp:include page="/WEB-INF/public/header.jsp" />
        <div id='nav' class='nav'>
            <div class='nav_main clearfix'>
                <a href='http://www.sucaihuo.com' class="menu">首 页</a>
                <a href='js.html?' class="menu">最 热</a>
                <a href='js.html?' class="menu">最 新</a>
                <a href='js.html?' class="menu"></a>
                <!--                <a href='http://www.sucaihuo.com/psd' class="menu">网站psd</a>-->
                                <a href='topic.html' class="menu">精 选</a>
                <a href='js.html?' class="menu">推 荐</a>
                <a href='tool.html?' class="menu">我的二手</a>
                <a href='help.html' class="menu">关于我</a>
                <!--                <a href='http://idc.sucaihuo.com/' class="menu" target="_blank">服务器</a>-->
                <span class='icon_hot'></span>
            </div>
        </div>
<link rel="stylesheet" href="http://www.sucaihuo.com/other/login/css/base.css" />

<div class="wrap">
    <div class="pop-title clearfix">
        <a class="a_underline" href="http://www.sucaihuo.com/reg.html">注册</a>   
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
                <a class="a_underline" href="http://www.sucaihuo.com/forget.html">忘记密码？</a>
            </div>
            <p class="notice_error" id="notice_error"></p>
            <input type="submit" tabindex="7" value="登&nbsp;&nbsp;录" class="btn_reg btn" id="btn_reg" onclick="subLogin($(this))"/>
            <div class="co_login" style="margin:30px 0 0">
                
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/qq.html"></a>
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/sina.html"></a>
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/renren.html"></a>
                <span class="red"></span>
            </div>
        </div>
    </form>
</div>



<div class="footer" id="footer" data-url="http://www.sucaihuo.com/" data-logout="http://www.sucaihuo.com/Download/logout?r=" data-id="" data-mtype=""> 
    <div class="footer_main clearfix">
        <div class="guide">
            <span class="guide_icon"></span>
            <ul class="ul_foot">
                <li><strong>购物指南</strong></li>
                <li><a href="js.html?/3-0-0-0-0-0">购物流程</a><a href="js.html?/7-0-0-0-0-0">服务协议</a></li>
                <li><a href="js.html?/4-0-0-0-0-0">购买说明</a><a href="js.html?/8-0-0-0-0-0">购买服务</a></li>

            </ul>
        </div>
        <div class="stores">
            <span class="stores_icon"></span>
            <ul class="ul_foot">
                <li><strong>支付方式</strong></li>
                <li><a href="js.html?/7-0-0-0">银联支付</a><a href="js.html?/7-0-0-0">支付宝支付</a></li>
                <li><a href="js.html?/8-0-0-0">其他</a><a href="js.html?/14-0-0-0"></a></li>
            </ul>
        </div>
        <div class="rebate">
            <span class="rebate_icon"></span>
            <ul class="ul_foot">
                <li><strong>配送方式</strong></li>
                <li><a href="js.html?/177.html">配送说明</a><a href="js.html?/44.html"></a></li>

            </ul>
        </div>
        <div class="follow">
            <span class="follow_icon"></span>
            <ul>
                <li>
                    <strong>联系我们</strong>
                </li>
                <li>qq：294098789</li>
                <li>手机：18482195202</li>
            </ul>
        </div>
        <div class="friendly">
                        <div class="foot_menu">
                <a href="help.html" target="_blank"></a>

                <span class="address">Copyright&copy;2016-2017 淘缘 All Rights Reserved.</span>
            </div>
        </div>
    </div>
</div>

<div id="windown_box" class="modal fade">
    <div class="pop_title">
        <div class="pop_name">登录</div>
        <i class="pop_close" onclick="$('#windown_box').modal('hide')"></i>
    </div>
    <div class="pop_content">
        <div class="form_item">
            <div class="item_tip">用户名/邮箱</div>
            <input id="email" name="email"  class="form_input" type="text" autocomplete="off" tabindex="1" value="" onblur="blurInputLoginBox($(this))"  onfocus ="focusInputLoginBox($(this))"/>
        </div>
        <div class="form_item">
            <div class="item_tip">密码</div>
            <input name="pwd" id="pwd"class="form_input" type="password" tabindex="2" value="" onblur="blurInputLoginBox($(this))"  onfocus ="focusInputLoginBox($(this))" />
        </div>
        <div class="captchaBox">
            <div class="two_weeks">
                <input id="rememberme" class="ckeckBox" type="checkbox" name="rememberme"/>
                <label for="rememberme">记住我</label>
                <a  href="http://www.sucaihuo.com/reg.html" target="_blank" class="loginbox_reg">免费注册</a>
            </div>
        </div>
        <p class="notice_error"></p>
        <input id="btn_login" class="btn" type="button" onclick="sublogin()" tabindex="4" value="登  录"/>
        <a class="a_underline" href="http://www.sucaihuo.com/forget.html">忘记密码？</a>
        <div class="co_login" style="margin:20px 0 0">
                
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/qq.html"></a>
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/sina.html"></a>
                <a class="a_underline" href="http://www.sucaihuo.com/Index/login/type/renren.html"></a>
                <span class="red"></span>
            </div>
    </div>
</div>
    <script src="/Public/js/jquery.js" type="text/javascript"></script><script src="/Public/js/common.js" type="text/javascript"></script>

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
    $.post(getUrl('Ajax/checkLogin'), {username: username, pwd: pwd}, function(data) {
        if (data.error != '') {
            showLoginError(data.error);
        } else {

            showSuccessTip(data.tip);
            var url = "http://www.sucaihuo.com";
            setTimeout("goUrl('" + url + "')", 1000);
        }
        obj.removeClass('disabled').val('登录');
    }, "json")

}
function showLoginError(tip) {
    $("#notice_error").text(tip).show();
    $("#notice_error").fadeOut(2500);
}
</script>
</body>
</html>