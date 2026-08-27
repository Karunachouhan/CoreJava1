package in.co.oop.polymorphism;

public class TestBankByArrayForEachLoop {

	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		
		//by using foreach loop

		for (Bank b : banks) {
			System.out.println(b.getName());
			System.out.println(b.getInterestRate());
			System.out.println("-------------------------");
		}
	}
}
