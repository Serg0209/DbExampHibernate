<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Cars Details</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px"> User
			Details</div>

		<c:if test="${!empty carsList}">
			<table border="1" bgcolor="black" width="400px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					
					<td>Mark</td>
					<td>Model</td>
					<td>Year</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${carsList}" var="cars">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						
						<td><c:out value="${cars.mark}" />
						</td>
						<td><c:out value="${cars.model}" />
						</td>
						<td><c:out value="${cars.year}" />
						</td>
						<td><a href="edit?id=${cars.id}">Edit</a></td>
						<td><a href="delete?id=${cars.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<a href="formCars">Click Here to add new CAR</a>
	</center>
</body>
</html>
