package in.note.learn.stringclass;

import java.util.Scanner;

public class RevStringUserDefine {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("write your mess here- ");
    String mess = sc.nextLine();
    String rev = " ";
    
    for(int i=mess.length()-1; i>=0; i--) {
    	rev=rev+mess.charAt(i);
    }
    System.out.println("Reverse String = "+rev );
	}
}
