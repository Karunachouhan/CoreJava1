package in.exercise.question;

import java.util.Scanner;

public class FibonacciSerProgram {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int num;
		System.out.print("Enter number- ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
