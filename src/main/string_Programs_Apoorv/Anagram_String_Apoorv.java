package main.string_Programs_Apoorv;

import java.util.Arrays;

public class Anagram_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String Str1="Tony";
    String Str2="Noty";
    if(Str1.length()==Str2.length())
    {
		anagram(Str1, Str2);
    }
    else if(Str1.length()!=Str2.length())
    {
    	System.out.println("Not Anagram");
    }		 
	}
	
	
	public static void anagram(String Str1, String Str2)
	{
		char[] ana1= Str1.toUpperCase().toCharArray();
		Arrays.sort(ana1);
		char[] ana2= Str2.toUpperCase().toCharArray();
		Arrays.sort(ana2);
	    String Str3="";
	    String Str4= "";
	    
	    for(int i=0;i<ana1.length;i++)
	    {
	    	Str3= Str3+ana1[i];
	    	Str4=Str4+ana2[i];
	    	
	    	
	    }
		    
		if(Str3.equalsIgnoreCase(Str4))
    	{
    		System.out.println("Anagram");
    		
    	}
    	else 
    	{
    		System.out.println("Not Anagram");
    		
    	}
				
		
	}

}
