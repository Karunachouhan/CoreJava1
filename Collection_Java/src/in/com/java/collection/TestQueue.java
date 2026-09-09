package in.com.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
  //Queue is an interface it is used to store element in FIFO(First In First Out)manner
	
	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		q.add("A");
		q.add("B");
		q.add('c');
		
		
		q.offer("Indore");       //adds an element
		q.offer("Bhopal");
		
		System.out.println(q);
		
		System.out.println(q.remove());     //removes the front element
		System.out.println(q);
		
		System.out.println(q.peek());      //returns the front element
		
		System.out.println(q.poll());       //remove the front element
		
		System.out.println(q.element());      //returns front element
		System.out.println(q);
	}
}
