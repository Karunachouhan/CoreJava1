package in.com.java.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
	// sortedMap maintain order
	// allow multiple null values
	// does not allow duplicate value

	public static void main(String[] args) {

		SortedMap s = new TreeMap();

		s.put(1, "Home");
		s.put(2, "House");
		s.put(5, "Indore");
		s.put(6, "Bhopal");
		s.put(3, "Gher");

		System.out.println(s);

		System.out.println(s.firstKey()); // first key return krta h

		System.out.println(s.lastKey()); // last key return krta h

		System.out.println(s.headMap(6)); // key ke phle ke elements return krta h but adject key nhi

		System.out.println(s.tailMap(2)); // key ke bd ki value including given key

		System.out.println(s.subMap(2, 5)); // dono keys ke bich ke values in key-value pair
	}
}
