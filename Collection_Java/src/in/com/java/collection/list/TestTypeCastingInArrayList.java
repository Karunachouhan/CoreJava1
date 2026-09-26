package in.com.java.collection.list;

import java.util.ArrayList;

public class TestTypeCastingInArrayList {

	public static void main(String[] args) {
		// type casting means apne object ko ek particular type me change krna
		ArrayList list = new ArrayList();

		// add elements
		list.add(101); // int
		list.add(20.67); // double
		list.add("Java"); // String
		list.add(true); // boolean

		// get elements
		int i = (int) list.get(0);
		double j = (double) list.get(1);
		String str = (String) list.get(2);
		Boolean b = (Boolean) list.get(3);

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		System.out.println(b);

	}

}
