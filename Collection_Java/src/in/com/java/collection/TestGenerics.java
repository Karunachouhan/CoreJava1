package in.com.java.collection;

import java.util.ArrayList;

//Generic provide a way in order to communicate the type of a collection to the compiler
//Defines type of collection to the compiler
public class TestGenerics {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Python");
		list.add("cpp");
		list.add("c");
		list.add("Html");
		// list.add(101); //compilation error

		System.out.println(list);
	}
}
