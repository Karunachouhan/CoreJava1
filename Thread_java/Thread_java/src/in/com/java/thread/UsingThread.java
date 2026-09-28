package in.com.java.thread;

public class UsingThread extends Thread { // creates a thread class

	// A thread is a small unit of a program that can run independently
	// A thread in Java is a lightweight unit of execution that allows a program to
	// perform multiple tasks concurrently.
	// Thread class is a predefined class available in java.lang package
	// It is used to create and manage thread
	// start() internally calls run() method

	String name = null;

	public UsingThread(String n) {
		this.name = n;
	}

	@Override
	public void run() // run() contains the task that the thread will perform
	{
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + name);

		}

	}
}
