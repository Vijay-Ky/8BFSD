public class D {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("12345678911234567812345678911234567888888888888888888888888888");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("12345678911234567888888888888888888888888888");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
formula (oldcapacity*2)+2
 * capacity will be automatically increased
 * bcz of this StringBuffer is mutable.
 */
