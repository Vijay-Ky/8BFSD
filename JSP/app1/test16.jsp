<%@ page import="com.lara.*" %>

<%
	Person p1 = new Person();
	p1.setFirstName("vijay");
	int sum = Calculator.add(9, 2);
%>
First Name: <%= p1.getFirstName() %> </br>
sum: <%= sum %> </br>



