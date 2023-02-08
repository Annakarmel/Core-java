<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>Save details of Bakery</h1>
<form action="bakery" method="post">
<pre>
Name <input type="text" name="name">
Owner Name <input type="text" name="ownerName">
Owner Wife Name <input type="text" name="ownerWifeName">
Owner Married: Yes <input type="radio" value="yes" name="married"> No <input type="radio" value="no" name="married">
Famous for <textarea name="famousFor"></textarea>
Since <input type = "text" name="since">
<input type="submit" value="save">
</pre>
</form>
</body>
</html>