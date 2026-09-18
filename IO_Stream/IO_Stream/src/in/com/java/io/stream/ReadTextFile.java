package in.com.java.io.stream;

import java.io.FileReader;

public class ReadTextFile {
	// File Reader is a class
	// It is used to read character data from a file
	// it read character one by one
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D://IO//Test.txt");

		int i = file.read();

		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();

		}

		file.close();
	}

}
