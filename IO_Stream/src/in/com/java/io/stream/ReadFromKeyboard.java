package in.com.java.io.stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter("D://IO//temp.txt"));

		System.out.println("Start writing your text here........");

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(in);
		String line = read.readLine();

		while (!line.equals("exit")) {
			pw.println(line); // write line in the file
			line = read.readLine(); // read next line
		}

		pw.close();
		in.close();
		read.close();
	}
}
