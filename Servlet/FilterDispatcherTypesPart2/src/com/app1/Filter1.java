package com.app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter1
 */
public class Filter1 implements Filter {

	private FilterConfig config;
	
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//reading application specific parameters
		ServletContext context = config.getServletContext();
		String s1 = context.getInitParameter("P1");
		String s2 = context.getInitParameter("URL");
				
		PrintWriter out = response.getWriter();
		
		System.out.println("Filter1-doFilter started");
		out.println("Filter1-doFilter started<br/>");
		
		//application specific constants
		out.println("from filter1: " + s1 + "<br/>");
		out.println("from filter1: " + s2 + "<br/>");

	
		chain.doFilter(request, response);
		
		System.out.println("Filter1-doFilter end");
		out.println("Filter1-doFilter end<br/>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config = fConfig;
	}

}
