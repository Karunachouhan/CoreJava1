package in.com.java.synchronization;

public class TestRacing {

	public static void main(String[] args) {
		// To solve race condition we use synchronization
		Racing r1 = new Racing("Karuna");
		Racing r2 = new Racing("Madhu");

		r1.start();
		r2.start();
	}
}
