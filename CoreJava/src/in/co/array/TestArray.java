package in.co.array;

public class TestArray {
	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;
		a[5] = 12;
		a[6] = 14;
		a[7] = 16;
		a[8] = 18;
		a[9] = 20;
		System.out.println(a[5]);
		System.out.println("------------------------");

		for (int b : a) {
			System.out.println(b);
		}
	}
}
