import java.sql.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		String sql1 = "CREATE TABLE SUPER11(PLAYER_ID NUMBER)";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		stmt.execute(sql1);
		System.out.println("done");
	}
}
