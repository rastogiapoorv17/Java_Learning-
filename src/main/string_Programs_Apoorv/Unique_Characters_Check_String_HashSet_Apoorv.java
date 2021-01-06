package main.string_Programs_Apoorv;

import java.util.HashSet;


public class Unique_Characters_Check_String_HashSet_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Boolean uniq= unique_check("name");
  if(uniq==true)
  {
	  System.out.println("String has unique character");
  }
  else {
      System.out.println("String has not unique character");
  }
	}
	public static boolean unique_check(String Str)
	{
		HashSet<Character> set= new HashSet<>();
		boolean unique =true;
		char arr[] =Str.toLowerCase().toCharArray();	
		for(int i=0;i<arr.length;i++)
	    {
	        if(set.add(arr[i])) {
	        	unique= true;
	        }
	   
	        else {
	        	unique=false;
	        	break;
	        }
	    } 
	    
		return unique;
		
		
		
	}
}
