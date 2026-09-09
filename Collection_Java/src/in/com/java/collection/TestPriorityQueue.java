package in.com.java.collection;

import java.util.PriorityQueue;

public class TestPriorityQueue {
	// Elements are processed according to their priority,not simply insertion order
	// By default,the smallest number get the highest priority
	// It stores the element of same type if there datatypes are different it shows
	// runtime exception ClassCashException

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.offer(50);
		pq.offer(30);
		pq.offer(20);
		pq.offer(10);
		pq.offer(40);
		// pq.offer("Java"); //runtime exception :- java.lang.ClassCastException

		System.out.println(pq);

		pq.poll();
		System.out.println(pq); // first element remove krta hai

		System.out.println(pq.peek()); // first element dekhta hai

		System.out.println("size of Queue: " + pq.size());

		System.out.println(pq.isEmpty()); // Queue empty hai ya nhi check krta hai boolean return krta hai

		System.out.println(pq.contains(20)); // Check krta hai elements hai ya nhi boolean return krta hai
	}
}
