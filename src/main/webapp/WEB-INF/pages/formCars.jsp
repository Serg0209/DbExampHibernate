<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Registration Cars Form</title>
	<link href="<c:url value="../css/bootstrap-theme.css" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap.css" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap-theme.css.map" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="../css/bootstrap.css.map" />" rel="stylesheet" type="text/css">
</head>

<body>
	<center>
		<div class="form-signin-heading" style="width: 400px; margin-top: 40px; text-align: center">
		<h1>Cars REGISTER FORM</h1>
		<th class="input-group">
		<c:url var="carsRegistration" value="saveCars.html" />
		<form:form id="registerForm" modelAttribute="cars" method="post" action="registerCars">
			<input type="text" name="mark" class="form-control" placeholder="mark" aria-describedby="basic-addon1">
			<input type="text" name="model" class="form-control" placeholder="model" aria-describedby="basic-addon1">
			<input type="text" name="year" class="form-control" placeholder="year" aria-describedby="basic-addon1">
			<th><input type="submit" style="width: 200px; margin-top: 40px; text-align: center" value="RegisterCars" />
			</th>
		</form:form>
		<a type="submit" href="listCars">Click Here to see Cars List</a>
		</div>
	</center>
	<script src="<c:url value="../js/jquery-2.1.4.min.js" />"></script>
	<script src="<c:url value="../js/bootstrap.min.js" />"></script>
</body>
</html>
