package in.co.oop.polymorphism;

public class TestBankByMethodArguments {
   public static void main(String[] args) {
	
	   Bank b = new Bank();
	   b.setP(1200.00);
	   b.setInterestRate(11.6);
	   b.setT(2);
	   System.out.println("Principle value = "+b.getP());
	   System.out.println("Rate of interest = "+b.getInterestRate());
	   System.out.println("Time = "+b.getT());
	   b.calInterest();
	   
	   Bank b1 = new AxisBank();
	   b1.getName();
	   b1.setInterestRate(10.6);
	   b1.setP(13000.00);
	   b1.setT(3);
	   System.out.println("Principle value = "+b1.getP());
	   System.out.println("Rate of interest = " +b1.getInterestRate());
	   System.out.println("Time = "+b.getT());
	   b1.calInterest();
}
}
