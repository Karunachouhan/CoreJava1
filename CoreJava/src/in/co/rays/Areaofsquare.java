package in.co.rays;
import java.util.Scanner;

public class Areaofsquare {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a,b,side;
	   System.out.println("Enter first side of square:- ");
	   a = sc.nextInt();
	   System.out.println("Enter second side of square:- ");
	   b = sc.nextInt();
	   side = a*b;
	   System.out.println("Area of square:- "+side);
   }  
}
