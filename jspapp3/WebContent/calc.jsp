<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<%!int n1, n2, sum, sub, mul, div;%>

	<%
		n1 = Integer.parseInt(request.getParameter("n1"));
		n2 = Integer.parseInt(request.getParameter("n2"));

		String choice = request.getParameter("cal");

		if (choice.equals("add")) {
			sum = n1 + n2;
			out.println("<h2>Sum : " + sum + "</h2>");
		} else if (choice.equals("sub")) {
			sub = n1 - n2;
			out.println("<h2>Sub : " + sub + "</h2>");
		} else if (choice.equals("mul")) {
			mul = n1 * n2;
			out.println("<h2>Mul : " + mul + "</h2>");
		} else {
			div = n1 / n2;
			out.println("<h2>Div : " + div + "</h2>");
		}
	%>
</body>
</html>