package main.string_Programs_Apoorv;


import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicate_String_With_Collection_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String Str=remove_Duplicates("Helloe");
   System.out.println(Str);
	}
   public static String remove_Duplicates(String Str) {
	   
	   Set<Character> st= new TreeSet<>();
	   String Str1= "";
	  
	   for(int i=0;i<Str.length();i++)
	   {
		   st.add(Str.charAt(i));
		   
	   }
	   for(Character c: st)
	   {
		   Str1= Str1+c;
	   }
	   return Str1;
   }
}
