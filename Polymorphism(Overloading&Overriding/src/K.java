class J
{
	void test1(int i)
	{
		System.out.println("from test1.J");
	}
}

class K extends J
{
	void test1()
	{
		System.out.println("from test1.K");
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.test1();
	}
}
