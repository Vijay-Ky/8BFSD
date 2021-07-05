<%@ page import="java.util.Date" %>

<%!
	int i = 10;
	int test1(int i)
	{
		return i * this.i;
	}

	long getMillis()
	{
		Date d1 = new Date();
		return d1.getTime();
	}

	int getMaxPriority()
	{
		return Thread.MAX_PRIORITY;
	}
%>

<%= test1(2) %> </br>
<%= getMillis() %> </br>
<%= getMaxPriority() %> </br>

<%
	int i = test1(100);
	int j = getMaxPriority();
	long k = getMillis();
%>

i value: <%= i %> </br>
j value: <%= j %> </br>
k value: <%= k %> </br>





