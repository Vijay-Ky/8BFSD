package com.lara;
import java.util.*;
public class Manager 
{
	public static List getPersons()
	{
		List list = new ArrayList();
		Person p1 = new Person();
		p1.setFirstName("vijay");
		list.add(p1);

		Person p2 = new Person();
		p2.setFirstName("kiran");
		list.add(p2);

		Person p3 = new Person();
		p3.setFirstName("bhanu");
		list.add(p3);
		
		return list;
	}
}
