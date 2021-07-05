<%!
	int i = 20;
	int j = 30;
%>

<%
	int j = 40;
	i += 50;
	j += 100;
%>

i value:<%= i %> </br>
local j value:<%= j %> </br>
global j value:<%= this.j %> </br>



	