package in.com.java.collection.map;

import java.util.Hashtable;

public class TestHashTable {

	// HashTable does not contain duplicate key
	// HashTable does not contain null key
	// HashTable does not contain null value
	// not maintain order
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put(1, "php");
		ht.put(2, "python");
		ht.put(3, "html");
		ht.put(4, "java");
		ht.put(5, "c");

		System.out.println(ht);

		System.out.println(ht.get(3));

		System.out.println(ht.containsKey(2));

		System.out.println(ht.containsValue("java"));

		System.out.println(ht.keySet());

		System.out.println(ht.values());

		System.out.println(ht.entrySet());

		for (Object o : ht.entrySet()) {
			System.out.println(o);
		}

		System.out.println(ht.size());

		System.out.println(ht.remove(1));
		System.out.println(ht);

		ht.clear();
		System.out.println(ht);

	}

}
