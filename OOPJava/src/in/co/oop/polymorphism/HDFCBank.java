package in.co.oop.polymorphism;

public class HDFCBank extends Bank{
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
	@Override
	public double getInterestRate() {
		return 9.8;
	}

}
