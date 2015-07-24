<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Registration Form</title>
	<link href="<c:url value="../css/bootstrap-theme.css" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap.css" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap-theme.css.map" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap.css.map" />" rel="stylesheet" type="text/css">
</head>

<body>
<center>
<div class="form-signin-heading" style="width: 400px; margin-top: 40px; text-align: center">
	<h1>USER REGISTER FORM</h1>
	<th class="input-group">
		<c:url var="userRegistration" value="saveUser.html" />
		<form:form id="registerForm" modelAttribute="employee" method="post" action="register">
			<input type="text" name="firstName" class="form-control" placeholder="firstName" aria-describedby="basic-addon1">
			<input type="text" name="lastName" class="form-control" placeholder="lastName" aria-describedby="basic-addon1">
			<input type="text" name="email" class="form-control" placeholder="Email" aria-describedby="basic-addon1">
			<input type="text" name="phone" class="form-control" placeholder="phone" aria-describedby="basic-addon1">
	<th><input type="submit" style="width: 200px; margin-top: 40px; text-align: center" value="Register" />
	</th>
		</form:form>

		<td><a type="submit" href="list">Click Here to see User List</a></td>
		<td><a type="submit" href="formCars">Click Here to add new cars</a></td>
	</div>
</div>
</center>

<script src="<c:url value="../js/jquery-2.1.4.min.js" />"></script>
<script src="<c:url value="../js/bootstrap.min.js" />"></script>
</body>
</html>
