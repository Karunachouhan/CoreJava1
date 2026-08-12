package in.co.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		System.out.println("---------------------------------------------------------------");
		
		String dob ="2005-05-17";
		System.out.println("DOB is = "+dob);
		
		
		Date d1 = sdf.parse(dob);
		
		System.out.println(d1);
	}
}
