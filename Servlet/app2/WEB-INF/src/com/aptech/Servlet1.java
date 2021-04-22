package com.aptech;
import javax.servlet.*;//from servelts-api.jar file
import javax.servlet.http.*;//from servelts-api.jar file
import java.io.*;//from jdk

//every servlet should be a public class and
  //should be subclass to HttpServlet
  //from HttpServlet several methods are inheriting to HelloServlet
public class Servlet1 extends HttpServlet 
{
	//we need to override service method
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		//we need PrintWriter to write something to the browser
		PrintWriter out = response.getWriter();
		//in order to read any input use request object get parameter method
		String  s1 = request.getParameter("firstName");
		String  s2 = request.getParameter("lastName");
		out.println("First Name:" + s1);
		out.println("Last Name:" + s2);
	}
}
/*
- after succesfully compiling this program we need to register this servlet inside the 
web.xml file

- for any changes in the WEB-INF folder you need to restart the server.
*/