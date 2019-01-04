<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save User</title>
</head>
<body>
	<h3>Your data is being processed!</h3>
	<%
		String userName = request.getParameter("nm");
		session.setAttribute("name1", userName);
	 %>
	 <h3>Welcome Mr. <%=userName%></h3>
	 <a href="next.jsp">Learn More</a>
</body>
</html>