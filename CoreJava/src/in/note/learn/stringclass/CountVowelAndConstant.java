package in.note.learn.stringclass;

public class CountVowelAndConstant {
	public static void main(String[] args) {
		String s = "Karuna";

		int vowel = 0;
		int consonent = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonent++;
			}
		}
		System.out.println("Vowels = " + vowel);
		System.out.println("Consonants = " + consonent);
	}
}

