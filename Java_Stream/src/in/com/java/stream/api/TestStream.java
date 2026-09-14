package in.com.java.stream.api;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Python");
		list.add("CPP");
		list.add("Html");
		list.add("Css");
		list.add("Java");
		list.add("Java");

		list.forEach(System.out::println);

		System.out.println("--------------------------------------");

		list.stream().sorted().forEach(System.out::println); // arranged in sorted order

		System.out.println("---------------------------------------");

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // arranged in reverse order

		System.out.println("-----------------------------------------");

		list.stream().distinct().forEach(System.out::println); // duplicate elements removed

		System.out.println("----------------------------------------");

		list.stream().sorted().distinct().forEach(System.out::println);    //remove duplicate element and arranged in sorted order
		
	}
}
