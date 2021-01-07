package main.string_Programs_Apoorv;

public class Print_FirstLetter_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  first_Letter("My Name is Apoorv");
	}
public static void first_Letter(String Str)
{
	String Str1= Str.toLowerCase();
	String Str2[] = Str1.split(" ");
   
   for(int i=0;i<Str2.length;i++)
   {
	   
	   System.out.println(Str2[i].charAt(0));
   }
}
}
