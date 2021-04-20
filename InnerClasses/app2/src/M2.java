class M2 
{
	public static void main(String[] args) 
	{
		//this is the class construction
		//for this class there is no name, for this class super class is A
		//super class constructor is a no-arg constructor
		//sub-class doesnt have a name bcz of that we are calling it as anonymous-inner class
		A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		};
		a1.test1();
		a1.test2();
	}
}
