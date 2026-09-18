package in.com.java.io.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {

	// input stream reader byte stream ko character stream me convert krta h

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		System.out.println("Enter value:-   ");

		int ch = isr.read();      //read a character only

		System.out.println((char) ch);
	}

}
