package in.com.java.io.stream;

import java.io.File;

public class TestRenameDeleteFile {

	
	 public static void main(String[] args) {
		
		 File file = new File("D://IO//temp.txt");            //create file object
		 file.renameTo(new File("D://IO//new.txt"));         //rename file
		 
		 System.out.println("Rename successfully");
		 File file2 = new File("D://IO//Drop.txt");
		 file2.delete();
		 
		 System.out.println("Deleted successfully");
		 file2.deleteOnExit();
		 
		 }
}