<%@ page language = "java"  contentType = "text/html"; charset =ISO-8859-1"
pageEncoding ="ISO-8859-1"%>
<%@ isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset ="ISO-8859-1">
<title>File is Uploaded</title>
</head>
<body>
<h1>${msg}</h1>
<img alt ="profile image" src="<c:url value="/resource/image/${filename}"/>"/>
</body>
</html>


