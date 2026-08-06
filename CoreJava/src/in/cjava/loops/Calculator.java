package in.cjava.loops;

public class Calculator {
	public static void main(String[] args) {
		int a = 12;
		int b = 4;
		String opr = "+";

		switch (opr) {
		case "+":
			System.out.println("Sum of =" + (a + b));
			break;

		case "-":
			System.out.println("Sub is =" + (a - b));
			break;

		case "*":
			System.out.println("Multiplication is =" + (a * b));
			break;

		case "/":
			System.out.println("Division is =" + (a / b));
			break;

		default:
			System.out.println("invalid");
		}
	}
}
