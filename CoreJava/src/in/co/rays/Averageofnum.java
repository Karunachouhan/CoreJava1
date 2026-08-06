package in.co.rays;
import java.util.Scanner;

public class Averageofnum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter first number:- ");
	a = sc.nextInt();
	System.out.println("Enter second number:- ");
	b = sc.nextInt();
	System.out.println("Enter third number:- ");
	c = sc.nextInt();
    double avg = (a+b+c)/3.0;
    System.out.println("Average of three numbers is :- " + avg);
}
}
