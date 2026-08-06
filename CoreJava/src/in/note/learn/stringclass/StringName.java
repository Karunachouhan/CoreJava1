package in.note.learn.stringclass;

public class StringName {
	public static void main(String[] args) {
		String name = "google";
		char c = 'o';
		int count = 0;
		for (int i = 0; i< name.length(); i++) {
			if (c == name.charAt(i)) {
				count++;
			}
		}
		System.out.println("count - "+ count);
	}
}