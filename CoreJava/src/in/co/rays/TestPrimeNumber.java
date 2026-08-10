
package in.co.rays;

public class TestPrimeNumber {

	public static void main(String[] args) {

		int number = 7;
		int count = 0;

		for (int i = 2; i < number ; i++) {
			if (number % i == 0) {
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}

}
