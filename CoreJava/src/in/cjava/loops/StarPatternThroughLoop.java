package in.cjava.loops;

public class StarPatternThroughLoop {
	public static void main(String[] args) {
		
		//for(int i=1; i<=5; i++) for real triangle
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
