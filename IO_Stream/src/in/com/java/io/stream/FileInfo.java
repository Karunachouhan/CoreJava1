package in.com.java.io.stream;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("D://IO//Test.txt");
		if (file.exists()) {
			System.out.println("File name = " + file.getName());
			System.out.println("File path = " + file.getAbsolutePath());

			System.out.println("Access permission");
			System.out.println("writable: " + file.canWrite());
			System.out.println("readable: " + file.canRead());

			System.out.println("Check if it is a folder/directory or file");
			System.out.println("is file: " + file.isFile());
			System.out.println("is folder/directory: " + file.isDirectory());

			System.out.println("List modify date of a file,folder or directory");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Lastmodified: " + lastModifiedDate);
			System.out.println(file.length());

		} else {
			System.out.println("file not found");
		}
	}

}
