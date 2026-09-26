package in.co.oop.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {
		
		//dynamic binding 
		
		
		Bank b1 = new AxisBank();
		Bank b2 = new HDFCBank();
		Bank b3 = new ICICIBank();
		
		System.out.println(b1.getName());
		System.out.println(b1.getInterestRate());
		System.out.println("-----------------------------");
		System.out.println(b2.getName());
		System.out.println(b2.getInterestRate());
		System.out.println("-----------------------------");
		System.out.println(b3.getName());
		System.out.println(b3.getInterestRate());
		
		
		
		
	}

}
