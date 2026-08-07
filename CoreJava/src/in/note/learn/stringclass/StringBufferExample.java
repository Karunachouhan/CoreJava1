//string buffer:- mutual ( object cannot be changed)
// slower then string builder
// thread safe(synchronized)
//legacy class (old class )

package in.note.learn.stringclass;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay");

		System.out.println(sb);

		sb.append(" Dinanath Chouhan"); // Value added to the end
		System.out.println(sb);
	}
}
