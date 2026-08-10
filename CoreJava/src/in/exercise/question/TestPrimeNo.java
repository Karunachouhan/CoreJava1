
//jis number ke exactly 2 factors hote hai - 1 or khud number

package in.exercise.question;

import java.util.Scanner;

public class TestPrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}
}
