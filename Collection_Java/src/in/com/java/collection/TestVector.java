package in.com.java.collection;

import java.util.Vector;

public class TestVector {
   //vector is a historical class
   //Used to store collection of object 
   //It is like arraylist but its methods are synchronized 
   //it is thread-safe
	
	
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		
		vec.add("Java");       //add method comes from list which is its parents
		vec.add("Python");
		vec.add("c++");
		
		System.out.println(vec);
		
		vec.addElement("c");   //addElement is used to add element
		
		System.out.println(vec);
		
		System.out.println(vec.size());
		
		System.out.println(vec.capacity());
	     
		System.out.println(vec.get(1));
		
		vec.set(3, "HTML");
		System.out.println(vec);
		
		vec.remove(1);
		System.out.println(vec);
	}
}
