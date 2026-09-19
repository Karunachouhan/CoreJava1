package in.com.java.io.stream;

import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader {

	public static void main(String[] args) throws IOException {

		// create text source
		String text = "Hello java";

		// put it inside a reader object
		// Reader is a abstract class so we use its child classes
		Reader reader = new StringReader(text);

		// read character one by one
		System.out.println((char) reader.read()); // H
		System.out.println((char) reader.read()); // e
		System.out.println((char) reader.read()); // l
		System.out.println((char) reader.read()); // l
		System.out.println((char) reader.read()); // o
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());

	}

}
