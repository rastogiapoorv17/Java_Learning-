package main.string_Programs_Apoorv;

public class Capitalize_FirstLetter_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String Str=capital_first_Letter("My Name is Apoorv");
  System.out.println(Str);
	}
public static String capital_first_Letter(String Str)
{
	String Str1= Str.toLowerCase();
	String Str2[] = Str1.split(" ");
    char[] ch=new char[Str1.length()];
    String Str3="";
   for(int i=0;i<Str2.length;i++)
   {
	
	   ch[i]=Str2[i].charAt(0);
	   Str3= Str3+ " " +ch[i];
	   
	   
   }
   
   return Str3.toUpperCase();
   
}
}
