package in.com.java.io.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReaderByLine {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Enter value- ");
		String name = br.readLine();

		System.out.println(name);
	}

}
