package programs_Java;

import java.util.Scanner;

public class Prime_Numbr_Check {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		Boolean flag = true;
		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}
	}

}
