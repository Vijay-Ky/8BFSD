Hello to all</br>
<%@ page import="java.util.*" %>
Hello to all again</br>
<%= "from expression" %>
<%!
	void test(){}
	int i;
%>
<%
	i++;
	i+= 20;
%>
<%@ page import="java.io.*" %>
Hello</br>
<%= i %> </br>
<%
	i += 30;
	j += 20;
%>
<%= "i value:" + i %> </br>
<%= "j value:" + j %> </br>
<%! int j = 30; %>
