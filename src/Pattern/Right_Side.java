package Pattern;

import java.util.Scanner;

public class Right_Side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("#");
			}
			System.out.println("");
		}
	}
}


