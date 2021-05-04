package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    public void doGet(HttpServletRequest request, HttpServletResponse response){
    	  try
    	  {
    	      response.setContentType("text/html");
    	      PrintWriter pwriter = response.getWriter();
    	      
    	      HttpSession session = request.getSession(false);
    	      String myName = (String)session.getAttribute("uname");
    	      String myPass = (String)session.getAttribute("upass");
    	      pwriter.print("Name: "+ myName +" Pass: "+ myPass);
    	      pwriter.close();
    	  }
    	  catch(Exception exp)
    	  {
    	      System.out.println(exp);
    	  }
    }
}
