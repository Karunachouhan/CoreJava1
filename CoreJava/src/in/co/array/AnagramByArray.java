package in.co.array;

import java.util.Arrays;

public class AnagramByArray {
	public static void main(String[] args) {
		String str = "listen";
		String str1 = "silent";

		char[] a = str.toCharArray(); // l,i,s,t,e,n
		char[] b = str1.toCharArray();

		Arrays.sort(a);      
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("It is anagram");
		} else {
			System.out.println("Not anagram");
		}

	}
}
