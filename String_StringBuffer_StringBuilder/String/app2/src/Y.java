public class Y {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/* only one object created.
 * "hello" is a constant. initialy one constant is created.
   then taking that constant reference supplying to the string
   constructor and defining a second object.
 
 */
