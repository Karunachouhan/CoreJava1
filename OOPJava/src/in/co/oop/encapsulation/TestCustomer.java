package in.co.oop.encapsulation;

public class TestCustomer {
	public static void main(String[] args) {
		Customer ctr = new Customer();

		ctr.setCustomerName("Diksha singh");
		ctr.setCustomerId(101);
		ctr.setPhoneNumber("6232547865");
		ctr.setAddress("Navlakha,Indore");
		ctr.setEmail("dikshasingh@email.com");

		System.out.println("Customer name:- " + ctr.getCustomerName());
		System.out.println("Customer Id:- " + ctr.getCustomerId());
		System.out.println("Phone number:- " + ctr.getPhoneNumber());
		System.out.println("Address:- " + ctr.getAddress());
		System.out.println("Email Id:- " + ctr.getEmail());
	}
}
