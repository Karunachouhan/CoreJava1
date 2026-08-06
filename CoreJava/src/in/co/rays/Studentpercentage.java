package in.co.rays;
import java.util.Scanner;

public class Studentpercentage {
       public static void main(String[] args) {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   int eng,hindi,maths,physic,chem;
    	   
    	   System.out.println("Enter marks of english:- ");
    	   eng = sc.nextInt();
    	   System.out.println("Enter marks of hindi:- ");
    	   hindi = sc.nextInt();
    	   System.out.println("Enter marks of maths:- ");
    	   maths = sc.nextInt();
    	   System.out.println("Enter marks of physics:- ");
    	   physic = sc.nextInt();
    	   System.out.println("Enter marks of chemistry:- ");
    	   chem = sc.nextInt();
    	   
    	   double total = eng+hindi+maths+physic+chem;
    	   double per = (total/500)*100;
           System.out.println("percentage of given student board exam is:- " + per+"%");
       
       }
}
