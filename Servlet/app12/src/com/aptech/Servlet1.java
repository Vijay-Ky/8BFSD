package com.aptech;

import java.io.IOException;
import javax.servlet.ServletConfig;
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
    public Servlet1(int i) {

    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    /*
	public void init(ServletConfig config) throws ServletException {
	}*/
    
    /*
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}*/
    public void init() throws ServletException {
		System.out.println("init()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = getInitParameter("");
		System.out.println("done");
	}

}
