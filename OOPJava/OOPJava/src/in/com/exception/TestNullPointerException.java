package in.com.exception;

public class TestNullPointerException {
	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println("Length: " + name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
