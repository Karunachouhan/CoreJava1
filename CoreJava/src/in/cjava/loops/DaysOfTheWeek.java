package in.cjava.loops;

public class DaysOfTheWeek {
	public static void main(String[] args) {
		String day = "Friday";
		switch (day) {
		case "Monday":
			System.out.println("First day of the week");
			break;
		case "Tuesday":
			System.out.println("Second day of the week");
			break;
		case "Wednesday":
			System.out.println("Third day of the week");
			break;
		case "Thursday":
			System.out.println("Fourth day of the week");
			break;
		case "Friday":
			System.out.println("Fifth day of the week");
			break;
		case "Saturday":
			System.out.println("Sixth day of the week");
			break;
		default:
			System.out.println("Today is sunday");
		}
	}
}
