<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<form action="em" method="get">
		<h1>Display Email:${email}</h1>
		
		<input type="submit" value="send">		
	</form>
	<form action="mob" method="get">
		<h1>Display MobileNo:${mobil}</h1>
				<input type="submit" value="send">			
	</form>
	<form action="aad" method="get">
		<h1>Display AadharCardNumber:${aadhar}</h1>
		
		<input type="submit" value="send">			
	</form>
	<form action="ag" method="get">
		<h1>Display Age:${age}</h1>
		
		<input type="submit" value="send">		
	</form>
	<form action="birth" method="get">
		<h1>Display DOB With Time:${dob}</h1>
			
		<input type="submit" value="send">	
	</form>
	<form action="sal" method="get">
		<h1>Display DesiredSalary:${salary}</h1>
		
		<input type="submit" value="send">		
	</form>
	<form action="frd">
		<h1>Display List of BestFriend name:</h1>
		<input type="submit" value="send">
		<ul>
			<c:forEach items="${frds}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</form>
	<form action="visit" method="get">
		<h1>Display List of visited places:</h1>
		<input type="submit" value="send">
		<ul>
			<c:forEach items="${visitt}" var="item">
				<li>${item}<q/li>
			</c:forEach>
		</ul>		
	</form>
	<form action="set" method="get">
		<h1>Display List of skill Sets:</h1>
		<input type="submit" value="send">	
		<ul>
			<c:forEach items="${skills}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>	
	</form>
	<form action="bdto">
	<h4>Display Beverage DTO: {beverage}</h4>
	<input type="submit" value="send"><br>
	<label>Beverage Name: ${beverage.name}</label><br>
	<label>Beverage flavour: ${beverage.flavour}</label><br>
	<label>Beverage color: ${beverage.color}</label><br>
	<label>Beverage cold: ${beverage.cold}</label><br>
	<label>Beverage buyer: ${beverage.buyer}</label><br>
	<label>Beverage price: ${beverage.price}</label><br>
	<label>Beverage madeBy: ${beverage.madeBy}</label><br>
	<label>Beverage taste: ${beverage.taste}</label><br>
	</form>
	
	<form action="cdto">
	<h4>Display Chat DTO: {chat}</h4>
	<input type="submit" value="send"><br>
	<label>Chat name: ${chat.name};</label><br>
	<label>Chat type: ${chat.type};</label><br>
	<label>Chat price: ${chat.price};</label><br>
	<label>Chat quantity: ${chat.quantity};</label><br>
	<label>Chat tasty: ${chat.tasty};</label><br>
	<label>Chat ratings: ${chat.ratings};</label><br>
	<label>Chat centreName: ${chat.centreName};</label><br>
	<label>Chat owner: ${chat.owner};</label><br>
	<label>Chat ownerPhoneNum: ${chat.ownerPhoneNum};</label><br>
	<label>Chat noOfChats: ${chat.noOfChats};</label><br>
	<label>Chat place: ${chat.place};</label><br>
	<label>Chat id: ${chat.id};</label><br>
	</form>
	
	<form action="edto">
	<h4>Display Education DTO: {education}</h4>
	<input type="submit" value="send"><br>
	<label>Education firstName: ${education.firstName}</label><br>
	<label>Education lastName: ${education.lastName}</label><br>
	<label>Education phNo: ${education.phNo}</label><br>
	<label>Education address: ${education.address}</label><br>
	<label>Education place: ${education.place}</label><br>
	<label>Education collegeName: ${education.collegeName}</label><br>
	<label>Education stream: ${education.stream}</label><br>
	<label>Education schoolName: ${education.schoolName}</label><br>
	<label>Education cgpa: ${education.cgpa}</label><br>
	<label>Education rank: ${education.rank}</label><br>
	</form>
	
	<form action="fdto">
	<h4>Display Family DTO: {family}</h4>
	<input type="submit" value="send"><br>
	<label> Family fatherName: ${family.fatherName}</label><br>
	<label> Family homeName: ${family.homeName}</label><br>
	<label> Family motherName: ${family.motherName}</label><br>
	<label> Family grandFather: ${family.grandFather}</label><br>
	<label> Family grandMother: ${family.grandMother}</label><br>
	<label> Family address: ${family.address}</label><br>
	<label> Family brotherName: ${family.brotherName}</label><br>
	<label> Family sisterName: ${family.sisterName}</label><br>
	<label> Family noOfsiblings: ${family.noOfsiblings}</label><br>
	<label> Family nativePlace: ${family.nativePlace}</label><br>
	</form>
	
	<form action="mdto">
		<h4>Display Mobile DTO :${mobile}</h4>
		<input type="submit" value="send"><br>
		<label>	Mobile mobileName:${mobile.mobileName}</label><br>
		<label>Mobile color:${mobile.color}</label><br>
		<label>Mobile rom:${mobile.rom}</label><br> 
		<label>Mobile version:${mobile.version}</label><br>
		<label>Mobile ram:${mobile.ram}</label><br>
	</form>
</body>
</html>