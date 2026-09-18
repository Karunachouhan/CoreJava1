package in.com.java.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteValidEmailsCustom {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D://IO//Email.txt");
		BufferedReader br = new BufferedReader(fr);

		BufferedWriter w = new BufferedWriter(new FileWriter("D://IO//ValidGmail.txt"));
		BufferedWriter w1 = new BufferedWriter(new FileWriter("D://IO//ValidOutlook.txt"));
		BufferedWriter w2 = new BufferedWriter(new FileWriter("D://IO//ValidIcloud.txt"));

		String email = br.readLine();
		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				w.write(email);
				w.newLine();
			} else if (email.endsWith("@outlook.com")) {
				System.out.println(email);
				w1.write(email);
				w1.newLine();
			} else if (email.endsWith("@icloud.com")) {
				System.out.println(email);
				w2.write(email);
				w2.newLine();
			}

			email = br.readLine();
		}
		br.close();
		w.close();
		w1.close();
		w2.close();
	}

}
