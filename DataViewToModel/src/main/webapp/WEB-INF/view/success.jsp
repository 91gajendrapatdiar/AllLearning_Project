<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success of the Data</title>
</head>
<body>
	<h1>Welcome : ${user.fullName}</h1>
	<h1>Email : ${user.email}</h1>
	<h1>Password : ${user.password}</h1>
	<h1> Check: ${user.check}</h1>
</body>
</html>