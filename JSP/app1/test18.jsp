<%@ page import="com.lara.*" %>
<%@ page import="java.util.*" %>
<table border='1'>
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
		<th>Email</th>
	</tr>
<%
	List students = StudentDAO.readStudents();
	Map student = null;
	for(int i = 0; i < students.size(); i++)
	{
		student = (Map) students.get(i);
%>
		<tr>
		<td><%= student.get("id") %></td>
		<td><%= student.get("first_name") %> </td>
		<td><%= student.get("last_name") %> </td>		
		<td><%= student.get("age") %> </td>
		<td><%= student.get("email") %> </td>
		</tr>
<%	}	%>








	
