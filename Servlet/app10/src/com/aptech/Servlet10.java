package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet10
 */
public class Servlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet10() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		
		Enumeration<String> initNames = getInitParameterNames();
		String name, value;
		while(initNames.hasMoreElements())
		{
			name = initNames.nextElement();
			value = getInitParameter(name);
			out.println(name + ":" + value + "</br>");
			
		}
		
		Enumeration<String> contextNames = context.getInitParameterNames();
		while(contextNames.hasMoreElements())
		{
			name = contextNames.nextElement();
			value = context.getInitParameter(name);
			out.println(name + ":" + value + "</br>");
		}
	}
}
