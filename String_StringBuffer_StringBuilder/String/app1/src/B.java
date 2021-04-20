public class B {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/*
 * in case of == operator it is checking whether these two
   references are pointing to the same object or different objects.
 *  s1 and s2 are pointing to the same object. we are not using new operator here.
    if we are not using new operator s1 and s2 are pointing to the same object.
    wherever s1 pointing for the same object s2 will also be pointing.
 * while executing String s2 = "hello"; new object is not creating because of same content.
*/
