package programs_Java;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not Perfect");
		}
	}
}
