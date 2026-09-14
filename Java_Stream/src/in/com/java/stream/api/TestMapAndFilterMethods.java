package in.com.java.stream.api;

import java.util.ArrayList;

public class TestMapAndFilterMethods {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Tarun");
		list.add("Raman");
		list.add("Sita");
		list.add("Karan");
		list.add("Shyam");
		list.add("Shyam");
		list.add("Shyam");
		list.add("Ram");

		list.forEach(System.out::println);
		System.out.println("-----------------------------------------");

		System.out.println("MapMethods");
		System.out.println("sorted with lowercase: ");

		list.stream().map(e -> e.toLowerCase()).sorted().distinct().forEach(System.out::println);
		System.out.println("sorted with uppercase: ");

		list.stream().map(e -> e.toUpperCase()).sorted().distinct().forEach(System.out::println);

		System.out.println("Starts with S :- ");

		list.stream().filter(e -> e.startsWith("S")).sorted().forEach(System.out::println);

	}

}
