import java.util.ArrayList;
import java.util.Collections; //collections is utility class to use short element;
import java.util.Comparator; //collections is utility class to use short element;

class C {
	int i;

	C(int i) {
		this.i = i;
	}

	public String toString() {
		return " i = " + i;
	}

}

public class Manager23 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new C(9));
		list.add(new C(19));
		list.add(new C(4));
		list.add(new C(10));
		list.add(new C(8));
		/*list.add(9);
		list.add(19);
		list.add(4);
		list.add(10);
		list.add(8);*/

		System.out.println(list);
		//Collections.sort(list);
		System.out.println(list);
		//System.out.println(ctr);
	}
}
/*
 we get classcastexception because C class elements are not comparable type.
 While sorting, elements should be of comparable type or a separate comparator object should be supplied.
 all the wrapper classes implemented comparable interface.
.so we don't need to supply a separate comparator in case of wrapper classes.
 */
