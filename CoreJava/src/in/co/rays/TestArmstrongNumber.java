package in.co.rays;

public class TestArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 152;
		int rem = 0;
		int sum = 0;
		int n = number;
		
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
			
		}
		
		if (number == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println(" Not Armstrong number");
		}
	}
}
