package in.com.java.collection.set;

import java.util.HashSet;

public class TestHashSet {
	// duplicate not allowed
	// no guranateed order of element
	// allow one null value
	// it is not synchronized

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("Zero");
		hs.add("One");
		hs.add("Two");
		hs.add("Four");

		System.out.println(hs);

	}

}
