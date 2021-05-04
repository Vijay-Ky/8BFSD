package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet4
 */
public class RegServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		/*String queryString = request.getQueryString();		
		out.println("Query String:" + queryString + "<br/>");*/
		
		
		
		String queryString = request.getQueryString();		
		//out.println("Query String:" + queryString + "<br/>");
		String[] params = queryString.split("&");
		for(String param : params)
		{
			out.println(param + "<br/>");
		}
		
		/*
		String queryString = request.getQueryString();		
		String[] params = queryString.split("&");
		String name, value;
		int index;
		for(String param: params)
		{
			index = param.indexOf('=');
			name = param.substring(0, index);
			value = param.substring(index + 1, param.length());
			out.println(name + ":" + value + "<br/>");
		}	*/
	}
}
