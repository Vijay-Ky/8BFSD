package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//read the form data
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		
		out.println("First Name: " + s1 + "<br/>");
		out.println("Last Name: " + s2 + "<br/>");
		
		out.println("<form action='Servlet4'>");
		
		out.println("Age: <input type='text' name='age'/><br/>");
		//hidden will not be displayed in the browser body
		out.println("<input type='hidden' name='firstName' value='" + s1 + "'/>");
		out.println("<input type='hidden' name='lastName' value='" + s2 + "'/>");
		out.println("Email: <input type='text' name='email'/><br/>");
		out.println("<input type='submit' value='submit'/>");
		out.println("</form>");	
	}

}
