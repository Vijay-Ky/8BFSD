public class Z2 {

	public static void main(String[] args) {
		String s1 = "maybe";
		String s2 = s1 + "maynotbe";
		s1.concat("iknow");
		s2.concat(s1);
		s1 = s1 + "idontknow";
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}
