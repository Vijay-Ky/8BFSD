package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet6
 */
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = getInitParameter("p1");
		String s2 = getInitParameter("country");
		String s3 = getInitParameter("abc");
		PrintWriter out = response.getWriter();
		out.println("from servlet5:" + s1 + "<br/>");
		out.println("from servlet5:" + s2 + "<br/>");
		out.println("from servlet5:" + s3);
		
		
	}

}
