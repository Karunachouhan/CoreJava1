package in.co.oop.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("-------------Businessman----------------");
		Businessman bm = new Businessman();
		bm.setName("Shyam");
		bm.setAddress("Indore");
		bm.setIncome(120000.0);
		Date d = sdf.parse("13-10-2005");
		bm.setDateOfBirth(d);

		System.out.println("Name = " + bm.getName());
		System.out.println("Address = " + bm.getAddress());
		System.out.println("Income = " + bm.getIncome());
		System.out.println("DOB = " + bm.getDateOfBirth());
		System.out.println();

		System.out.println("-------------Doctor----------------");
		Doctor dc = new Doctor();
		dc.setName("DR.Sharma");
		dc.setAddress("Bhopal");
		d = sdf.parse("02-08-1996");
		dc.setDateOfBirth(d);
		dc.setRegistrationNo("DR0SH5643");

		System.out.println("Name = " + dc.getName());
		System.out.println("Address = " + dc.getAddress());
		System.out.println("DOB = " + dc.getDateOfBirth());
		System.out.println("Registration number = " + dc.getRegistrationNo());
		System.out.println();

		System.out.println("-------------Student----------------");
		Student st = new Student();
		st.setName("Ram");
		st.setRollNo("1201");
		st.setAddress("Dewas");
		d = sdf.parse("07-05-2005");
		st.setDateOfBirth(d);
		st.setMarks(95);

		System.out.println("Name = " + st.getName());
		System.out.println("Address = " + st.getAddress());
		System.out.println("DOB = " + st.getDateOfBirth());
		System.out.println("Rollno = " + st.getRollNo());
		System.out.println("Marks = " + st.getMarks());

	}
}
