package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Servlet2 begin(SOP)");
		out.println("<br/>Servlet2 begin");
		
		
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		//because of results is the attribute we are reading it by
		  //getAttribute
		//getAttribute method return type is object type then again we need
		  //to down casting to String type
		//we are not using request dispatcher in the servlet2
		String s3 = (String) request.getAttribute("results");
		
		out.println("First Name:" + s1);
		out.println("<br/> First Name: " + s1);
		out.println("<br/> Full Name: " + s2);
		
		
		System.out.println("Servlet2 end(SOP)");
		out.println("<br/>Servlet2 end");
	}

}
