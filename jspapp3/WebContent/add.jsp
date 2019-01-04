<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition of Numbers</title>
</head>
<body>
	<h2>Addition of 2 Numbers</h2>
	<%
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int sum = n1 + n2;
	%>
	<h3>
		Sum of
		<%=n1%>
		and
		<%=n2%>
		is
		<%=sum%></h3>
</body>
</html>