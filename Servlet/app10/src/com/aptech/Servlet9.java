package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet9
 */
public class Servlet9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//to read context-param
		ServletContext context = getServletContext();
		String s1 = context.getInitParameter("url");
		String s2 = context.getInitParameter("abc");
		
		PrintWriter out = response.getWriter();
		out.println("Context Param:" + s1);
		out.println("<br/> Context Param:" + s2);
	}

}
