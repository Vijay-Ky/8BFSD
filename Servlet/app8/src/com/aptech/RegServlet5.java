package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet5
 */
public class RegServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		

		//getParameterNames method reading every name into enumeration
		Enumeration<String> names = request.getParameterNames();
		
		//iterate that enumeration to get one by one
		/*
		String name, value;
		while(names.hasMoreElements())
		{
			name = names.nextElement();
			value = request.getParameter(name);
			out.println(name + ":" + value + "<br/>");	
		}*/
		
		
		 String name, values[];
		 while(names.hasMoreElements())
		{
			name = names.nextElement();
			values = request.getParameterValues(name);
			out.println(name + ":" + Arrays.toString(values) + "<br/>");	
		}
		 
	}
}
