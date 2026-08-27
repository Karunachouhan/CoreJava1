package in.co.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();

		ac.setNumber("DX000976");
		ac.setAccountType("saving");
		ac.setBalance(50000.0);

		System.out.println("Account number = " + ac.getNumber());
		System.out.println("Account type = " + ac.getAccountType());
		System.out.println("Account balance = " + ac.getBalance());
		ac.deposit(10000);
		System.out.println("After deposit = "+ac.getBalance());
		ac.withdrawal(20000);
		System.out.println("After withdrawal = "+ac.getBalance());
		ac.withdrawal(700000);
		ac.fundtransfer(10000);
		ac.paybill(2000);
		}
}
