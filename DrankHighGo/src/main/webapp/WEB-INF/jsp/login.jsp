<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>Login Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../../static/css/style.css" rel='stylesheet' type='text/css' />

</head>
<body>
	<div class="main">
		<div class="login">
			<div class="inset">
				<!--start-main-->
				<form action="N_login.do?op=login" method="post">
			         <div>
			         	<h2>登录系统</h2>
						<span><label>账号</label></span>
						<span><input type="text" class="textbox"  name="names" value=${loginName }></span>
					 </div>
					 <div>
						<span><label>密码</label></span>
					    <span><input type="password" class="password" name="pwds"></span>
					 </div>
					 
					<div class="sign">
                        <input type="submit" value="登录" class="submit" />
					</div>
					</form>
				</div>
			</div>
		<!--//end-main-->
	</div>
<div class="copy-right">
	<p>&copy; 2017 Ethos Login Form. All Rights Reserved</p>

</div>
<div style="text-align:center;">
</div>
</body>
</html>