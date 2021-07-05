<%!
	int test(int i)
	{
		return i * i;
	}
%>

<%= test(10) %>  </br>

<%
	int i = test(5);
	int j = i + test(2) + test(10);
%>

i value: <%= i %> </br>
j value: <%= j %> </br>
some value: <%= i + j  + test(6) + test(3)%> </br>




