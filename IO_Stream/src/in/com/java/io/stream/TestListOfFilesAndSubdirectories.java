package in.com.java.io.stream;

import java.io.File;

public class TestListOfFilesAndSubdirectories {

	public static void main(String[] args) {
      //file object refer to D://IO
		File directory = new File("D://IO");
		//get the list of files and sub directories
		String[] files = directory.list();

		for (String f : files) {
			System.out.println(f);
		}
		
		File subDr = new File(directory,"test");       //created a sub directory in IO
		 subDr.mkdir();
	}
}
