package programs_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long lsum = 0, rsum = 0, temp = 0;
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			lsum = lsum + arr[i];
		}
		for (int i = n - 1; i > 0; i--) {
			rsum = rsum + arr[i];
		}
		System.out.println(lsum + " " + rsum);

	}

}
