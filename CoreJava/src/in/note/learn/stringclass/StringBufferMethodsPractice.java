//methods are same for StringBuffer and StringBuilder

package in.note.learn.stringclass;

public class StringBufferMethodsPractice {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Karuna");
		sb.append("Chouhan");
		System.out.println("name:- " + sb);

		// length method
		System.out.println("Length:- " + sb.length());
		
		//capacity of string
		System.out.println("Capacity:- "+ sb.capacity());
		
		//character at
		System.out.println("Character at:- "+ sb.charAt(3));
		
		//Index value of a string
		System.out.println("Index value of:- "+ sb.indexOf("Chouhan"));
		
		//To replace one string with another
        System.out.println("Replace:- "+ sb.replace(0,6,"Lakhansingh"));
        
        //to reverse a string
        System.out.println("Reverse:- "+ sb.reverse());
	}
}
