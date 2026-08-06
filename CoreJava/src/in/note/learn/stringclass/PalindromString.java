package in.note.learn.stringclass;

public class PalindromString {
	public static void main(String[] args) {
		String name = "kanak";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		
		if(name.equals(rev)) {
			System.out.println("its palindrom");
		}else {
			System.out.println("its not palindrom");
		}
		

}}