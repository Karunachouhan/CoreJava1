package in.co.array;

public class FindMaxThroughArray {
  public static void main(String[] args) {
	  int[] arr ={10,20,30,45,87,90,56,4};
	  int max = arr[0];
	  for(int i = 1; i<arr.length; i++) {
		  if(arr[i]>max) {
			  max=arr[i];
		  }
	  }
	  System.out.println("Maximum number is = "+max);
  }
}
