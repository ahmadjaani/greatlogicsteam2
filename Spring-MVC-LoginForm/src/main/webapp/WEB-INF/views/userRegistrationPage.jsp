<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 ${errorMessage} 

<form:form method="post" modelAttribute="userRegistrationForm"
	action="/Spring-MVC-LoginForm/signUp" enctype="multipart/form-data">
	<table>
		<tr>
			<td><form:label path="firstName">
					<spring:theme code="userregistraionpage.label.firstname"
						text="First name" />
				</form:label></td>
			<td><form:input path="firstName" />
				<form:errors path="firstName" /></td>
		</tr>
		<tr>
			<td><form:label path="lastName">Last Name:</form:label></td>
			<td><form:input path="lastName" />
				<form:errors path="lastName" /></td>
		</tr>
		<tr>
			<td><form:label path="mobileNumber">Mobile Number</form:label></td>
			<td><form:input path="mobileNumber" />
				<form:errors path="mobileNumber" /></td>
		</tr>
		<tr>
			<td><form:label path="contactEmail">Contact Email</form:label></td>
			<td><form:input path="contactEmail" />
				<form:errors path="contactEmail" /></td>
		</tr>
		<tr>
			<td><form:label path="password">password</form:label></td>
			<td><form:password path="password" />
				<form:errors path="password" /></td>
		</tr>
		<tr>
			<td><form:label path="confirmPassword">Confirm password</form:label></td>
			<td><form:password path="confirmPassword" />
				<form:errors path="confirmPassword" /></td>
		</tr>
		<tr>
		<tr>
			<td><form:label for="image" path="image">File</form:label></td>
			<td><input name="image" type="file" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>