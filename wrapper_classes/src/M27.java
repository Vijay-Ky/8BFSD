public class M27
{
	static void test(Integer obj)//requires reference type
	{
		System.out.println("done");
	}
	public static void main(String[] args)
	{
		//JDK 1.4 compilation error,JDK1.5 autoboxing into object type
		test(10);
		test(new Integer(10));
	}
}
