package in.co.oops.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws Exception {
		Person per = new Person();
		per.setName("Karuna Chouhan");
		per.setAddress("Indore");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse("17-05-2005");
		per.setDob(date);

		System.out.println("Name = " + per.getName());
		System.out.println("Address = " + per.getAddress());
		System.out.println("Date of birth = " + per.getDob());
	}
}
