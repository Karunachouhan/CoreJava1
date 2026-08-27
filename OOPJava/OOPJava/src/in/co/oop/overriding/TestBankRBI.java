package in.co.oop.overriding;

public class TestBankRBI {
	public static void main(String[] args) {

		System.out.println("---------Axis------------");
		Axis ax = new Axis();

		System.out.println("Interest rate = " + ax.interestRate());
		ax.calInterestRate(15000.00, 2);

		System.out.println("---------HDFC------------");

		HDFC h = new HDFC();

		System.out.println("Interest rate = " + h.interestRate());
		h.calInterestRate(20000.00, 3);

		System.out.println("----------ICICI--------------");

		ICICI ic = new ICICI();

		System.out.println("Interest rate = " + ic.interestRate());
		ic.calInterestRate(85000.00, 5);
	}
}
