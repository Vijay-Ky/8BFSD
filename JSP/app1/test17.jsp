<%@ page import="com.lara.*" %>
<%@ page import="java.util.*" %>
<%
	List list = Manager.getPersons();
	Person p1 = null;
	for(int i = 0; i < list.size(); i++)
	{
		p1 = (Person) list.get(i);
%>
		<%= (i + 1) %>. <%= p1.getFirstName() %> </br>
<%
	}
%>


