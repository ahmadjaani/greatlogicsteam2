<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${myEmployees}" var="object">
   	
   	first Name: ${object.firstName}<br>
   	
   	last Name: ${object.lastName}<br>
   	
   	email: ${object.email}<br>
   	
   	mobile number: ${object.mobileNumber}<br>
   	
</c:forEach>

