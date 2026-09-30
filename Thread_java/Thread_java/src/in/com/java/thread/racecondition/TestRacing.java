package in.com.java.thread.racecondition;

public class TestRacing {

	public static void main(String[] args) {
		// When two threads simultaneously try to access modify an object it is called
		// race-condition
		Racing race = new Racing("Madhu");
		Racing race1 = new Racing("Karuna");

		race.start();
		race1.start();

	}
}
