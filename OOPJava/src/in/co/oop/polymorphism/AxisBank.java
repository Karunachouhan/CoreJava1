package in.co.oop.polymorphism;

public class AxisBank extends Bank {
     
	public double interestRate;
	@Override
	public String getName() {
		return "Axis bank";
	}
	@Override
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate(){
		return interestRate = 10.6;
	}
	@Override
	public void calInterest() {
	  interestRate = 10.6;
	  super.calInterest();
	}
	
}
