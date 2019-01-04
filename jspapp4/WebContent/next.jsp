<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Data</title>
</head>
<body>
	<%
		String user = (String)session.getAttribute("name1");
				
	 %>
	 <h2>Welcome Again <%=user %></h2>
</body>
</html>