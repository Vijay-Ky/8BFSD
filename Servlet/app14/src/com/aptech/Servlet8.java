package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet8
 */
public class Servlet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//reading firstName and lastName using cookies
		Cookie[]  cookies = request.getCookies();
		if(cookies != null)
		{
			for(Cookie cookie :  cookies)
			{
				out.println("<br/> cookies: "+ cookie.getName() + ":" + cookie.getValue() + "<br/>");
			}
		}
		else
		{
			out.println("no cookies are available");
		}
		
		String s3 = request.getParameter("age");
		String s4 = request.getParameter("email");
		
		
		out.println("Age: " + s3 + "<br/>");
		out.println("Email: " + s4 + "<br/>");
	}

}
