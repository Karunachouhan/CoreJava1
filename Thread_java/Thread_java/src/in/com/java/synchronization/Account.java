package in.com.java.synchronization;

public class Account {
	// For synchronization synchronized keyword is used
	// It work like a lock
	// When one thread is executing another has to wait
	// It is used in method and block
	
	
	private int balance = 0;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposit(String name, int amt) {
		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " " + getBalance());
	}
}
