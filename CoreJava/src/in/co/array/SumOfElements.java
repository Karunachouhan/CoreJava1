package in.co.array;

public class SumOfElements {
  public static void main(String[] args) {
	  int[] arr = {10,20,30,40};
	  int sum = 0;
	  for(int i=0; i<arr.length; i++) {
		  sum = sum + arr[i];
	  }
	  System.out.println("Sum = "+sum);
  }
}
