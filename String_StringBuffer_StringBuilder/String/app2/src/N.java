public class N {

	public static void main(String[] args) {
		String s1 = "hello";
		//           01234
		char c1 = s1.charAt(0);
		char c2 = s1.charAt(3);
		char c3 = s1.charAt(4);
		
		//char c4 = s1.charAt(-1);
		char c5 = s1.charAt(5);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//System.out.println(c4);
		//System.out.println(c5);
	}
}
/*
 charAt
public char charAt(int index)
Returns the char value at the specified index.
Returns:
the char value at the specified index of this string. 
The first char value is at index 0.
*/
