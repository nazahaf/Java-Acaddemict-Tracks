<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current time</title>
</head>
<body>
	<h1>Current Date</h1>
	The current time is <%= new Date().toString() %><br>
</body>
</html>