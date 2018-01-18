<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Form</title>
</head>
<body>
<div align="center">

<h2>Register Employee Details</h2>

	<form:form action="saveEmployee" method="POST" modelAttribute="employee">
		<table>
			<form:hidden path="id" />	
					
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address"/></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><form:input path="telephone"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</div>
</body>
</html>