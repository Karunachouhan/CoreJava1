package in.exercise.question;
import java.util.Scanner;

public class ArmstrongNumberUsrDefine {
 public static void main(String[] args) {
	 int num,sum=0,rem,temp;
	 System.out.println("Enter any number:- ");
	 Scanner sc =  new Scanner(System.in);
	 num = sc.nextInt();
	 temp=num;
	 
	 while(num>0) {
		 rem=num%10;
		 sum=sum+(rem*rem*rem);
		 num=num/10;
	 }
	 if(temp==sum) {
		 System.out.println("Armstrong number");
	 }else {
		 System.out.println("Not armstrong number");
	 }
 }
}
