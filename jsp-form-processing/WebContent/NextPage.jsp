<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="user.UserData" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Data</title>
</head>
<body>
	You entered
	<BR> Name:
	<%=user.getUsername()%><BR> Email:
	<%=user.getEmail()%><BR> Age:
	<%=user.getAge()%><BR>
</body>
</html>