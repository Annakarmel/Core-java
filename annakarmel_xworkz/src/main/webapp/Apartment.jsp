<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
 
 <form action = "apartt" method = "Post">
 <pre>
 Apartment Name <input type = "text" name = "apartmentName"/>
 No Of Rooms <select name = "noOfRooms">
      <option value = "${dto.noOfRooms}">  Select </option>
      <c:forEach items = "${noOfRooms}" var = "n">
      <option value = "${n}"> ${n} </option>
      </c:forEach>
   </select>
Owner Name <input type = "text" name = "ownerName"/>
Place <select name = "places">
     <option value = "${dto.places}"> SELECT </option>
     <c:forEach items = "${places}" var = "p">
     <option value = "${p}" > ${p} </option>
     </c:forEach>
    </select>
Address <input type = "text" name = "address"/>
<input type = "submit" value = "Send"/>
</pre>
</form>
</body>
</html>