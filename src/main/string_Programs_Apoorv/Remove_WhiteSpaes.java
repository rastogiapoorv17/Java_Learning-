package main.string_Programs_Apoorv;

public class Remove_WhiteSpaes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removespace rem= new Removespaceimplementation();
		rem.removewhitespace("apoorv  is my Name ");
	}
}
abstract class Removespace{
	public abstract void removewhitespace(String Str);
}

class Removespaceimplementation extends Removespace
{

	@Override
	public void removewhitespace(String Str) {
		// TODO Auto-generated method stub
		/*
		 * String Str1[]= Str.split(" ");
		 * 
		 * for(int i=0;i<=Str1.length-1;i++) {
		 * 
		 * System.out.print(Str1[i]); }
		 */
		char[] ch=Str.toCharArray();
		String Str1="";
		for(char arr:ch)
		{
			if(arr!=' ')
			{
				Str1=Str1+arr;
			}
		}
		System.out.println(Str1);
		
	}
	
}

