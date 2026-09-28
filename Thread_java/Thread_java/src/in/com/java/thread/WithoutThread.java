package in.com.java.thread;

public class WithoutThread {

	String name = null;

	public WithoutThread(String n) {
		this.name = n;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + name);

		}
	}
}
