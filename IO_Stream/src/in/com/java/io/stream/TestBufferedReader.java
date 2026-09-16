package in.com.java.io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
//Buffered Reader is a java class used to read character data 
	// It reads line by line
	// It is faster then File reader
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("D://IO//Test.java"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}

		file.close();
	}

}
