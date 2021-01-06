package main.string_Programs_Apoorv;

public class Largest_Word_String_Size_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      largest_Word("Apoorv : My Name is Apoorv");
	}
public static void largest_Word(String Str) {
		
	String Str1[]=Str.split(" ");
	int largest = 0;
	for(int i=0;i<Str1.length;i++)
	{	
		int b= Str1[i].length();
		largest= Str1[0].length();
	//System.out.println(Str1[i].length());
		if(b>=largest)
		{
			largest=Str1[i].length();	
		
		
		}	
		
	}	
	for(int i=0;i<Str1.length;i++)
	{
		if(Str1[i].length()==largest)
		{
			System.out.println("Largest word is " +Str1[i] + " And its size is " + largest);
		}
      	}
}
}
