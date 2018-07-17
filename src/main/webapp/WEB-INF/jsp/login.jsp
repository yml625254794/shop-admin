<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录</title>
</head>
<body>
	<h1>管理员登录</h1>
	<c:if test="${loginerror}">
		<h3 style="color:red;">用户名或者密码错误</h3>
	</c:if>
	<!-- 当退出来的时候显示该消息 -->
	<c:if test="${param.logout !=null}">
		<h2>该用户已退出,请重新登录</h2>
	</c:if>
	
	<form action="" method="post">
		<!-- 防范CSRF攻击 -->
		<sec:csrfInput/>
		
		<div>
			<label for="username">用户名</label>
			<input type="text" name="username" id="username" />
		</div>
		<div>
			<label for="password">密码</label>
			<input type="text" name="password" id="password" />
		</div>
		<div>
			<button type="submit">登录</button>
		</div>
	</form>
	
</body>
</html>