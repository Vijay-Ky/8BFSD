<%@ page isELIgnored="true" %>

<%
	request.setAttribute("msg", "hello to all from request");
%>

${msg}