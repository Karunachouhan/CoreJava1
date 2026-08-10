package in.note.learn.stringclass;

public class CountAccurance {
 public static void main(String[] args) {
	 String str = "happy";
	 int count = 0;
	 char ch ='p';
	 
	 for(int i = 0; i<str.length(); i++) {
		 if(ch==str.charAt(i)) {
			 count++;
		 }
	 }
	 System.out.println("p-"+count);
 }
}
