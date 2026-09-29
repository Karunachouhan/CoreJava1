package in.com.java.priority.thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread p1 = new PriorityThread("Madhu");
		PriorityThread p2 = new PriorityThread("Karuna");

		// set thread priority
		p1.setPriority(10); // maximum priority
		p2.setPriority(1); // minimum priority

		p1.start();

		p2.start();

	}
}
