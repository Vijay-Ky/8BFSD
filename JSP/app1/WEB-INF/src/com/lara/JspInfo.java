package com.lara;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class JspInfo 
{
	private PageContext pageContext;
	public  void setPageContext(PageContext 
								pageContext)
	{
		this.pageContext = pageContext;
	}
	public void printSomeInfo()
	{
		JspWriter out = pageContext.getOut();
		ServletContext context = pageContext.getServletContext();
		HttpSession session = pageContext.getSession();
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		HttpServletResponse response = (HttpServletResponse)pageContext.getResponse();
		try
		{
			out.println(context.getServerInfo() + "<br>");
			out.println(session.getId() + "<br>");
			out.println(request.getServletPath() + "<br>");
			out.println(response.getContentType() + "<br>");
			out.println(request.getParameter("param1"));
		}
		catch (IOException ex)
		{
		}
	}
}
/*
classpath=
D:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc5.jar;
D:\Tomcat8.0\lib\servlet-api.jar;
.;
D:\Tomcat8.0\lib\jsp-api.jar;
*/