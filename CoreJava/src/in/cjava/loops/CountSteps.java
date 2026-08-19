package in.cjava.loops;
import java.util.Scanner;

public class CountSteps {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number- ");
	 int number = sc.nextInt();
	 int steps = 0;
	 
	 while(number!=0) {
		 if(number%2==0) {
			 number=number/2;
		 }else {
			 number=number-1;
		 }
		 steps++;
		 System.out.println("number - "+number);
	 }
	 System.out.println("total steps ="+steps);
 }
}
