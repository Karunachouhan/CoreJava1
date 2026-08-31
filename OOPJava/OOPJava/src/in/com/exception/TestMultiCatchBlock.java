package in.com.exception;

public class TestMultiCatchBlock {

	public static void main(String[] args) {

		String name = "rays";

		try {
			System.out.println("Length: "+name.length());
			System.out.println(name.charAt(5));
		} catch (NullPointerException e) {
			System.out.println("exception 1 : " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("exception 2 : " + e.getMessage());
		}
	}

}
