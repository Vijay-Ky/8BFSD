<%
	String path = request.getServletPath();
	String type = response.getContentType();
	String id = session.getId();
	out.println("current path :" + path);
	out.println("</br>o/p type:" + type);
	out.println("<br>session id :" + id);
%>
