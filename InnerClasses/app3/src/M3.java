interface A
{
	void test(int i);
}
class M3
{
	public static void main(String[] args) 
	{
		A a2 = (int x) -> {
						System.out.println("from test:" + x);
						System.out.println("from test");
						System.out.println("from test");
					 };
		a2.test(20);
	}
}
