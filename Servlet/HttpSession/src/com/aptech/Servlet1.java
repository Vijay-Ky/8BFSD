package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try
        {
        	response.setContentType("text/html");
        	PrintWriter pwriter = response.getWriter();

        	String name = request.getParameter("userName");
        	String password = request.getParameter("userPassword");
        	pwriter.print("Hello "+ name);
        	pwriter.print("Your Password is: "+ password);
        	
        	HttpSession session = request.getSession();
        	session.setAttribute("uname", name);
        	session.setAttribute("upass", password);
        	pwriter.print("<a href='Servlet2'>view details</a>");
        	pwriter.close();
        }	
        catch(Exception exp)
        {
        	System.out.println(exp);
        }
     }
}
