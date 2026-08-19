package in.co.date;

import java.time.LocalDate;

public class TestLocalDateOf {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today is- "+today);
		
		System.out.println("------------------------------");
		
		LocalDate dob = LocalDate.of(2005, 05, 17);
		System.out.println(dob);

		System.out.println("Day of a week- " + dob.getDayOfWeek());
		System.out.println("Day of a Month- "+dob.getDayOfMonth());
		System.out.println("Day of a Year- "+dob.getDayOfYear());
		System.out.println("month- "+dob.getMonth());
		System.out.println("year- "+dob.getYear());
		
		System.out.println("----------------------------");
		
		System.out.println("age:- "+(today.getYear()-dob.getYear()));
	}
}
