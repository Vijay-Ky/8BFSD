public class P {

	public static void main(String[] args) {
		String s1 = "helloe";
		//           01234
		int i = s1.indexOf('e');
		int j = s1.indexOf('e', i + 1);
		//int i = s1.indexOf('z');
		System.out.println("first occurance: " + i);
		System.out.println("second occurance: " + j);
		//int j = 'a';
		//System.out.println(j);
	}
}
/*

int java.lang.String.indexOf(int ch)

Returns the index within this
string of the first occurrence of the specified character.

Returns:
the index of the first occurrence of the character in the character 
sequence represented by this object, or -1 if the character does not occur.
-Returns the index with	in this string of the first occurrence of the
-specified character, starting the search at the specified index.
*/
