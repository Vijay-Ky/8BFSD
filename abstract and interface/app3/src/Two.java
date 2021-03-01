class One
{
	static int i;
	static boolean b;
	 void test1()
	{
		System.out.println("from test1.One");
	}
}
class Two extends One
{
	void test1()
	{
		System.out.println("from test1.Two");
	}
	public static void main(String[] args) 
	{
		Two obj = new Two();
		obj.test1();
	}
}
