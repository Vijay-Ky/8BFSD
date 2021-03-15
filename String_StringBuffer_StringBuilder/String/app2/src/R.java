public class R {

	public static void main(String[] args) {
		String s1 = "java made easy and also java very popular";
		//           0123456789
		int i = s1.indexOf("java");
		System.out.println(i);
		int j = s1.indexOf("java",i + 1);
		System.out.println(j);

	}
}
/*
 public int indexOf(String str)
Returns the index within this string of the first occurrence
 of the specified substring.
 Returns:
the index of the first occurrence of the specified substring,
 or -1 if there is no such occurrence.
 
 
 public int indexOf(String str,
          int fromIndex)
Returns the index within this string of the first occurrence of the specified substring,
 starting at the specified index.
 */
