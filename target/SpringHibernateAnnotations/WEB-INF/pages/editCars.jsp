<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Edit Cars Details</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Being Java Guys |
			Edit Cars Details</div>

		<c:url var="carsRegistration" value="saveCars.html" />
		<form:form id="registerFormCars" modelAttribute="cars" method="post"
			action="update">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="mark">Mark</form:label></td>
					<td><form:input path="mark" value="${carsObject.mark}" /></td>
				</tr>
				<tr>
					<td><form:label path="model">Model</form:label></td>
					<td><form:input path="model" value="${carsObject.model}"/></td>
				</tr>
				<tr>
					<td><form:label path="year">Year</form:label></td>
					<td><form:input path="year" value="${carsObject.year}"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="UpdateCars" />
					</td>
				</tr>
			</table>
		</form:form>

	</center>
</body>
</html>
