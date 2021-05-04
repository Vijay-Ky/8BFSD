package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet2
 */
public class RegServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String[] firstName = request.getParameterValues("firstName");
		String[] lastName = request.getParameterValues("lastName");
		String[] age = request.getParameterValues("age");
		String[] address = request.getParameterValues("address");
		String[] gender = request.getParameterValues("gender");
		String[] skill = request.getParameterValues("skill");
		String[] education = request.getParameterValues("education");
		
		
		out.println("First Name:" + Arrays.toString(firstName) + "<br/>");
		out.println("Last Name:" + Arrays.toString(lastName) + "<br/>");
		out.println("Age:" + Arrays.toString(age) + "<br/>");
		out.println("Address:" + Arrays.toString(address) + "<br/>");
		out.println("Gender:" + Arrays.toString(gender) + "<br/>");
		out.println("Skill:" + Arrays.toString(skill) + "<br/>");
		out.println("Education:" + Arrays.toString(education) + "<br/>");
	}

}
