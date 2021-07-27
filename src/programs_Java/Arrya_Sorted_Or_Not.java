package programs_Java;

public class Arrya_Sorted_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,62,43,4,5 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("Array is unsorted");
		}
		else
		{
			System.out.println("Array is sorted");
			
		}
	}

}
