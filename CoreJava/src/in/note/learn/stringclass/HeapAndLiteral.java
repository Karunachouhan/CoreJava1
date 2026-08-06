package in.note.learn.stringclass;

public class HeapAndLiteral {
    public  static void main(String[] agrs) {
    	String name = "java";
    	String name1 = "java";
    	System.out.println(name == name1);
    	
    	String name2 = new String("java");
    	String name3 = new String("java");
    	System.out.println(name2 == name3);
    	
    	System.out.println(name2.equals(name3));
    }
}
