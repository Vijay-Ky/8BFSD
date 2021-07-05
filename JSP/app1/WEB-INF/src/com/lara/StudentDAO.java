package com.lara;
import java.sql.*;
import java.util.*;

public class StudentDAO 
{
	public static List readStudents()
	{
		List students = new ArrayList();
		Map student = null;
		String sql = "select * from student";

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException ex)
		{
		}

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "great123");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				student = new HashMap();
				student.put("id", rs.getString("id"));
				student.put("first_name", rs.getString("first_name"));
				student.put("last_name", rs.getString("last_name"));
				student.put("age", rs.getString("age"));
				student.put("email", rs.getString("email"));
				students.add(student);
			}
		}
		catch (SQLException ex)
		{
		}
		finally
		{
			//close rs, stmt, con
		}
		return students;
	}
}
