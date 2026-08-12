package in.co.array;

public class LinearSearchInArray {
   public static void main(String[] args) {
	   int[] numbers = {23,5,46,7,54,3,23};
	   int search = 54;
	   for(int i = 0; i<numbers.length; i++) {
		   if(numbers[i]==search) {
			   System.out.println("Elements found at index- "+i);
			   break;
		   }
	   }
	   
   }
}
