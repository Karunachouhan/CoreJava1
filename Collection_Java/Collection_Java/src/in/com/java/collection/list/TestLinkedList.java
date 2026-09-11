package in.com.java.collection.list;

import java.util.LinkedList;

public class TestLinkedList {
	// each node contain data and links of a previous node
	// allow duplicate value

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();

		names.add("Manju");
		names.add("Lakhan");
		names.add("Nandini");
		names.add("Aaradhiya");

		System.out.println(names);

		LinkedList coll = new LinkedList();

		coll.add("Bhopal");
		coll.add(234);
		coll.add("Indore");
		coll.add(1);

		System.out.println(coll);

		names.addAll(coll);
		System.out.println(names);

		names.addFirst("Ujjain");
		System.out.println(names);

		names.addLast("Dewas");
		System.out.println(names);

		System.out.println(names.get(2));

		System.out.println(names.getFirst());

		System.out.println(names.getLast());

		names.removeFirst();
		System.out.println(names);

		names.removeLast();
		System.out.println(names);

	}
}
