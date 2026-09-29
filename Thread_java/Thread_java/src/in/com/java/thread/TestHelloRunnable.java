package in.com.java.thread;

public class TestHelloRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Shyam"));

		t1.run();
		System.out.println();
		t2.run();
	}
}
