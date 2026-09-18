package in.com.java.io.stream;

import java.io.FileWriter;
//FileWriter is a character stream class in I/O stream
//It is used to write character / text data into a file

public class WriteTextFile {
	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("D://IO//Test.txt", true);

		file.write("Hello from java");

		System.out.println("text data written successfully");

		file.close();

	}
}
