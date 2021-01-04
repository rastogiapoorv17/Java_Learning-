package main.string_Programs_Apoorv;

public class Duplicate_Word_String_Apoorv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicate_word("Apoorv is very good and is very polite");
		
	}

	public static void duplicate_word(String Str) {

		String Str1= Str.toLowerCase();
		String words[]= Str1.split(" ");
		for(int i=0;i<words.length;i++)
		{
			int count = 1;
			for(int j= i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					//words[j]="0";
				}
			}
			if(count>1)
			{
				System.out.println(words[i]);
				
			}
		}
		
	}
}
