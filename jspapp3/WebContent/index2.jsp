<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="pink">
	<h2>Addition of Two Numbers</h2>
	<form action="add.jsp" method="post">
		<strong>Number 1 :</strong> <input type="number" name="n1"
			placeholder="Enter first number"> <br> <br> <strong>Number
			2 :</strong> <input type="number" name="n2" placeholder="Enter second number">
		<br> <br>
		<button type="submit">Add</button>
	</form>
	<h2>Subtraction of Two Numbers</h2>
	<form action="sub.jsp">
		<strong>Number 1 :</strong> <input type="number" name="n1"
			placeholder="Enter first number"> <br> <br> <strong>Number
			2 :</strong> <input type="number" name="n2" placeholder="Enter second number">
		<br> <br>
		<button type="submit">Sub</button>
	</form>
	<h2>Multiplication of Two Numbers</h2>
	<form action="mul.jsp">
		<strong>Number 1 :</strong> <input type="number" name="n1"
			placeholder="Enter first number"> <br> <br> <strong>Number
			2 :</strong> <input type="number" name="n2" placeholder="Enter second number">
		<br> <br>
		<button type="submit">Mul</button>
	</form>
	<h2>Addition of Two Numbers</h2>
	<form action="div.jsp">
		<strong>Number 1 :</strong> <input type="number" name="n1"
			placeholder="Enter first number"> <br> <br> <strong>Number
			2 :</strong> <input type="number" name="n2" placeholder="Enter second number">
		<br> <br>
		<button type="submit">Div</button>
	</form>
</body>
</html>