package main.string_Programs_Apoorv;

public class Vowel_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vowel("My Name is Apoorv");
	}
	public static void vowel(String Str) {
		
		char[] ch= Str.toLowerCase().toCharArray();
		char[] chv= {'a','e','i','o','u'};
		
		int count=0;
		for(int i=0;i<chv.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(chv[i]==ch[j])
				{
					count++;
				}
				
			}
			System.out.println("count of " + chv[i] + " is "+ count);
			count=0;
		}
		
		
	}

}
