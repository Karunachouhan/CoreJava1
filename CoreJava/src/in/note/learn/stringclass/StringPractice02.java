package in.note.learn.stringclass;

public class StringPractice02 {
      public static void main(String[] args) {
    	  String mess = "hello";
    	  String rev = " ";
    	  for(int i = mess.length()-1; i>=0; i--) {
    		  rev = rev+mess.charAt(i);
    	  }
    	  System.out.println("stored in original string = "+mess);
    	  System.out.println("stored in reversed string = "+rev);
      }
}
