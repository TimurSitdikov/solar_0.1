<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
<link href='<c:url value="/resources/css/homePage.css"/>' rel="stylesheet"/>
	<title>aurora_0.1</title>
	
</head>
<body>
<h1>АвтоСервис.ru</h1>
<p>Site is in the development.</p>
<button onclick="window.location.href='<c:url value="/login"/>'">Login</button>
<div class="user info">
<p>User login is: ${user.login}</p>
<p>User password is: ${user.password}</p>
<p>Keep logged in: ${user.keepLoggedIn}</p>
</div>
</body>
</html>
