class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
			i = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
			ex = null;
		}
		System.out.println("end of main:" + ex);
	}
}
