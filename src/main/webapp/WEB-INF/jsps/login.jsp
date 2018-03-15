<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>登录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/a_style/login/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/a_style/login/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/a_style/login/css/component.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/a_style/home/css/window.css">
</head>
<body>
	<div class="container demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h3>这就是命</h3>
					<h3>影院票务管理系统</h3>
					<form action="${pageContext.request.contextPath}/login/tohome" id="addForm" name="f" method="post">
						<div class="input_outer">
							<span class="u_user"></span>
							<input name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户" id="username" value="${logname}">
						</div>
						<div class="input_outer">
							<span class="us_uer"></span>
							<input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码" id="password">
						</div>
						<div class="mb2"><center><input class="act-but submit" id="submit" type="submit" value="                            登录                            " style="color: #FFFFFF" onclick="javascript:return checkuser();"></center></div>
						<span id="desc" style="display:none;">${desc}</span>
					</form>
				</div>
			</div>
		</div>
	</div><!-- /container -->
	<div style="text-align:center;">
	</div>
	</body>
	<script src="${pageContext.request.contextPath}/a_style/home/js/window.js" ></script>
	<script src="${pageContext.request.contextPath}/a_style/login/js/TweenLite.min.js"></script>
	<script src="${pageContext.request.contextPath}/a_style/login/js/EasePack.min.js"></script>
	<script src="${pageContext.request.contextPath}/a_style/login/js/rAF.js"></script>
	<script src="${pageContext.request.contextPath}/a_style/login/js/demo-1.js"></script>
	<script type="text/javascript">
	  if(document.getElementById('desc').innerHTML!=""){
	   win.alert("错误提示",document.getElementById('desc').innerHTML);
	  }
		 
	  function checkuser(){
	    var name = document.getElementById("username").value;
	    var password = document.getElementById("password").value;
	    var regex = /^[a-zA-Z0-9_-]{3,20}$/;
	    var regex1 = /^[a-zA-Z0-9_-]{3,20}$/;
	
	    if(!name.match(regex)){
	        alert("用户名长度不正确或格式不正确!");
		document.f.logname.value="";
		document.f.logpass.value="";
		document.f.logname.focus();
	        return false;
	    }
	   
	    if(!password.match(regex1)){
	        alert("密码长度不正确或格式不正确!");
		document.f.logpass.value="";
		document.f.logpass.focus();
	        return false;
	    }
	} 
	</script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/a_style/index/js/jquery.js"></script>
	<script type="text/javascript">
	/*	$(function(){
			$("#submit").click(
				function() {
					var data = $("#addForm").serialize();   
					$.ajax({
						url:"${pageContext.request.contextPath}/login/home",
						type:"post",
						data:data,
						dataType:"JSON",
						success: function(data){
							alert('success');
						}
					});
				}
			)
		});*/
	</script>
</html>