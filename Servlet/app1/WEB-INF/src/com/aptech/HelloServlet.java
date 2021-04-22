package com.aptech;
import javax.servlet.*;//from servelts-api.jar file
import javax.servlet.http.*;//from servelts-api.jar file
import java.io.*;//from jdk

//every servlet should be a public class and
  //should be subclass to HttpServlet
  //from HttpServlet several methods are inheriting to HelloServlet
public class HelloServlet extends HttpServlet 
{
	//we need to override service method
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		//we need PrintWriter to write something to the browser
		PrintWriter out = response.getWriter();
		out.println("Hello from HelloServlet!");
	}
}
/* 
- in case of core java programs default executable method in a main which is static
-in case of web apps default executable method is non-static service method
-in every servlet service is the overrided method its available in the HttpServlet
- public void service(HttpServletRequest request, HttpServletResponse response)
  request is for for input purpose, response is output purpose
- in order to print any output back to the browser, need to use printwriter not the system.out
-
*/