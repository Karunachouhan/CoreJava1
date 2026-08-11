package in.co.array;

import java.util.Scanner;

public class LinearSearchUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size = ");
		int size = sc.nextInt();
		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter value of x = ");
		int x = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				System.out.println("x found at indexvalue= " + i);
			}
		}
	}
}
