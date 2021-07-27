package programs_Java;

import java.util.Scanner;

public class Number_Sum_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		@SuppressWarnings("unused")
		int num,num1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entet the size of array");
		num=scanner.nextInt();
		int[] a= new int[num];
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<num;i++)
		{
			a[i]= scanner.nextInt();
		}
		System.out.println("Enter the number for which sum needs to be checked");
		num1= scanner.nextInt();
		Boolean flag = false;
		for(int j=0;j<num;j++)
		{
			for(int k=j;k<num;k++)
			{
				if(a[j]+a[k]==num1)
				{
					flag=true;
					System.out.println("Yes the sum of " + a[j] + " and " + a[k] + " is " + num1);
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("sum is not present");
		}
	}

}
