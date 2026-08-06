package in.cjava.loops;

import java.util.Scanner;

public class ArmstrongIfElse {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number = ");
     int num = sc.nextInt();
     int rem = 0;
     int sum = 0;
     int temp = num;
      
     while(num>0) {
    	 rem = num % 10;
    	 sum = sum + (rem*rem*rem);
    	 num = num/10;
     }
     
     if(temp==sum) {
    	 System.out.println("Amstrong number");
     }else {
    	 System.out.println("Not amstrong number");
     }
     sc.close();
	}
}
