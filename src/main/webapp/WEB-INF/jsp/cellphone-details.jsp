<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>手机详情</title>
</head>
<body>
	<div>
		<h1>手机详情</h1>
		<div>序列号:${cellphone.id}</div>
		<div>品牌:${cellphone.brand}</div>
		<div>型号:${cellphone.model}</div>
		<div>cpu品牌:${cellphone.cpubrand}</div>
		<div>内存:${cellphone.ram}</div>
		<div>存储容量:${cellphone.storage}</div>
		<div>颜色:${cellphone.color}</div>
		<div>描述:${cellphone.description}</div>
		<div>价格:${cellphone.price}</div>
		<div>操作系统:${cellphone.os.name}</div>
	</div>
</body>
</html>