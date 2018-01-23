<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Form</title>
</head>
<body>
<div align="center">

<h2>Enter Details</h2>

	<form:form action="saveUser" method="POST" modelAttribute="user">
		<table>
			<form:hidden path="id" />	
					
<%-- 			<tr>
				<td>Project Id:</td>
				<td><form:input path="project_id"/></td>
			</tr>
			<tr>
				<td>Task Id:</td>
				<td><form:input path="task_id"/></td>
			</tr> --%>
			<tr>
				<td>Points:</td>
				<td><form:input path="points"/></td>
			</tr> 
		<%-- 	<tr>
				<td>Date and Time:</td>
				<td><form:input path="date_time"/></td>
			</tr> --%>
			<tr>
				<td>User Id:</td>
				<td><form:input path="user_id"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</div>
</body>
</html>