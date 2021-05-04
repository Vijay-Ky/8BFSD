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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet5() {
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
		
		String queryString = "firstName=" + s1 + "&lastName=" + s2;
		
		//if method is get then a new query string will be generated with age and email
		  //existing query will be replacing. with form data it is generating a query string.
		
		//but if method is post then with query string name and email not generating
		  //it is sending through form body only. existing query will not be replacing.
		out.println("<form action='Servlet6?" + queryString + "' method='post'>");
		out.println("Age: <input type='text' name='age'/><br/>");
		out.println("Email: <input type='text' name='email'/><br/>");
		out.println("<input type='submit' value='submit'/>");
		out.println("</form>");
	}

}
