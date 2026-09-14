package in.com.java.stream.api;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamHighestSalary {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10000);
		list.add(20000);
		list.add(30000);
		list.add(40000);
		list.add(50000);
		list.add(60000);

		System.out.println("List of salaries:- " + list);

		System.out.println("First highest salary:-  ");

		list.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

		System.out.println("Second and third highest salary:-  ");

		list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(2).forEach(System.out::println);
	}
}
