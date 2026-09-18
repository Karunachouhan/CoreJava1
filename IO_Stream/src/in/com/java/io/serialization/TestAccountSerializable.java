package in.com.java.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

		Account a = new Account("789765526673", 4560.00);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.txt"));

		out.writeObject(a);

		out.close();
        System.out.println("Object serialized successfully");
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.txt"));
        
     // Convert byte stream into Account class object: deserialization
        System.out.println(in.readObject());
        
        in.close();
	}

}
