package programs_Java;

import java.util.Scanner;

public class Duplicate_Array {
	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
		//int[] dup = new int[3];
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * @SuppressWarnings("resource") Scanner sc= new Scanner(System.in); arr[i]=
		 * sc.nextInt();
		 * 
		 * }
		 */
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate value is "+arr[i]);
				}
			}
		}

	}

}
