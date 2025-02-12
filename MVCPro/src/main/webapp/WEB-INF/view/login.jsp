<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login page</h1>

	<h3>Class: ${Class}</h3>
	<h3>Name: ${Name}</h3>

	<h3>Cities:</h3>
	<ul>
		<c:forEach items="${City}" var="city">
			<li>${city}</li>
		</c:forEach>
	</ul>

</body>
</html>