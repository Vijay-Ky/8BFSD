class D 
{
}
class E extends D
{
}
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		D d1 = new D();
		E e2 = (E) d1;
		System.out.println("main end");
	}
}
