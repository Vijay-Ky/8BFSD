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
Country:
<form:select path="country">
<%-- <form:option value="India" label="India"/>
<form:option value="US" label="US"/>
<form:option value="UK" label="UK"/>
<form:option value="Singapore" label="Singapore"/> --%>
<form:options items="${student.countryOptions}"/>
</form:select>
<br/>
<br/>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
Javascript <form:radiobutton path="favoriteLanguage" value="Javascript"/>
<br/>
<br/>
Operating Systems:

Windows <form:checkbox path="operatingSystems" value="Windows"/>
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac <form:checkbox path="operatingSystems" value="Mac"/>
Solaris <form:checkbox path="operatingSystems" value="Solaris"/>



<input type="submit" value="click here to submit"/>
</form:form>
<br/>
<br/>
</body>
</html>