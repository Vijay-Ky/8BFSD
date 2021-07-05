package com.lara;

import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public class StudentAnotherDAO 
{
	public static void readAndPrint(
		PageContext pageContext)
	{
		JspWriter out = pageContext.getOut();
		//String sql = "select * from student";
		String sql = "select * from student where age > 200";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "great123");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			out.println("<table border='1'>");
			int sno = 0;
			while(rs.next())
			{
				if(sno == 0)
				{
					out.println("<tr>");
					out.println("<th>SNO</th>");
					out.println("<th>First Name</th>");
					out.println("<th>Last Name</th>");
					out.println("<th>Age</th>");
					out.println("<th>Email</th>");
					out.println("</tr>");
				}
				sno ++;
				out.println("<tr>");
				out.println("<td>" + rs.getString("id") + "</td>");
				out.println("<td>" + rs.getString("first_name") + "</td>");
				out.println("<td>" + rs.getString("last_name") + "</td>");
				out.println("<td>" + rs.getString("age") + "</td>");
				out.println("<td>" + rs.getString("email") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			if(sno == 0)
			{
				out.println("No records found");
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//close rs, stmt and con
		}
	}
}
