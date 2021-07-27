package main.string_Programs_Apoorv;

import java.util.Arrays;

public class Unique_Characters_Check_String_Without_Collection_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean uniq= unique("namen");
		  if(uniq==true)
		  {
			  System.out.println("String has unique character");
		  }
		  else {
		      System.out.println("String has not unique character");
		  }
	}
 public static Boolean unique(String Str) {
	
	 Boolean unique=true;
	 char[] arr= Str.toLowerCase().toCharArray();
	 Arrays.sort(arr);
	 for(int i=0;i<arr.length-1;i++)
	 {
		 
			 if(arr[i]==arr[i+1]) {
				 unique=false;
				 break;
			 
			
		 }
	 }
	return unique;
			 
 }
}
