package in.com.java.collection;

import java.util.Stack;

public class TestStack {
     //A stack is a collection in java which follow LIFO-LastInFirstOut
	 
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for(char c = 'a'; c<='z'; c++) {
			s.push(c);         //add an element to the top
		}
		
		System.out.println(s);
		
		System.out.println(s.peek());           //return the top element without removing it
		System.out.println(s.empty());          //check whether stack is empty
		System.out.println(s.pop());            //remove and returns the top element
		System.out.println(s.search('e'));      //searches and element and returns its position
		
		
	}
}
