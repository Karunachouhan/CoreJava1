package in.co.array;

public class TestArrayInChar {
	public static void main(String[] args) {
		char[] name = new char[6];
		name[0] = 'k';
		name[1] = 'a';
		name[2] = 'r';
		name[3] = 'u';
		name[4] = 'n';
		name[5] = 'a';

		for (char ch : name) {
			System.out.print(ch);

		}
		System.out.println();
		System.out.println("----------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"="+ i);
		}
	}
}
