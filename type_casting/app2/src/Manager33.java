class R
{
	void test1()
	{
		System.out.println("R-test1");
	}
}
class S extends R
{
	void test2()
	{
		System.out.println("S-test2");
	}
}
class Manager33
{
	public static void main(String[] args)
	{
		R r1 = new R();
		r1.test1();
		//r1.test2();
		S s1 = new S();
		s1.test1();
		s1.test2();
		R r2 = new S();
		r2.test1();
		//r2.test2();
		if(r2 instanceof S)
		{
			S s2 = (S)r2;
			s2.test2();
		}
		System.out.println("done");
	}
}