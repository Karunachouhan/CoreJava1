package in.com.java.collections.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		 return o1.name.compareTo(o2.name); //sorted by name in ascending order
		//return o2.name.compareTo(o1.name); // sorted by descending order
	}

}
