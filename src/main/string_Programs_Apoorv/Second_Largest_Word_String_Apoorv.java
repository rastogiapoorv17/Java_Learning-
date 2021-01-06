package main.string_Programs_Apoorv;

public class Second_Largest_Word_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
second_Largest("My Name is Apoorv");
	}
	public static void second_Largest(String Str)
	{
		String Str1[]= Str.split(" ");
		int max ,temp=0,second=0;
		int[] arr= new int[Str.length()];
		for(int i=0;i<Str1.length;i++)
		{
			
			arr[i]=Str1[i].length();
			//System.out.println(arr[i]);
	}
		for (int i=0;i<Str1.length;i++)
	    {
			  max =i;
	          for(int j=i+1;j<Str1.length;j++)
	          {
	         if(arr[j]>arr[max])
	          {
	              max=j;
	          }
	         }
	          temp=arr[i];
	          arr[i]=arr[max];
	          arr[max]=temp;
	           //System.out.print(arr[i]+" ");
	           
	           second=arr[1];
	           
	        }
		for (int i=0;i<Str1.length;i++)
	    {
			if(Str1[i].length()==second)
		System.out.println(Str1[i]);
	    }
	}
}
