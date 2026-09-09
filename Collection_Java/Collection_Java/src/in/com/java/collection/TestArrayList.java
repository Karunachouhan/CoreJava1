package in.com.java.collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		// arraylist is dynamic
		// arraylist store duplicate value
		// allow null values
		// arraylist is not synchronized
		//arraylist is best known for searching 

		ArrayList a = new ArrayList();

		a.add(0, "Karuna"); // add element with index value
		a.add(1, "Indore");
		a.add(2, "Bca");
		a.add(3, 'a');

		System.out.println(a);
		a.addFirst("Madhu"); // add element to first
		System.out.println(a);

		a.addLast("Bhopal"); // add element at last
		System.out.println(a);

		ArrayList a1 = new ArrayList();

		a1.add("Dewas");
		a1.add("Bhopal");
		a1.add("Indore");
		a1.add("Ujjain");

		a.addAll(a1); // add two collections
		System.out.println(a);
		
		System.out.println(a.getFirst());

		System.out.println(a.getLast());
		
		System.out.println(a.set(4, "MP"));
		System.out.println(a);
		
		a.toArray();
		System.out.println(a);
		
		a1.toString();
		System.out.println(a1);
		
		a.toString();
		System.out.println(a);
		
		System.out.println(a.contains("Karuna"));
		
		System.out.println(a.containsAll(a1));
		
		System.out.println(a.isEmpty());
	}
}
