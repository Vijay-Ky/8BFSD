class M23 
{
	static D method1()
	{
		return new D()
			   {
					public void test1()
					{
						System.out.println("from test1");
					}
					public void test2()
					{
						System.out.println("from test2");
					}
			   };
	}
	public static void main(String[] args) 
	{
		D obj = method1();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
