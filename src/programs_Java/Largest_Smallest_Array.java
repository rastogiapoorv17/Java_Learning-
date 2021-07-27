package programs_Java;

public class Largest_Smallest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 91, 98, 87, 1, 32 };
		int smallest = 0;
		int largest=0;
		for (int i = 0; i < arr.length; i++) {
			smallest = arr[0];
			largest=arr[0];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] <= smallest) {
					smallest = arr[j];

				}
				if(arr[j] >= largest) {
					largest = arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallest) {
				System.out.println("Smallest: " + arr[i] + " And index is " + i);
			}
			if (arr[i] == largest) {
				System.out.println("Largest : " + arr[i] + " And index is " + i);
			}
		}
	}

}
