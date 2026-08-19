package in.co.date;

import java.time.LocalDate;

public class TestLocalDateNow {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		System.out.println("Day of week-" + ld.getDayOfWeek());
		System.out.println("Day of months- " + ld.getDayOfMonth());
		System.out.println("Day of year- " + ld.getDayOfYear());
		System.out.println("Month- " + ld.getMonth());
		System.out.println("Years- " + ld.getYear());

	}
}
