class P
{
	int i;
}
class Q extends P
{
	int j;
}
class Manager32
{
	public static void main(String[] args)
	{
		P p1 = new P();
		System.out.println(p1.i);
		Q q1 = new Q();
		System.out.println(q1.i);
		System.out.println(q1.j);
		P p2 = new Q();
		System.out.println(p2.i);
		//System.out.println(p2.j);
		if(p2 instanceof Q)
		{
			Q q2 = (Q)p2;
			System.out.println(q2.i);
			System.out.println(q2.j);
		}
	}
}
