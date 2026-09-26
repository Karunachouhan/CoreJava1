package in.com.java.thread;

public class TestWithoutThread {

	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("Megha");
		WithoutThread t2 = new WithoutThread("Ruchi");

		t1.run();
		t2.run();
	}

}
