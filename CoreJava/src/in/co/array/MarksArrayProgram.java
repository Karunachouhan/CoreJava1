package in.co.array;

public class MarksArrayProgram {
	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 96;
		marks[1] = 92;
		marks[2] = 94;
		marks[3] = 90;
		marks[4] = 97;

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks are =" + marks[i]);
		}
	}
}
