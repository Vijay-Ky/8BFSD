<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student confirmation</title>
</head>
<body>
<h2>Student Confirmation Form</h2>
Confirmed Student: ${student.firstName} ${student.lastName} 
<br/>
<br/>
Country: ${student.country}

<br/>
<br/>
Favorite Language: ${student.favoriteLanguage}

<br/>
<br/>

<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li>${temp}</li>
</c:forEach>
</ul>

</body>
</html>