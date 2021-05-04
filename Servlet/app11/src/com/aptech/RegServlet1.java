package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet1
 */
public class RegServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String skill = request.getParameter("skill");
		String education = request.getParameter("education");
		
		
		out.println("First Name:" + firstName + "<br/>");
		out.println("Last Name:" + lastName + "<br/>");
		out.println("Age:" + age + "<br/>");
		out.println("Address:" + address + "<br/>");
		out.println("Gender:" + gender + "<br/>");
		out.println("Skill:" + skill + "<br/>");
		out.println("Education:" + education + "<br/>");
		
	}
}
