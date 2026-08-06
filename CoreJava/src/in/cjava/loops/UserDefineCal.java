package in.cjava.loops;

import java.util.Scanner;

public class UserDefineCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String command;
		System.out.println("Enter first value:- ");
		a = sc.nextInt();
		System.out.println("Enter second value:- ");
		b = sc.nextInt();
		System.out.println("You entered first value is =" + a);
		System.out.println("You entered second value is =" + b);
		System.out.println("Enter command");
		command = sc.next();
		
		switch (command) {
		case "+":
			System.out.println("Addition of this numbers is =" + (a + b));
			break;

		case "-":
			System.out.println("Subtraction of this number is =" + (a - b));
			break;

		case "*":
			System.out.println("Multiplication of this number is =" + (a * b));
			break;

		case "/":
			System.out.println("Division of this number is =" + (a / b));
			break;

		default:
			System.out.println("invalid input");
				   break;
		}
		sc.close();
	}
}
