<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration</title>
</head>
<body>
<h2>Student Registration Form</h2>
---------------------------------------
<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName"/>
<br/>
<br/>
Last Name: <form:input path="lastName"/>
<br/>
<br/>
<input type="submit" value="click here to submit"/>
</form:form>


</body>
</html>