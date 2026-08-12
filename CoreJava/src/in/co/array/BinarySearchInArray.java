package in.co.array;

public class BinarySearchInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int search = 40;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[mid]==search) {
				 System.out.println("Element found at index: " + mid);
			        break;
			    } else if (search > arr[mid]) {
			        low = mid + 1;
			    } else {
			        high = mid - 1;
			}
		}

	}
}
