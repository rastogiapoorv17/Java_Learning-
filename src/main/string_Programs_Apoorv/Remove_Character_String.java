package main.string_Programs_Apoorv;

public class Remove_Character_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   remove("Programming", 'm');
	}
	public static void remove(String Str, char ch)
	{
		char[] arr= Str.toLowerCase().toCharArray();
		String Str1="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch) {
				arr[i]='\0' ;
								
			}
			
			Str1=Str1+arr[i];
		}
		
		char[] arr2= Str1.toCharArray();
		String Str3="";
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]!='\0') {
				Str3=Str3+arr2[i];
			}
	}
		System.out.println(Str3);
	}

}
