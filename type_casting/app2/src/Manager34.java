class X
{
	int i;
	void test1()
	{
		System.out.println("X-test1");
	}
}
class Y extends X
{
	int j;
	void test2()
	{
		System.out.println("Y-test2");
	}
}
class Manager34
{
	public static void main(String[] args)
	{
		Object obj1 = new X();
		//obj1.test1();//1
		//obj1.test2();//2
		Object obj2 = new Y();
		//obj2.test1();//3
		//obj2.test2();//4
		X x1 = new X();
		x1.test1();//5
		//x1.test2();//6
		X x2 = new Y();
		x2.test1();//7
		//x2.test2();//8
		Y y1 = new Y();
		y1.test1();//9
		y1.test2();//10
		//obj1.i=1;//11
		//obj1.j=1;//12
		//obj2.i=1;//13
		//obj2.j=1;//14
		x1.i = 1;//15
		//x1.j=1;//16
		x2.i = 1;//17
		//x2.j=1;//18
		y1.i = 1;//19
		y1.j = 1;//20
		System.out.println("done");
	}
}