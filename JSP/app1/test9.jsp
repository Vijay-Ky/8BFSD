<%@ page import="java.util.*"  %>

<%
	Date d1 = new Date();
	String s1 = Arrays.toString(new int[]{1, 6, 2, 9});
	char s2 = s1.charAt(2);
%>

<%= "Todays date:" + d1 + "<br>" %>
<%= "Array Content" + s1 + "<br>" %>
<%= "2nd indexed char" + s2 + "<br>" %>




