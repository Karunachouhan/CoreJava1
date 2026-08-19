package in.co.array;

public class MinThroughArray {
	public static void main(String[] args) {
	 int[] arr = {23,45,6,78,98,9,78,56,2};
	 int min = arr[0];
	 
	 for(int i = 1;i<arr.length;i++) {
		 if(arr[i]<min) {
			 min = arr[i];
		 }
	 }
	 System.out.println("Minimum = "+min);
 }
}
