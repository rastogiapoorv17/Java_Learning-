package programs_Java;

import java.util.Scanner;

public class Roundoff_Problem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		  arr[i]=in.nextInt();
		  int rem=arr[i]%5;
		  //System.out.println("Remainder" +rem);
		  if((arr[i]>=38) && (rem>=3)){
		      arr[i]=arr[i]+(5-rem);

		  }
		        
		}
		
		for(int i=0;i<n;i++){
		  
		System.out.println(arr[i]);
		}
		}
}
