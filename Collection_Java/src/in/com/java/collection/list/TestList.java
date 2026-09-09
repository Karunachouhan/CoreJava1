package in.com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	// list interface is used to store multiple elements in an order
	// allowed duplicate elements
	// allowed multiple null values
	// elements can be accessed using index

	public static void main(String[] args) {
		List l = new ArrayList();

		l.add("Karuna"); // element add
		l.add("Madhu");
		l.add("Diksha");

		System.out.println(l);

		List l2 = new ArrayList();

		l2.add(0, 101); // element add with index
		l2.add(1, "Hema");
		l2.add(2, "Bhopal");

		System.out.println(l2);

		System.out.println(l.get(1)); // get element by index value
		System.out.println(l2.get(1));

		System.out.println(l.set(0, "Karuna")); // update elements
		System.out.println(l);

		System.out.println(l2.set(1, "Diksha"));
		System.out.println(l2);

		System.out.println(l.remove(2)); // remove element by index value
		System.out.println(l);

		System.out.println(l2.remove("Bhopal")); // remove element by object
		System.out.println(l2);

		System.out.println(l.size());
		System.out.println(l2.size());

		System.out.println(l.contains("Diksha")); // check element & return boolean
		System.out.println(l);

		System.out.println(l2.indexOf(101)); // return index value of element

		l.clear(); // clear all elements
		System.out.println(l);

	}

}
