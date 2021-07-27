package main.string_Programs_Apoorv;

import java.util.Scanner;

public class String_Seprater_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String_Seprater_Program obj= new String_Seprater_Program();
		obj.Seperator();
	}
	
	public void Seperator()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String Str= sc.nextLine();
		String[] Str1= Str.split("\" ", 3);
		
		for(int i=0;i<Str1.length-1;i++)
		{
		System.out.println(Str1[i]);
	
		}
		
	}

}
