<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration success</title>
</head>
<body>
	<font color="green"><h1>Your registration is success full</h1></font>
	 Thanks for registering with us!
	<font color="green"><h1>Welcome ${user.firstName}!</h1></font>
	<a href="/Spring-MVC-LoginForm/myAccount/${user.contactEmail }">My account</a>
</body>
</html>