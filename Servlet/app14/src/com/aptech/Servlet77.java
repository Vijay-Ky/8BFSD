package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet77
 */
public class Servlet77 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet77() {
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
		
		//for every information we need to develop a different cookie
		//in one cookie we can store only one value.
		Cookie c1 = new Cookie("firstName", s1);
		Cookie c2 = new Cookie("lastName", s2);
		
		//created cookies adding to the response
		//through response object we are sending cookies to the browser.
		//cookies are not maintaining in the servlet.
		
		//default life is browser life
		//setting expiry only 60 sec
		//before storing inside the respose object
		//we can also disable cookies in browser
		c1.setMaxAge(60);
		response.addCookie(c1);
		response.addCookie(c2);
		
		
		//by default google chrome it is considering it as plain text
		//for google chrome set content is required
		response.setContentType("text/html");
		out.println("<form action='Servlet8'>");
		out.println("Age: <input type='text' name='age'/><br/>");
		out.println("Email: <input type='text' name='email'/><br/>");
		out.println("<input type='submit' value='submit'/>");
		out.println("</form>");	
	}

}
