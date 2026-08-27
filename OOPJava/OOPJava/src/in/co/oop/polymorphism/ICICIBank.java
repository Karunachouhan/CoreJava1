package in.co.oop.polymorphism;

public class ICICIBank extends Bank {
      
	 @Override
	public String getName() {
		return "ICICI Bank";
	}
	 
	 @Override
	public double getInterestRate() {
		return super.getInterestRate();
	}
}
