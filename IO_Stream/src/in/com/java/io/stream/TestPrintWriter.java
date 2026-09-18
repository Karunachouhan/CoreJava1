package in.com.java.io.stream;

import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("D://IO//abc.txt");

		pw.println("Hello Java");
		pw.println("From karuna");
		pw.printf("Age = %d", 20);

		System.out.println("data added.................");

		pw.close();
	}
}
