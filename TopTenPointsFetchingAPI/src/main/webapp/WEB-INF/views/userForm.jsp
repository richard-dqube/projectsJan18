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
					
			<tr>
				<td>project-id:</td>
				<td><form:input path="project_Id"/></td>
			</tr>
			<tr>
				<td>project_name:</td>
				<td><form:input path="project_name"/></td>
			</tr>
			<tr>
				<td>Task_Id:</td>
				<td><form:input path="task_Id"/></td>
			</tr>
			<tr>
				<td>User_Id:</td>
				<td><form:input path="user_Id"/></td>
			</tr>
			<tr>
				<td>User_Name:</td>
				<td><form:input path="user_name"/></td>
			</tr>
			<tr>
				<td>User_Id:</td>
				<td><form:input path="user_Id"/></td>
			</tr>
			<tr>
				<td>Points:</td>
				<td><form:input path="points"/></td>
			</tr>
			<tr>
				<td>Project_Task:</td>
				<td><form:input path="project_task"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</div>
</body>
</html>