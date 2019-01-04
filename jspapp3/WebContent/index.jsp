<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator Project</title>
<script>
	function validateForm() {
  var x = document.forms["myform"]["n1"].value;
  if (x == "") {
    alert("Number 1 must be entered!");
    return false;
  }
  var y = document.forms["myform"]["n2"].value;
  if (y == "") {
    alert("Number 2 must be entered!");
    return false;
  }
}
</script>
</head>
<body>
	<form action="calc.jsp" method="post" name="myform"
		onsubmit="return validateForm()">
		<strong>Number 1</strong><input type="text" name="n1"
			placeholder="Enter first number"><br> <br> <strong>Number
			2</strong><input type="text" name="n2" placeholder="Enter second number"><br>
		<br>
		<h3>Choose Your Options</h3>
		<input type="radio" name="cal" value="add">Addition <input
			type="radio" name="cal" value="sub">Subtraction <input
			type="radio" name="cal" value="mul">Multiplication <input
			type="radio" name="cal" value="div">Division
		<hr>
		<button type="submit">OK</button>
		<button type="reset">RESET</button>
	</form>
</body>
</html>