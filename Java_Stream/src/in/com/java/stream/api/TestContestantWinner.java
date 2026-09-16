package in.com.java.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "7898684294"));
		list.add(new Contestant("Shyam", "2356638"));
		list.add(new Contestant("Sita", "6797904294"));
		list.add(new Contestant("Geeta", "7809786544"));
		list.add(new Contestant("Hari", "9770743605"));
		list.add(new Contestant("Raman", "7865887"));
		list.add(new Contestant("Shiva", "7898684294"));

		// get phone number
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		System.out.println("-----------------------------------------------");

		// get valid phone number
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("-----------------------------------------------");

		// remove duplicate phone numbers
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("-----------------------------------------------");

		// shuffle phone number
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();

				})).limit(3).forEach(System.out::println);
	}
}
