package in.com.java.thread;

public class HelloRunnable implements Runnable {
	// Runnable is a interface in java to create a thread
	// It provide run() method
	// The task is written inside the run() method and the thread is started using
	// start() method

	private String name = null;

	public HelloRunnable(String n) {
		this.name = n;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + " " + name);
		}

	}

}
