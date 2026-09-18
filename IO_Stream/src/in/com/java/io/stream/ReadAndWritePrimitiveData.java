package in.com.java.io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws Exception {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://IO//Primitive.txt"));
		out.writeInt(101);
		out.writeBoolean(true);
		out.writeDouble(102.09);
		out.writeChar('K');

		out.close();

		System.out.println("Data added........");

		DataInputStream in = new DataInputStream(new FileInputStream("D://IO//Primitive.txt"));

		System.out.println("Integer:- " + in.readInt());
		System.out.println("Boolean:- " + in.readBoolean());
		System.out.println("Double:- " + in.readDouble());
		System.out.println("Character:- " + in.readChar());

		in.close();
	}

}
