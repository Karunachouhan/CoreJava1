package in.com.java.thread.racecondition;

public class Racing extends Thread {
     
	String name = null;

	public static Account account = new Account();         //class monitor 

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposit(name , 10000);
		}
	}
}
	
