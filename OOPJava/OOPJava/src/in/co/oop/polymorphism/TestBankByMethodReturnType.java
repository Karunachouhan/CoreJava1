package in.co.oop.polymorphism;

public class TestBankByMethodReturnType {

	public static void main(String[] args) {
		Bank[] banks = new Bank[3];

		banks[0] = Bank.getBank(1);   //new AxisBank
		banks[1] = Bank.getBank(2);   //new HDFCBank
		banks[2] = Bank.getBank(3);   //new ICICIBank

		HomeLoanEnquiery(banks);
	}

	public static void HomeLoanEnquiery(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].getInterestRate());
			System.out.println("-------------------------------------");
		}
	}

}
