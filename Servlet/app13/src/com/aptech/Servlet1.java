package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		
		out.println("First Name: " + s1);
		out.println("<br/> Last Name: " + s2);
		
		String fullName = s1 + " " + s2;
		
		//stored fullName in the request object
		request.setAttribute("results", fullName);
		
		System.out.println("Servlet1 begin(SOP)");
		out.println("<br/>Servlet1 begin");
		
		//dispatching a current servlet to any other servlet
		//we are trying to dispatch current request to Servlet2
		//this is relative approach
		//RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		
		//this is another approach
		//this is absolute approach
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Servlet2");
		//rd.forward(request, response);
		
		rd.include(request, response);
		
		//another approach
		//servlet1 is storing redirection message in the response object
		 //and sendingback to browser
		//browser receives a response that contains redirection message
		//because of that automatically without user intervention it is
		 //making a new reqest to servlet2
		// so it doesnt have first name, last name and full name
		//in case of sendRedirect dispatching is happening in the browser itself.
		//so it is the client side technic
		response.sendRedirect("Servlet2");
		System.out.println("Servlet1 end(SOP)");
		out.println("<br/>Servlet1 end");
	}
}
