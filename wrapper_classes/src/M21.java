class A
{	
}
class B extends A
{
}
public class M21
{
	public static void main(String [] args)
	{
		//auto-upcasting
		A a1 = new B();
		Object o1 = new A();
		Object o2 = new B();
		System.out.println("done");
	}
}
