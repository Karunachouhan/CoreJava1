package in.co.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployee {
	public static void main(String[] args) throws ParseException {
		Employee emp = new Employee();

		emp.setName("Madhu tayde");
		emp.setEmployeeId(123);
		emp.setSalary(1200000);
		emp.setDesignation("Banglor");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse("21-8-2026");
		emp.setJoiningDate(d);

		System.out.println("Employee name = " + emp.getName());
		System.out.println("Employee id = " + emp.getEmployeeId());
		System.out.println("Employee salary = " + emp.getSalary());
		System.out.println("Job designation = " + emp.getDesignation());
		System.out.println("Joining date = " + emp.getJoiningDate());
	}
}
