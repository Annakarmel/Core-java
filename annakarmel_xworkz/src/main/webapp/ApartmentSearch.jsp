<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">

<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>
</head>
<body>
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
 </a>
 <a href = "index.jsp"> HomePage </a>
 
 </div>
 </nav>
 
 <h1> Apartment Search </h1>
 <h3> <span style = "color:red;"> ${message}</span></h3>
 
 <form action = "find" method = "get">
  
 Search By Id <input type = "search" name = "id"/>
 <input type = "submit" value = "Search"/>
 </form>
 <div>
 <h3> Search Results : </h3>
 Apartment Name: ${dto.apartmentName} <br>
 No Of Rooms: ${dto.noOfRooms} <br>
 Owner Name: ${dto.ownerName} <br>
 Place: ${dto.places} <br>
 Address: ${dto.address} <br>
  </div>
</body>
</html>