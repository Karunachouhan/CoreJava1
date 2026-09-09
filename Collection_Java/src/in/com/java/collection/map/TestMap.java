package in.com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	// Map is a part of collection but not its child and does not inherit collection
	// map has three child :-
	// HashMap(class),HashTable(class)
	// SortedMap(Interface)===>child:-TreeMap(class)
	// store elements in key - value pair
	// unordered

	public static void main(String[] args) {

		Map m = new HashMap();
		// (key,value)
		m.put(1, "Karuna"); // add elements
		m.put(2, "Hema");
		m.put(3, "Chinmay");
		m.put(4, "Abhishek");
		m.put("Five", 102);

		System.out.println(m);

		System.out.println(m.get(3)); // return value as per key

		System.out.println(m.containsKey(1)); // return boolean

		System.out.println(m.containsValue("Karuna")); // return boolean

		System.out.println(m.keySet()); // return set of keys

		System.out.println(m.values()); // return set of values

		System.out.println(m.entrySet()); // return key-value pair

		for (Object o : m.entrySet()) { // iterate values one by one
			System.out.println(o);
		}

	}
}
