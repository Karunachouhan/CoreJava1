package in.com.java.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception, IOException {

		Employee e = new Employee(1, "Karuna");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Employee.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("Added successfully..............");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Employee.txt"));

		System.out.println(in.readObject());

		in.close();
	}

}
