package in.com.java.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	// SortedSet is a interface
	// It store unique elements in sorted(Ascending)order
	// TreeSet does not allow null value

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		// TreeSet is slower then HashSet
		s.add('a');
		s.add('r');
		s.add('c');
		s.add('b');
		s.add('e');
		s.add('d');
		// s.add("Karuna"); //throws runtime exception ClassCastException
		// because all elements should be of same datatype if first is character then
		// rest
		// are also character typed

		System.out.println(s);

	}
}
