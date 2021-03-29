package app1;

class X extends Thread
{
	X()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M30 {

	public static void main(String[] args) {
		System.out.println(1);
		//while creating the thread itself it is starting in the constructor
		//we can call it as auto start
		X x1 = new X();
		System.out.println(2);
	}

}
