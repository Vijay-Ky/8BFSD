<%@ page import="java.util.Date" %>

<%
	Date d1 = new Date();
	long ms = d1.getTime();
	Date d2 = new Date(ms);
%>

Date1 : <%= d1 %>  </br>
Date2 : <%= d2 %>  </br>
MilliSeconds : <%= ms %>

