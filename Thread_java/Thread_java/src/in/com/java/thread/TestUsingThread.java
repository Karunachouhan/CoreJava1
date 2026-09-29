package in.com.java.thread;

public class TestUsingThread {

	public static void main(String[] args) {

		// thread are born when create object using new keyword
		UsingThread t1 = new UsingThread("Diksha"); // creates the thread object
		UsingThread t2 = new UsingThread("Madhu");

		t1.start(); // starts the thread
		t2.start(); // start() internally calls run()

		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "=" + "Karuna"); // main thread

		}

	}
}
