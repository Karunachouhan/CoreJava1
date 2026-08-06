package in.exercise.question;

import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		int num, rev;
		System.out.println("Enter a number- ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num>0) {
			rev = num%10;
			System.out.print(rev);
			num = num/10;
		}
	}
}
