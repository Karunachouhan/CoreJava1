package in.com.java.collection.queue;

import java.util.ArrayDeque;

public class TestArraydeque {
	// ArrayDeque is a class which implement deque(Double ended queue)
	// ArrayDeque Deque interface ko implement krta hai
	// Elements ko both ends s add/remove kar skte h
	// Duplicate elements allowed hai
	// Null elements allowed nhi hai
	// It is not thread-safe
	// It is ordered

	public static void main(String[] args) {

		ArrayDeque dq = new ArrayDeque();

		dq.offer("Karuna"); // add element
		dq.offerFirst("Hema"); // add element at first
		dq.offerLast("Chinmay"); // add element at last
		dq.offer(101);
		dq.offer('a');
		dq.push("Abhishek"); // add element at first

		System.out.println(dq);

		System.out.println(dq.peekFirst()); // return first element

		System.out.println(dq.peek()); // FIFO-return first element by default

		System.out.println(dq.peekLast()); // return last element

		dq.poll(); // FIFO - remove first element
		System.out.println(dq);

		dq.pollFirst(); // remove first element
		System.out.println(dq);

		dq.pollLast(); // remove last element
		System.out.println(dq);

		System.out.println(dq.isEmpty());

		System.out.println(dq.size());

		System.out.println(dq.clone()); // object ki duplicate copy print krna

		dq.clear();
		System.out.println(dq);

	}

}
