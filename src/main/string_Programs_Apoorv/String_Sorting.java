package main.string_Programs_Apoorv;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
      System.out.println("Enter a string: ");
      String Str= sc.nextLine();
      String Str1="";
      char[] arr= Str.toCharArray();
      
     // Arrays.sort(arr);
      char temp='\0';
      for(int i=0;i<arr.length;i++) {
    	  
    	  for(int j=i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]>arr[j]) {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    			  
    		  }
    	  }
      }
      
      for(int i=0;i<arr.length;i++)
      {
    	  Str1= Str1+arr[i];
      }
      System.out.println(Str1);
	}

}
