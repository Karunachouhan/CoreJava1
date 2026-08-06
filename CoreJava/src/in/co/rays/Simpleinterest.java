package in.co.rays;
import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double p,r,t,si;
    	System.out.println("Enter principle value:- ");
    	p = sc.nextDouble();
    	System.out.println("Enter rate of interest:- ");
    	r = sc.nextDouble();
    	System.out.println("Enter time:- ");
    	t = sc.nextDouble();
    	si = (p*r*t)/100;
    	System.out.println("Simple interest is:- "+si);
    
    }
}
