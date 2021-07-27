package programs_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Cake_HackkerRank_Max_Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0, count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			max = arr[0];
			for (int j = 0; j < i; j++) {
				if (arr[j] >= arr[i]) {
					max = arr[j];
				}
			}
			if (arr[i] == max) {
				count++;
			}
		}

		System.out.println(count);
	}

}
