package main.string_Programs_Apoorv;

public class Smallest_Word_Size_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 smallest_Word("My Name is Apoorv");
	}
	public static void smallest_Word(String Str) {
		
		String Str1[]=Str.split(" ");
		int smallest = 0;
		for(int i=0;i<Str1.length;i++)
		{	
			int b= Str1[i].length();
			smallest= Str1[0].length();
		//System.out.println(Str1[i].length());
			if(b<=smallest)
			{
			smallest=Str1[i].length();	
			
			
			}	
			
		}		
		
		System.out.println("Smallest word size is " +smallest);
		
		
	}

}
