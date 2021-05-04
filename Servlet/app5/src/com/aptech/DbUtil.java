package com.aptech;

import java.sql.*;

public class DbUtil
{
	public static int save(String firstName, String lastName) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

		String sql = "insert into girlfriends values('" + firstName + "', '" + lastName + "')";
		
		int status = 0;
	
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "admin";
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement())
		{
				status = stmt.executeUpdate(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}
