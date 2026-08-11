package in.co.array;

import java.util.Scanner;

public class UserDefineArray {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size:- ");
    	int size = sc.nextInt();
    	int numbers[] = new int[size];
    	
    	//input
    	for(int i = 0; i<size; i++) {
    		System.out.println("Enter number:-");
    		numbers[i]=sc.nextInt();
    	}
    	 //output:-
    	for(int i = 0; i<size; i++) {
    		System.out.println("Given numbers are = "+numbers[i]);
    		
    	}
    	
    }
}
