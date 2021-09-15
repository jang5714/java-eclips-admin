<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring MVC 시작이다 !</h1>
<ol>
	<li><a href="${ctx}/move/book/Detail">Book Detail</a></li>
	<li><a href="${ctx}/move/book/List">Book List</a></li>
	<li><a href="${ctx}/move/book/Register">Book Register</a></li>
	<li><a href="${ctx}/move/book/Update">Book Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/order/Detail">Order Detail</a></li>
	<li><a href="${ctx}/move/order/List">Order List</a></li>
	<li><a href="${ctx}/move/order/Register">Order Register</a></li>
	<li><a href="${ctx}/move/order/Update">Order Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/photo/Detail">Photo Detail</a></li>
	<li><a href="${ctx}/move/photo/List">Photo List</a></li>
	<li><a href="${ctx}/move/photo/Register">Photo Register</a></li>
	<li><a href="${ctx}/move/photo/Update">Photo Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/publisher/Detail">Publisher Detail</a></li>
	<li><a href="${ctx}/move/publisher/List">Publisher List</a></li>
	<li><a href="${ctx}/move/publisher/Register">Publisher Register</a></li>
	<li><a href="${ctx}/move/publisher/Update">Publisher Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/user/Detail">User Detail</a></li>
	<li><a href="${ctx}/move/user/List">User List</a></li>
	<li><a href="${ctx}/move/user/Register">User Register</a></li>
	<li><a href="${ctx}/move/user/Update">User Update</a></li>
</ol>
</body>
</html>