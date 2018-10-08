<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>visitorCount</title></head>
<body bgcolor="#ffffff">
	<h1>
	<%-- not the best access counter --%>
	<%! private int accessCount = 0; %>
	</h1>
	<h2>Accesses to page since server reboot:
	<%= ++accessCount %></h2>
</body>
</html>