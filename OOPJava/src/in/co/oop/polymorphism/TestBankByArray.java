package in.co.oop.polymorphism;

public class TestBankByArray {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();

		HomeLoanEnquiery(banks);            //abstract method

	}

	private static void HomeLoanEnquiery(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].getInterestRate());
            System.out.println("------------------------");
		}

	}
}
