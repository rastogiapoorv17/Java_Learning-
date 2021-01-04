package main.string_Programs_Apoorv;

public class Duplicate_String_WithoutCollection_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String Str= "eApooravp";
     int count=0;
     char[] dup=Str.toUpperCase().toCharArray();
     for(int i=0;i<Str.length();i++)
     {
    	 for(int j=i+1;j<Str.length();j++)
     
     {
    	if(dup[i] == dup[j])
    	{
     System.out.println(dup[j] + " ");
        count++;
        
     }
    	
    	
     }
     }
     System.out.println("Total Duplicate is" +" " + count);
}
}