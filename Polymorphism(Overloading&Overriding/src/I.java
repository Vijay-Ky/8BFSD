class I 
{
	static void test1()
	{
		System.out.println("from test1");
	}
	static int test1(int i)
	{
		System.out.println("from test1(int)");
		return 0;
	}
	static boolean test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
		return true;
	}

	public static void main(String[] args) 
	{
		A.test1();
		A.test1(90);
		A.test1(90, 100);
		System.out.println("done");
	}
}
