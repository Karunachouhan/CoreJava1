package in.co.date;

import java.util.Scanner;
import java.util.Calendar;

public class PrintCalender {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter year- ");
	 int year = sc.nextInt();
	 
	 Calendar cal = Calendar.getInstance();
	 String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	  for(int month=0; month<months.length; month++) {
		  cal.set(year, month, 1);
		  System.out.println("\n----------------------"+months[month]+" "+year+"---------------------");
		  System.out.println("Sun Mon Tues Wed Thur Fri Sat");
		   
		  //first day of the month
		  int firstday = cal.get(Calendar.DAY_OF_WEEK);
		  
		  //print leading space
		  for(int i =Calendar.SUNDAY; i<firstday; i++) {
			  System.out.println(" ");
		  }
		  
		  //number of days in month
		  int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		  
		  //print dates
		  for(int day = 1; day <= maxDay; day++) {
			  System.out.printf("%3d ",day);
			  
			  if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				  System.out.println();
			  }
			  cal.add(Calendar.DAY_OF_MONTH,1);
		  }
		  System.out.println();
	  }
 }
}
