package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet5
 */
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			//in order to read any input use request object get parameter method
			String  s1 = request.getParameter("firstName");
			String  s2 = request.getParameter("lastName");
			int status = DbUtil.save(s1, s2);
			//we need PrintWriter to write something to the browser
			PrintWriter out = response.getWriter();
			if(status == 1)
			{
				out.println("saved in the db successfully");
			}
			else
			{
				out.println("some error");
			}
		}
}
