package in.note.learn.stringclass;

public class StringPractice {
	public static void main(String[] args) {
		String name = "Vijay DinaNath Chouhan";
		System.out.println(name);

		// length of the string
		System.out.println("Length of the string is-" + name.length());

		// character at
		System.out.println("7th character is-" + name.charAt(6));

		// to find index value
		System.out.println("'Dina'index value is-" + name.indexOf("Dina"));

		// to find position of letter from first(starting) of string
		System.out.println("First 'i' position-" + name.indexOf('i'));

		// to find position of letter from last(end) of string
		System.out.println("Last 'i' position-" + name.lastIndexOf('i'));

		// to replace one letter by another
		System.out.println("'o' is replaced by 'a'-" + name.replace('o', 'a'));

		// to lowercase
		System.out.println("Lowercase -" + name.toLowerCase());

		// to uppercase
		System.out.println("Uppercase- " + name.toUpperCase());

		// to start with
		System.out.println("Starts with 'Vijay'-" + name.startsWith("Vijay"));

		// to check the end
		System.out.println("ends with 'han'-" + name.endsWith("han"));

		// substring
		System.out.println("Substring from index 6-" + name.substring(6));

	}

}
