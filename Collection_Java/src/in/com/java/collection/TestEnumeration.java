package in.com.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	// enumeration is a interface
	// enumeration is used to traverse or iterate elements of a
	// historical(legacy)collections like vector and hashtable one by one
	// In enumeration we cannot remove element

	public static void main(String[] args) {

		Vector v = new Vector();
		v.addElement("Karuna");
		v.addElement("BCA");
		v.addElement("Indore");
		v.addElement("MP");

		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) { // check elements and return boolean value
			Object o = e.nextElement(); // return next element in object
			System.out.println(o);
		}

	}
}
