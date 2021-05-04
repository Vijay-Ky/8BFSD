package com.aptech;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Hello World from myapp");
	}
}