class B 
{
	B()
	{
		System.out.println("B()");
	}
	public static void main(String[]args)
	{	
		B b1 = new B();
		System.out.println("-----");
		B b2 = new B();
		System.out.println("-----");
	}
}