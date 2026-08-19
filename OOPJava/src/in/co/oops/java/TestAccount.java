package in.co.oops.java;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();

		ac.setNumber("234546637672676");
		ac.setAccountType("saving");
		ac.setBalance(50000.0);

		System.out.println("Account number = " + ac.getNumber());
		System.out.println("Account type = " + ac.getAccountType());
		System.out.println("Account balance = " + ac.getBalance());

	}
}
