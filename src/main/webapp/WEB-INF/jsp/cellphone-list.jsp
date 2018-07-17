<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>手机列表</title>
</head>
<body>
	<h1>手机列表</h1>
	<ul>
		<c:forEach items="${cellphone}" var="phone">
			<li> ${phone.id} ${phone.brand} ${phone.model}
			 <a href="${contextPath}/cellphone/${phone.id}">${phone.model}</a>
			 <a href="${contextPath}/cellphone/${phone.id}/edit">编辑</a>
			 <a href="${contextPath}/cellphone/${phone.id}/delete">删除</a>
			</li>	
		</c:forEach>
	</ul>
</body>
</html>