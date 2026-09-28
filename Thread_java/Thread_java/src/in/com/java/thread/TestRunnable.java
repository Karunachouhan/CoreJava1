package in.com.java.thread;

public class TestRunnable {

	public static void main(String[] args) {
		HelloRunnable hello1 = new HelloRunnable("Karuna");
		HelloRunnable hello2 = new HelloRunnable("Madhu");

		hello1.run();
		System.out.println();
		hello2.run();
	}
}
