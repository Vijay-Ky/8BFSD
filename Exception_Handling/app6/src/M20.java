class A
{
	A() throws ClassNotFoundException
	{
		//Class.forName("");
		/*try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}*/
	}
}
class M20 
{
	public static void main(String[] args) throws ClassNotFoundException //at least caller of the A() should throw this Exception otherwise we get error
	{
		A a1 = new A();
		/*try
		{
			A a1 = new A();
		}
		catch (ClassNotFoundException ex)
		{
		}*/
		System.out.println("done");
	}
}
