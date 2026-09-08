package in.com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	//iterator is a interface used to read/access elements one by one from collection
	
	public static void main(String[] args) {
		 
	  ArrayList al = new ArrayList();
	  
	  al.add("Hema");
	  al.add("Chinmay");
	  al.add("Abhishek");
	  al.add("Karuna");
	  
	  System.out.println(al);
	  
	  Iterator it = al.iterator();
	  while(it.hasNext()) {            //check whether another element is available 
		                               //hasNext()method returns boolean value
		  //it.remove();               //return IllegalStateException 
		  Object o = it.next();        //returns the next element and store it in object
		  System.out.println(o);
		  it.remove();                 //remove the current element
	  }
	  
	  System.out.println(al);
	}

}
