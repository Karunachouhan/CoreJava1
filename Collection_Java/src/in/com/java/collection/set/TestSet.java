package in.com.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	// Set is a interface
	// Child :- HashSet(class),SortedSet(Interface)---->TreeSet(class)
	// Set contain only unique elements
	// Set contain only one null value
	// Order of set is not define
	// Set cannot allow duplicate values

	public static void main(String[] args) {

		Set s = new HashSet();
		s.add("java");
		s.add(null);
		s.add("python");
		s.add(null);
		s.add("java");
		s.add("c++");
		s.add("c");

		// output:-[null, python, c++, java, c]
		// duplicate or null values bhi ek bar store krtah

		System.out.println(s);
	}
}
