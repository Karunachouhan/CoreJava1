package in.com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	// Collection is interface/framework
	// it has no fixed size
	// it can store any type of object(datatype)
	// it is a child interface of iterable
	// iterable contains iterator --> .iterator();
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("Karuna");
		c.add("Hema");
		c.add("Chinmay");

		System.out.println(c);
	}

}
