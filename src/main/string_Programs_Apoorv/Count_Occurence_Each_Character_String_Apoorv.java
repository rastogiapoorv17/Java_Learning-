package main.string_Programs_Apoorv;

public class Count_Occurence_Each_Character_String_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    occurence("My Name is Apoorv");
	}
   public static void occurence(String Str)
   {
	   char[] arr= Str.toLowerCase().toCharArray();
	   int[] count= new int[arr.length];
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   
		   count[i]=1; 
		   for(int j=i+1;j<arr.length;j++)
		   {
		   if(arr[i]==arr[j])
		   {
			   count[i]++;
			   arr[j]='0';
		   }
		   
		   }
		   
		 }
	  
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]!= ' ' && arr[i]!='0') {
		   System.out.println("Occurence of " + arr[i] +" is " + count[i]);
		   
		   }
		  
	   }
		   
		   
   }
}
	   
   

