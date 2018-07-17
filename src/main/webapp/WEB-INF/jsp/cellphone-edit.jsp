<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="title" value="${cellphone.id==null ? '添加手机':'修改手机'}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${title}</title>
</head>
<body>
	<h2>${title}</h2>
	<form:form action="" method="post" commandName="cellphone">
		<div>
			<label for="brand">品牌</label>
			<form:input type="text" path="brand" id="brand" />
		</div>
		<div>
			<label for="model">型号</label>
			<form:input type="text" path="model" id="model" />
		</div>
		<div>
			<label for="cpubrand">cpu品牌</label>
			<form:input type="text" path="cpubrand" id="cpubrand" />
		</div>
		<div>
			<label for="ram">内存</label>
			<form:input type="text" path="ram" id="ram" />
		</div>
		<div>
			<label for="storage">存储容量</label>
			<form:input type="text" path="storage" id="storage" />
		</div>
		<div>
			<label for="color">颜色</label>
			<form:input type="text" path="color" id="color" />
		</div>
		<div>
			<label for="description">描述</label>
			<form:input type="text" path="description" id="description" />
		</div>
		<div>
			<label for="price">价格</label>
			<form:input type="text" path="price" id="price" />
		</div>
		<div>
			<label for="os.id">操作系统</label>
			<form:input type="text" path="os.id" id="os.id" />
		</div>
		<div>
			<button type="submit">提交</button>
		</div>
	</form:form>

</body>
</html>