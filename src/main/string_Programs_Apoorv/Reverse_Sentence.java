package main.string_Programs_Apoorv;

public class Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Reverse_Sentence.reverse("My Name is Apoorv");
	}

	public static void reverse(String Str) {
	
		String[] Str1= Str.split(" ");
		
		for(int i=Str1.length-1;i>=0;i--)
		{
			System.out.print(Str1[i] +" ");
		}
	}
}
