package in.com.java.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorEmployee {

	
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 1000);
		Employee e2 = new Employee(2, "Shyam", 2000);
		Employee e3 = new Employee(3, "Jiya", 45000);
		Employee e4 = new Employee(4, "Geeta", 69000);
		Employee e5 = new Employee(5, "Sunita", 29000);
		Employee e6 = new Employee(6, "Aman", 14000);

		ArrayList list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		list.forEach(System.out::println);

		System.out.println("------------------------------------------");
		System.out.println("______________sorted by name_______________");

		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);

		System.out.println("------------------------------------------");
		System.out.println("______________sorted by id_______________");

		OrderById byId = new OrderById();
		Collections.sort(list, byId);
		list.forEach(System.out::println);

		System.out.println("------------------------------------------");
		System.out.println("______________sorted by salary_______________");

		OrderBySalary bySalary = new OrderBySalary();
		Collections.sort(list, bySalary);
		list.forEach(System.out::println);
	}
}
