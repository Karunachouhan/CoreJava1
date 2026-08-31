package in.com.exception;

public class TestParentCatchBlock {
	public static void main(String[] args) {

		String name = "rays";

		try {
			System.out.println("length: " + name.length());
			System.out.println("Character at: " + name.charAt(4));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
