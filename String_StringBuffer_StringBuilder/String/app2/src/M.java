public class M {

	public static void main(String[] args) {
		String s1 = "hello";
		char[] chars = s1.toCharArray();// built in method
		//System.out.println(chars[0]);
		for(int i = 0; i < chars.length; i++)
		{
			System.out.print(chars[i] + ",");
		}
	}
}
/*
toCharArray
public char[] toCharArray()
Converts this string to a new character array.
Returns:
a newly allocated character array whose length 
is the length of this string and whose contents 
are initialized to contain the character sequence 
represented by this string.
*/
