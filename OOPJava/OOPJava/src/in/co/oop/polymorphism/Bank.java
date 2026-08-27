package in.co.oop.polymorphism;

public class Bank {

	protected double p;
	protected double interestRate;
	protected int t;

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public String getName() {
		return "RBI Bank";
	}

	public void setInterestRate(double interestRate ) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate ;
	}

	public static Bank getBank(int i) {
		if (i == 1)
			return new AxisBank();
		if (i == 2)
			return new HDFCBank();
		if (i == 3)
			return new ICICIBank();

		return new Bank();
	}
	
	public void calInterest() {
		
		System.out.println("Interest is = "+(p*interestRate*t)/100);
	}
}
