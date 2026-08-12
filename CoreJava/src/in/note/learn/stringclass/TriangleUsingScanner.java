package in.note.learn.stringclass;
import java.util.Scanner;

public class TriangleUsingScanner {
 public static void main(String[] args) {
	 System.out.println("Enter size of triangle");
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   
   for(int i=num; i>=1; i--) {
	   for(int j=1; j<=i; j++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
 }
}
