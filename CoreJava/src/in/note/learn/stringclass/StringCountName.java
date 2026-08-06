package in.note.learn.stringclass;

public class StringCountName {
	public static void main(String[] args) {
		String name = "google ";
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(c + "=" + count);
			}
		}
	}
}
