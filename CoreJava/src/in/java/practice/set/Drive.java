package in.java.practice.set;

import java.util.Scanner;

public class Drive {
	public static void main() {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are elegible for driving");
		} else {
			System.out.println("You are not elegible for driving");
		}
	}
}
