package in.com.java.collection.map;

import java.util.HashMap;

public class TestHashMap {

	// HashMap does not contain duplicate key
	// HashMap contains only one null key
	// values can be duplicate
	// HashMap can contain multiple null values
	// maintain order

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put(1, "java");
		hm.put(2, "python");
		hm.put(5, "html");
		hm.put(3, "c");
		hm.put(4, "cpp");

		System.out.println(hm);

		System.out.println(hm.get(5));

		System.out.println(hm.containsKey(2));

		System.out.println(hm.containsValue("java"));

		System.out.println(hm.keySet());

		System.out.println(hm.values());

		System.out.println(hm.entrySet());

		for (Object o : hm.keySet()) {
			System.out.println(o);         //keys one by one print karega
		}
	}

}
