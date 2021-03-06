<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/css/loginPage.css"/>'
	rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.error!=null}"><p class="error-text">Invalid login or password.</p></c:if>
	<form name="form-login" action="<c:url value="/login"/>" method="POST">
		<p class="p-plain-text">Login: </p>
		<input type="text" name="user_login">
		<p class="p-plain-text">Password: </p>
		<input type="password" name="user_password">
		<input type="submit" value="Login">
	</form>
</body>
</html>