package main.string_Programs_Apoorv;

public class Count_Number_Of_Words_Strings_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count=count_Words("My Name is Apoorv ");
     System.out.println(count);
	}

	public static int count_Words(String Str)
	{
	char[] arr= Str.toCharArray();
	int count =0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i] == ' '&&arr[i+1]!= ' ')
		{
			count++;
		}
	}
 count=count+1;
	return count;
	}
		
		/*
		 * String[] Str1= Str.split(" ");
		 * 
		 * return Str1.length;
		 */
}

