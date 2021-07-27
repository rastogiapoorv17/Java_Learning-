package programs_Java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Count_Pairs_Array {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {

			ar[i] = sc.nextInt();
		}
        Arrays.sort(ar);
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = i+1; j <n; j++) {

				if (ar[i] == ar[j]) {
					count++;
					ar[i]='\0';
					ar[j]='\0';
				}
					if (count == 1) {
						count1++;
						count = 0;
					}
				
				
			}
		}

		System.out.println(count1);

	}
}
