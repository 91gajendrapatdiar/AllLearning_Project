<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"%>
	<%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home page</h1>

	<%--
	<%
	 String name = (String)request.getAttribute("name");
	 String Address = (String)request.getAttribute("Address");
	 List<String> City = (List<String>) request.getAttribute("city");
	%>
	<h3>
	Name: <%=name%></h3>
	<h3>Address : <%=Address%></h3>
	<h4> City: <%=City%></h4>
	--%>

	Name: ${name}</h3>
	    	<h3>Address : ${Address}</h3>
    	<h4> City: ${city}</h4>

	<a href="login"> login</a>
</body>
</html>