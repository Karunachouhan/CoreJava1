package in.co.oop.encapsulation;

import java.util.Date;

public class Employee {
    
	private long employeeId;
	private String name;
	private String designation;
	private double salary;
	private Date joiningdate;
	
	public long getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Date getJoiningDate() {
		return this.joiningdate;
	}
	public void setJoiningDate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
}
