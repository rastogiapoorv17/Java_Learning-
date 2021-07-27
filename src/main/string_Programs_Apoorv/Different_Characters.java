package main.string_Programs_Apoorv;

public class Different_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		character("apopkl^&^&^&^7676767");
	}
	
	public static void character(String Str)
	{
		char[] arr= Str.toCharArray();
		String ch="";
		String digit="";
		String spl="";
		for(char a: arr)
		{
			if((a>='a' && a<='z') || (a>'A' && a<'Z'))
			{
				ch=ch+a;
			}
			else if((a>='0' && a<='9'))
			{
				digit=digit+a;
			}
			else
			{
				spl=spl+a;
			}
		}
		System.out.println("Characters are " +ch + " and total characters are " + ch.length());
		System.out.println("Numbers are " +digit +" and total digits are " + digit.length());
		System.out.println("Special characters are "+spl + " and total special characters are "+ spl.length());
	}

}
