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

<a href="newUser">Click Me To Register</a>

<table border="1">
	<thead>
		<tr>
			<th>User Name</th>
			<th>Points</th>
		</tr>
	</thead>
	
	<c:forEach var="user" items="${listUser}">
		<tr>
			<td>${user.user_name}</td>
			<td>${user.points}</td>
		</tr>
	</c:forEach>
	
</table>
	
</div>
</body>
</html>