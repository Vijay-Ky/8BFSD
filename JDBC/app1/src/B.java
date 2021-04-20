import java.sql.*;
class B 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		String sql = "INSERT INTO SUPER11 VALUES(100)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
