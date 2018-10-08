<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font color="navy">
		<% for (int i=0; i<10; i++) { %>
			<b>Hello World. This is a scriptlet test <%= i%> </b><br/>
			<%
			System.out.println("This goes to the System.out stream " + i);
			}
		%>
	</font>
	<i>Date: <%= new java.util.Date().toString()%> </i><br/>
</body>
</html>