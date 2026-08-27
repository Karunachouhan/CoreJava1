package in.co.oop.overriding;

public class BankRBI {
	protected double interestRate;
	
	public double interestRate() {
		System.out.println("InterestRate of RBI");
		return interestRate = 11.2;
	}
	public void calInterestRate(double principle,int time) {
		double interest =(principle*this.interestRate*time)/100;
		System.out.println("Interest is = "+interest);
	}
 }


