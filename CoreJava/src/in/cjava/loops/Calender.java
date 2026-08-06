package in.cjava.loops;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthday month: ");
		String month = sc.nextLine();

		switch (month) {
		case "January":
			System.out.println("This is the first month of the year,happy birthday!!!");
			break;

		case "February":
			System.out.println("This is the second month of the year,happy birthday!!!");
			break;

		case "March":
			System.out.println("This is the third month of the year,happy birthday!!!");
			break;

		case "April":
			System.out.println("This is the fourth month of the year,happy birthday!!!");
			break;

		case "May":
			System.out.println("This is the fifth month of the year,happy birthday!!!");
			break;

		case "June":
			System.out.println("This is the sixth month of the year,happy birthday!!!");
			break;

		case "July":
			System.out.println("This is the seventh month of the year,happy birthday!!!");
			break;

		case "August":
			System.out.println("This is the eighth month of the year,happy birthday!!!");
			break;

		case "September":
			System.out.println("This is the ninth month of the year,happy birthday!!!");
			break;

		case "October":
			System.out.println("This is the tenth month of the year,happy birthday!!!");
			break;

		case "November":
			System.out.println("This is the eleventh month of the year,happy birthday!!!");
			break;

		case "December":
			System.out.println("This is the twelth month of the year,happy birthday!!!");
			break;

			default :
				System.out.println("Invalid number");
		}
		 sc.close();
	}
}
