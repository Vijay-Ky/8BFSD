package com.aptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter1
 */
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     * for the filters also no-arg constructor is mandatory.
     * server is creating object to filter by using reflection-api. 
     * every filter is having auto-load on startup.
     */
    public Filter1() {
        System.out.println("Filter1()");
    }
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Filter-1 destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//pre
		System.out.println("Filter1-doFilter started");
		PrintWriter out = response.getWriter();
		out.println("Filter1-doFilter started<br/>");
		
		chain.doFilter(request, response);
		
		//post
		System.out.println("Filter1-doFilter end");
		out.println("Filter1-doFilter end<br/>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter1-init");
	}
}
