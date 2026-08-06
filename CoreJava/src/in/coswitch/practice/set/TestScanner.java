package in.coswitch.practice.set;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int a = sc.nextInt();
		System.out.println("Enter second number-");
		int b = sc.nextInt();

		System.out.println("your first number is= " + a);
		System.out.println("your second number is= " + b);

		System.out.println("Select one operator-(-,+,*,/,%)");
		String opr = sc.next();

		switch (opr) {
		case "+":
			System.out.println("result: " + (a + b));
			break;

		case "-":
			System.out.println("result: " + (a - b));
			break;

		case "*":
			System.out.println("result: " + (a * b));
			break;

		case "/":
			System.out.println("result: " + (a / b));
			break;

		case "%":
			System.out.println("result: " + (a % b));
			break;

		default:
			System.out.println("Invalid input");

		}
		sc.close();

	}
}
