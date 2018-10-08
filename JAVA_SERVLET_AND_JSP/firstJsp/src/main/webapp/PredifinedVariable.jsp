<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<HTML>
<BODY>
	<H1>Server Information</H1>
	<%
		out.println("<BR>Server:" + request.getServerName());
		out.println("<BR>Port:" + request.getServerPort());
		out.println("<BR>Port:" + request.getRemoteHost());
		out.println("<BR>Date:" + new Date().toString());
		out.println("<BR>Session ID:" + session.getId());
	%>
</BODY>
</HTML>