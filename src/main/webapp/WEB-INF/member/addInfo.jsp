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
    <link href="/taoyuan/other/js/ueditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
	
	<script src="/taoyuan/public/js/jquery.js" type="text/javascript"></script>
	<script src="/taoyuan/public/js/common.js" type="text/javascript"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/umeditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/umeditor.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/emotion/emotion.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/formula/formula.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/image/image.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/link/link.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/map/map.js"></script>
	<script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/dialogs/video/video.js"></script>
    <script type="text/javascript" charset="utf-8" src="/taoyuan/other/js/ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript" src="/taoyuan/public/js/plupload/plupload.full.min.js"></script>
</head>
<body>

	<!-- header begin -->
	<jsp:include page="/WEB-INF/public/header.jsp" />
	<!-- header end -->

	<div class="breadcrumbs">
		<span>&gt;</span>发布信息
	</div>
	
	<div class="container clearfix">
		<div class="sidebar">
			<div class="sidebar_per">
				<dl>
					<dt>
						<a href="http://www.sucaihuo.com/topic/" class="more">更多&nbsp;<span
							class="more-sign">&gt;</span></a> <strong>最新话题 <span
							class="name-en">/New</span></strong>
					</dt>
					<dd class="sidebar_articles">
						<span>12-30</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/37.html">真的很不错</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-29</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/36.html">不错得网站！</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-22</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/35.html">求助高手指点</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-22</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/34.html">这个网站程序，都是站长一个人开发的吗？</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-22</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/33.html">寻求项目合作</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-20</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/32.html">求助网站源码</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-18</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/31.html">ThinkPHP3.2.3中的文本编辑框如何实现？</a>
					</dd>
					<dd class="sidebar_articles">
						<span>12-09</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/29.html">山寨JQUERY：MingGEJS类库
							。决战JQUERY，务必占据JQUERY用户份额</a>
					</dd>
					<dd class="sidebar_articles">
						<span>10-27</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/28.html">网站PSD 示例图片都不能显示
							下载的文件也打不开</a>
					</dd>
					<dd class="sidebar_articles">
						<span>10-20</span> <a target="_blank"
							href="http://www.sucaihuo.com/topic/27.html">有没有手机版的大转盘抽奖页面</a>
					</dd>
				</dl>
			</div>
		</div>
		<div class="detail topic_add">
			<ul class="topic_add_ul">
				<li>
					<div class="clearfix">
						<div class="label_right">
							<input class="text" type="text" id="title" placeholder="请输入标题"
								data-null="请输入标题" autocomplete="off" tabindex="1" value=""
								onfocus="focusInputTopicArea($(this))"
								onblur="blurInputTopicArea($(this))" data-minlength="5" />
						</div>
						<label><span class='must'>*</span>标题：</label>
					</div>
					<div class="validate">
						<span class="Validform_checktip Validform_wrong hide"></span>
					</div>
				</li>
				<li>
					<div class="clearfix">
						<div class="label_right" id='cats'>
							<c:forEach items="${requestScope.categories }" var="list" varStatus="vs">
								<c:choose>
									<c:when test="${vs.count == 1 }">
										<em data-id='${list.id }' class='current'>${list.categoryName }<i></i></em>
									</c:when>
									<c:otherwise>
										<em data-id='${list.id }'>${list.categoryName }<i></i></em>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</div>

						<label><span class='must'>*</span>分类：</label>
					</div>
					<div class="validate">
						<span class="Validform_checktip Validform_wrong hide"></span>
					</div>
				</li>
				<li>
					<div class="clearfix">
						<div class="label_right">
							<script type="text/plain" id="myEditor" style="width:663px;height:420px;">
							</script>
						</div>
						<label><span class='must'>*</span>内容：</label>
					</div>
					<div class="validate" id="tip_content">
						<span class="Validform_checktip Validform_wrong hide"></span>
					</div>
				</li>
				<li class="clearfix" id="upload_btn_area">
					<div class="label_right">
						<a class="upload_btn" id="upload_btn">封面上传</a>
					</div> <label><span class='must'></span>附件：</label>
				</li>
				<li class="clearfix">
					<div class="label_right">
						<div id="logo_upload_area"
							style="position: relative; width: 525px;">
							<div id='upload_progress' class='hide'>
								<span class='bar' id='bar'></span> <span id='percent_num'></span>
							</div>
							<div id='upload_rs' class='hide'></div>
						</div>
					</div> <label></label>
				</li>
				<li>
					<div class="clearfix">
						<div class="label_right">
							<input class="text" type="text" id="code" tabindex="2"
								style="width: 110px" autocomplete="off" maxlength="4"
								data-null="请输入验证码" data-length="4"
								onfocus="focusInputTopicArea($(this))"
								onblur="blurInputTopicArea($(this))" /> <img
								src="getVerifyCode" id="getcode_gg"
								class="getcode_gg" title="看不清，点击换一张" align="absmiddle" /> <scan
								class="getcode_gg_a" href="javascript:void(0);">看不清，点击换一张</scan>
						</div>
						<label><span class='must'>*</span>验证码：</label>
					</div>
					<div class="validate">
						<span class="Validform_checktip Validform_wrong hide"></span>
					</div>
				</li>
				<li class="clearfix">
					<div class="label_right">
						<input class="btn" value="提 交" tabindex="3" id='btn_submit'
							style='padding: 4px 30px; font-size: 14px' autocomplete="off" />
					</div> <label></label>
				</li>
			</ul>
		</div>
	</div>
	
	
	<!-- footer begin -->
	<jsp:include page="/WEB-INF/public/footer.jsp" />
	<!-- footer end -->

	<script type="text/javascript">
    				var um = UM.getEditor('myEditor');

                            function addTag(tag) {
//        var tag = obj.val();
                                var length = $("span.tag").length;
                                if (length > 8) {
                                    alert("标签个数不能超过8个！");
                                    return false;
                                }
                                if (tag != '') {
                                    var i = 0;
                                    $(".tag").each(function() {
                                        if ($(this).text() == tag + "×") {
                                            $(this).addClass("tag-warning");
                                            setTimeout("removeWarning()", 400);
                                            i++;
                                        }
                                    })
                                    $(".tags_enter").val('');
                                    if (i > 0) { //说明有重复
                                        return false;
                                    }
                                    if (tag.length > 10) {
                                        alert("标签长度不能大于10个字符！");
                                        return false;
                                    }
                                    $("#form-field-tags").before("<span class='tag'>" + tag + "<button class='close' type='button'>×</button></span>"); //添加标签
                                }
                            }
                            function removeWarning() {
                                $(".tag-warning").removeClass("tag-warning");
                            }
                            var uploader = new plupload.Uploader({
                                runtimes: 'html5,flash,silverlight,html4',
                                browse_button: 'upload_btn', // you can pass in id...
                                logo_area_tr: document.getElementById('upload_btn_area'), // ... or DOM Element itself
                                url: '/taoyuan/toCovertitleUpload',
                                flash_swf_url: 'public/js/plupload/Moxie.swf',
                                silverlight_xap_url: 'public/js/plupload/Moxie.xap',
                                filters: {
                                    max_file_size: '2mb',
                                    mime_types: [
                                        {title: "files", extensions: "jpg,png,gif,jpeg,zip,rar"}
                                    ]
                                },
                                multi_selection: false,
                                init: {
                                    FilesAdded: function(up, files) {
                                        $("#upload_progress").show();
                                        $("#btn_submit").attr("disabled","disabled").addClass("disabled").val("正在上传...");
                                        uploader.start();
                                    },
                                    UploadProgress: function(up, file) { //上传中，显示进度条 
                                        $("#bar").css({
                                            "width": file.percent + "%"
                                        });
                                        $("#percent_num").text(file.percent + "%");
                                    },
                                    FileUploaded: function(up, file, info) {
                                    	$('#upload_btn').attr("disabled","disabled").addClass("disabled").val("上传成功");
                                        var data = JSON.parse(info.response);
                                        $("#upload_progress").hide();
                                        $("#upload_rs").html("<span id='Covertitle'>" + data.name + "</span><a class='file_remove' onclick=$('#upload_rs').hide();$('#Covertitle').remove();$('#upload_btn').removeAttr('disabled').removeClass('disabled').val('封面上传');>删除</a>").show();
                                        $('#btn_submit').removeAttr('disabled').removeClass('disabled').val('提 交');
                                    },
                                    Error: function(up, err) {
                                        
                                        if (err.code == -601) {
                                            alert("请上传jpg,png,gif,jpeg,zip或rar！");
                                            $("#btn_submit").removeAttr("disabled").removeClass("disabled").val("提 交");
                                        }
                                    }
                                }
                            });
                            uploader.init();

                            $(function() {
                                /*******标签tag******/
                                $(".tags_enter").blur(function() { //焦点失去触发
                                    addTag($(this).val());
                                    $(this).parents(".tags").css({"border-color": "#d5d5d5"})
                                }).keydown(function(event) {
                                    var key_code = event.keyCode;
                                    if (key_code == 13) { //enter
                                        addTag($(this).val());
                                    }
                                });
                                $(".close").live("click", function() {
                                    $(this).parent(".tag").remove();
                                });
                                $(".tags").click(function() {
                                    $(".tags_enter").focus();
                                    $(this).css({"border-color": "#f59942"})
                                }).blur(function() {
                                    $(this).css({"border-color": "#d5d5d5"})
                                })
                                /*******分类******/
                                $("#cats").children("em").click(function() {
                                    $(this).addClass("current").siblings("em").removeClass("current")
                                })
                                /*******更换验证码******/
                                $(".getcode_gg").click(function() {
                                    $("#getcode_gg").attr("src", 'getVerifyCode?rnd=' + Math.random());
                                });
                                /*******提交******/
                                $("#btn_submit").click(function() {
                                    blurInputTopicArea($("#title"), 1);
                                    blurInputTopicArea($("#code"), 1);

                                    var i = 0;
                                    $(".Validform_wrong").each(function() {
                                        if ($(this).css("display") == 'inline') {
                                            i++;
                                        }
                                    })

                                    if (i > 0) {
                                        return false;
                                    }
                                    var title = $("#title").val();
                                    var cat_id = $("#cats").children("em.current").attr("data-id");
                                    var tags = "";
                                    $("#tags").children(".tag").each(function() {
                                        tags += $(this).text() + ",";
                                    })
                                    var content = UM.getEditor('myEditor').getContent();
                                    var file_path = $("#Covertitle").text();
                                    var code = $("#code").val();
//                                    if (content == '') {
//                                        $("#").children("span").text(tip).show();
//                                obj.css({"border-color": "#cc0000"})
//                                    }
									    $.ajax({
		
											type:'post',
											url: 'toAddInfo',
											timeout: 3000,
											contentType: "application/x-www-form-urlencoded; charset=utf-8", 
											data: {
												title: title,
		                                        cat_id: cat_id,
		                                        content: content,
		                                        tags: tags,
		                                        file_path: file_path,
		                                        code: code
		                                        },
											dataType:'json',
											success:function(data){

												if(data.status == 1){
													
													window.location.href='showMessage';
												} else {
		                                            alert(data.message);
		                                            $("#getcode_gg").attr("src", 'getVerifyCode?rnd=' + Math.random());
		                                        }
											}
										});
                                })
                                /*******添加推荐标签******/
                                $("#js-tags").children(".list-tag").click(function() {
                                    var tag = $(this).text();
                                    addTag(tag);
                                })
                            })
                            function focusInputTopicArea(obj) {
                                obj.next(".error").hide();
                                obj.addClass("form_input-focus");
                                obj.prev("div").addClass("item_tip_focus");
                                obj.nextAll(".grey").show();
                                obj.nextAll(".icon-loginright").hide();
                            }
                            function focusInputTopicArea(obj) {
                                obj.parent().parent().next(".validate").children("span").hide();
                                obj.css({"border-color": "#cccccc"})
                            }

                            function blurInputTopicArea(obj, is_sub) {
                                var val = obj.val();
                                var minlength = obj.attr("data-minlength");
                                var maxlength = obj.attr("data-maxlength");
                                var length = obj.attr("data-length");
                                var type = obj.attr("data-type");
                                var time_error = 0;
                                if (val == "") {
                                    var tip_null = obj.attr("data-null");
                                    getTopicError(obj, tip_null);

                                } else {
                                    if (val.length != length && length > 0) {
                                        getTopicError(obj, "长度必须为" + length + "位");
                                        time_error++;
                                    }
                                    if (minlength > 0 && val.length < minlength) {
                                        getTopicError(obj, "长度至少" + minlength + "位");
                                        time_error++;
                                    }
                                    if (maxlength > 0 && val.length > maxlength) {
                                        getTopicError(obj, "长度最多" + maxlength + "位");
                                        time_error++;
                                    }

                                }
                            }
                            function getTopicError(obj, tip) {
                                obj.parent().parent().next(".validate").children("span").text(tip).show();
                                obj.css({"border-color": "#cc0000"})
                            }
</script>
</body>
</html>