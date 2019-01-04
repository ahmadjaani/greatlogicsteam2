<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form-Processing</title>
</head>
<body>
	<FORM METHOD=POST ACTION="SaveName.jsp">
		What's your name? <INPUT TYPE=TEXT NAME="username" SIZE=20><BR>
		What's your e-mail address? <INPUT TYPE=TEXT NAME="email" SIZE=20><BR>
		What's your age? <INPUT TYPE=TEXT NAME="age" SIZE=4>
		<P>
			<INPUT TYPE=SUBMIT>
	</FORM>
</body>
</html>