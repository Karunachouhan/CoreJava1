package in.com.java.autoboxing.unboxing;

public class TestMethodsOfBoxing {

	public static void main(String[] args) {

		int a = 5;
		Integer b = a; // Autoboxing
		System.out.println("Autoboxing :- " + b);
		System.out.println("---------------------------------------------");

		int c = b; // Unboxing
		System.out.println("Unboxing :- " + c);
		System.out.println("---------------------------------------------");

		System.out.println("Methods:- ");
		// Integer.max(a,b) :- Maximum value return krta h
		// parseInt() :- String ko int me convert karti he
		// valueOf() :- int ko string me convert karti he

		System.out.println("Maximum value from 12 and 90 is :- " + Integer.max(12, 90));
		System.out.println("Minimum value from 100 and 60 is :- " + Integer.min(100, 60));
		System.out.println("---------------------------------------------");

		String str = "100";
		int d = Integer.parseInt(str); // convert String to int
		System.out.println(d);

		System.out.println("---------------------------------------------");

		String s = String.valueOf(d); // convert int to String
		System.out.println(s);
	}
}
