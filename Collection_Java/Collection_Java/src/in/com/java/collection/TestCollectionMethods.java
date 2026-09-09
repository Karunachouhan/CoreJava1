package in.com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(101);
		c.add("Karuna");
		c.add('s');
		c.add(108.2);

		System.out.println(c);

		Collection c1 = new ArrayList();

		c1.add("Ram");
		c1.add(234);
		c1.add('a');
		c1.add(88.6);

		System.out.println(c1);

		System.out.println(c.addAll(c1)); // return boolean values & add collection

		System.out.println(c);
		
		System.out.println(c.retainAll(c1));     //return boolean values

		System.out.println(c.contains(101)); // return boolean values & checking membership

		System.out.println(c.containsAll(c1)); // return boolean values & inclusion checking
        
		System.out.println(c.isEmpty());    //when it is empty return boolean values
		
		System.out.println(c.size());        //the number of elements
		
		System.out.println(c.remove(108.2));    //Remove an element
		System.out.println(c);
		 
		System.out.println(c.removeAll(c1));    //remove a collection
 		System.out.println(c);
 		
 		c.clear();         //Remove all element from collection
 		System.out.println(c);
 		
 		
		
	}

}
