package in.co.rays;

public class TestReverseNumber {
       
	public static void main(String[] args) {
    	   
		int number = 152;
		int rem = 0;
		int sum = 0;
		int n = number; 
		
		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		
		System.out.println("Reverse number = " + sum);
       }
}
