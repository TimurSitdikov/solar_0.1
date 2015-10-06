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
	<form:form method="POST" commandName="user" action="doLogin"
		class="box login">
		<fieldset class="boxFields">
			<form:label path="login">Login: </form:label>
			<form:input path="login" />

			<form:label path="password">Password: </form:label>
			<form:input path="password" autocomplete="false"/>

		</fieldset>

		<footer> <label><input type="checkbox" tabindex="3" name="keepLoggedIn"/>Keep
			me logged in</label> <input type="submit" class="loginBtn" value=Login
			tabindex="4" />
		</footer>

	</form:form>
</body>
</html>