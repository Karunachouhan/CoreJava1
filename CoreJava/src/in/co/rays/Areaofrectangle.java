package in.co.rays;
import java.util.Scanner;

public class Areaofrectangle {
   public static void main(String[] args) {
	   int len,bre,area;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter length:- ");
	   len = sc.nextInt();
	   System.out.print("Enter breadth:- ");
	   bre = sc.nextInt();
	   area = len*bre;
	   System.out.println("Area of rectangle:- "+ area);
   
   }
}
