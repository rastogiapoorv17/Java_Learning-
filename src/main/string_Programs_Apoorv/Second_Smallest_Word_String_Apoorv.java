package main.string_Programs_Apoorv;

public class Second_Smallest_Word_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     second_Smallest("My Name is Apoorv");
	}
public static void second_Smallest(String Str)
{
	String Str1[]= Str.split(" ");
	int min ,temp=0,second=0;
	int[] arr= new int[Str.length()];
	for(int i=0;i<Str1.length;i++)
	{
		
		arr[i]=Str1[i].length();
		//System.out.println(arr[i]);
}
	for (int i=0;i<Str1.length;i++)
    {
		  min =i;
          for(int j=i+1;j<Str1.length;j++)
          {
         if(arr[j]<arr[min])
          {
              min=j;
          }
         }
          temp=arr[i];
          arr[i]=arr[min];
          arr[min]=temp;
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
