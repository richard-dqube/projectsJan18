<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div align="center">
<h2>Hello!</h2>
<h3> Controller is Working </h3>

<a href="newUser">Click To Enter Dummy</a>

<table border="1">
	<thead>
		<tr>
			<th>User Id</th>
			<th>Total Points</th>
		</tr>
	</thead>
	
	<c:forEach var="user" items="${listUser}">
		<tr>
			<td>${user.user_id}</td>
			<td>${user.points}</td>
		</tr>
	</c:forEach>
	
</table>
	
</div>
</body>
</html>