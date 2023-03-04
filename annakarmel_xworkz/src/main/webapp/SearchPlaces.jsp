<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous">
	
</script>
</head>
<body>
	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-line-block align-text-top">
			</a> <a href="index.jsp"> HomePage </a>

		</div>
	</nav>

	<h1>Apartment Search</h1>
	<h3>
		<span style="color: red;"> ${message}</span>
	</h3>

	<form action="searchplaces" method="get">

		Search By Places <input type="search" name="places" /> <input
			type="submit" value="Search" />
	</form>
	
	<style>
	table, th, td{
	border: 1px solid;
	}
	</style>
	<div>

		<table>
			<tr>
				<th>ID</th>
				<th>Apartment name</th>
				<th>Owner name</th>
				<th>No of rooms</th>
				<th>Address</th>
				<th>Places</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${list}" var="a">
				<tr>
					<td>${a.id}</td>
					<td>${a.apartmentName}</td>
					<td>${a.ownerName}</td>
					<td>${a.noOfRooms}</td>
					<td>${a.address}</td>
					<td>${a.places}</td>
					<td><a href="update?id=${a.id}">Edit</a></td>
					<td><a href="delete?id=${a.id}" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>