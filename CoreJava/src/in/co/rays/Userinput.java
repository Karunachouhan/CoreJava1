package in.co.rays;
import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		System.out.print("Enter first number:-  ");
		a = sc.nextInt();
		System.out.print("Enter second number:-  ");
		b = sc.nextInt();
		sum = a+b;
		System.out.println("Sum of two numbers is: - "+sum);
		
	}
}