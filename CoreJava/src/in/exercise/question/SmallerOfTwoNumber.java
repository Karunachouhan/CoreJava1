package in.exercise.question;

import java.util.Scanner;

public class SmallerOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int a = sc.nextInt();
		System.out.println("Enter second number:- ");
		int b = sc.nextInt();
		
		if(a<b) {
			System.out.println("a is smaller then b");
		}else {
			System.out.println("b is smaller then a");
		}
	}
}
