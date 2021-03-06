<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p></p>
	<c:url value="/registerUser" var="registerUrl"/>
	
	<form:form commandName="newUser" action="${registerUrl}" method="POST">
		<p>Your name:</p>
		<form:input path="name" placeholder="Name"/>
		<p>User name:</p>
		<form:input path="userName" placeholder="User name"/>
		<p>Password:</p>
		<form:input path="password" type="password" placeholder="Password"/>
		<p>Your role:</p>
		<form:select path="accountRole">
			<form:option value="USER" />
			<form:option value="SERVICE" />
			<form:option value="ADMIN" />
		</form:select>
		<input type="submit" value="Register"/>
	</form:form>
</body>
</html>