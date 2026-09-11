package in.com.java.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheetUsingComparable {
	public static void main(String[] args) {

		ArrayList<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet("101", "Ram", 76));
		list.add(new Marksheet("107", "Shyam", 56));
		list.add(new Marksheet("104", "Krish", 33));
		list.add(new Marksheet("102", "Radha", 74));
		list.add(new Marksheet("103", "Geeta", 87));
		list.add(new Marksheet("105", "Meet", 90));

		list.forEach(System.out::println);

		System.out.println("--------Sorting---------");

		Collections.sort(list);
		list.forEach(System.out::println);

		System.out.println("-------using iterator--------------");
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

	}
}
