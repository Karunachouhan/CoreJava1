package in.com.java.io.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Buffered writer is a class it is used to write character data into a file efficiently

public class TestBufferdWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter file = new BufferedWriter(new FileWriter("D://IO//Test.java", true));

		file.write("public class Hello {");
		file.newLine();
		file.write("public static void main(String[] args) {");
		file.newLine();
		file.write("System.out.println('Hello world');");
		file.newLine();
		file.write("}" + "\n" + "}");

		System.out.println("Data written in file successfully");

		file.close();
	}
}
