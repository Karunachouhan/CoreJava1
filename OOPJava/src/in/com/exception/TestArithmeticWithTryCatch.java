package in.com.exception;

public class TestArithmeticWithTryCatch {
	// syntax
	/*
	 * try { code }catch(exceptionType obj) { print error message }
	 */

	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		try {
			int div = b / a;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("exception: " + e.getMessage());
			System.out.println();
		}
		System.out.println("program is finished");
	}

}
