package in.com.java.collection.sort;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 1000);
		Employee e2 = new Employee(2, "Shyam", 2000);
		Employee e3 = new Employee(3, "Shree", 3000);
		Employee e4 = new Employee(4, "Deepak", 4000);
		Employee e5 = new Employee(5, "Sita", 5000);

		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		System.out.println(list);
		System.out.println();

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println();

		Iterator i = list.iterator();

		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
