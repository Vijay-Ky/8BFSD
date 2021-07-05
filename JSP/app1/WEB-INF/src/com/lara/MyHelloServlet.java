package com.lara;
import org.apache.jasper.runtime.HttpJspBase;
public abstract class MyHelloServlet 
	extends HttpJspBase 
{
	public String getHello()
	{
		return "Hello to all MyHelloServlet";
	}
}
/*
D:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc5.jar;D:\Tomcat8.0\lib\servlet-api.jar;.;D:\Tomcat8.0\lib\jsp-api.jar;D:\Tomcat8.0\lib\jasper.jar
*/