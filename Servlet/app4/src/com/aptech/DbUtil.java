//server side development
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

		String sql = "insert into exgirlfriends values('" + firstName + "', '" + lastName + "')";
		
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
/* 
1. in the server side for programming purpose we are using servlets.
2. indside a servlet we are able to read firsName and lastName.
3. inside firstName and lastName compose sql command, send that sql command to the database.
4. to interact with the database from a web application we need to use jar file in order to use
   driver class, driver class is availble in a particular jar file.
5. for jar files purpose we need to create one directory, inside WEB-INF with a fixed name 'lib'
6. inside our application any jar files are there, then we need to create a folder name as lib
7. copy JDBC driver jar file(ojdbc5) into the lib folder.
8. even though classpath is updated we need to copy the jar file into the lib folder.
9. tomcat is not using classpath, for any third party jar files.
10. now we can develop jdbc code inside project folder. to interact with the database.
11. checking jdbc setup for classpath - javap oracle.jdbc.driver.OracleDriver

CREATE TABLE USERS(FIRSTNAME VARCHAR2(90), LASTNAME VARCHAR(90));
*/
