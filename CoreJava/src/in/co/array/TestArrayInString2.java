package in.co.array;

public class TestArrayInString2 {
	public static void main(String[] args) {
		String[] months = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };

		for (String str : months) {
			System.out.println(str);
		}
		System.out.println("------------------------------");
		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i] + " ");
		}
	}
}
