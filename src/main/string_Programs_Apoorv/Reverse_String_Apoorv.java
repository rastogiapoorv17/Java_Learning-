package main.string_Programs_Apoorv;



public class Reverse_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String Str=reverse("Apoorv");
     System.out.println("Reverser of String is" + Str);
	}
public static String reverse(String Str)
{
	char[] ch= Str.toCharArray();
	String Str2="";
	for(int i=ch.length-1; i>=0;i--) {
		Str2= Str2+ch[i];
	}
	System.out.println(Str2);
	return Str2;
}

}
