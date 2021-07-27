package main.string_Programs_Apoorv;

import java.util.Scanner;

public class Second_highest_frequently_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String Str= scan.nextLine();
		String[] Str1= Str.split(" ");
		int[] count= new int[Str.length()];
		for(int i=0;i<Str1.length;i++) {
			count[i]=1;
			for(int j=1;j<Str1.length;j++) {
				if(Str1[i].equalsIgnoreCase(Str1[j]))
				{
					count[i]++;
					Str1[j]= " ";
				}
			}
			
		}
		for(int i=0;i<Str1.length;i++) {
			System.out.println(count[i]);
		}
	}

}
