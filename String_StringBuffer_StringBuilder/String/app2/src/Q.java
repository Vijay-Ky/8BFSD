public class Q {

	public static void main(String[] args) {
		String s1 = "java made easy";
		//           0123456789
		int i = s1.indexOf('a');
		System.out.println(i);
		int j = s1.indexOf('a', 8);
		System.out.println(j);
	}
}
/*
public int indexOf(int ch,
          int fromIndex)
Returns the index within this string of the first occurrence of the specified 
character, starting the search at the specified index.
*/
