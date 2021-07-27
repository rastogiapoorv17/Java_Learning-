package main.string_Programs_Apoorv;


import java.util.LinkedHashSet;


public class Unique_Character_With_Collections_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   uniquue("My Name is Apoorv");
	}
public static void uniquue(String Str)
{
	LinkedHashSet<Character> set= new LinkedHashSet<>();
	String Str1="";
	char arr[] =Str.toLowerCase().toCharArray();	
	for(int i=0;i<arr.length;i++)
    {
        set.add(arr[i]);
    }
	for(Character C:set)
	{
	Str1=Str1+ C;
	
	}
	System.out.println(Str1);
	
}
}
