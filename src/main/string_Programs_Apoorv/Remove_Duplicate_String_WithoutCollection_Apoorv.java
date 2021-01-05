package main.string_Programs_Apoorv;

public class Remove_Duplicate_String_WithoutCollection_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicate_String_WithoutCollection_Apoorv rem = new Remove_Duplicate_String_WithoutCollection_Apoorv();
    String newString= rem.RemoveDuplicate("EApoorv");
      System.out.println(newString);
	}
public String RemoveDuplicate(String Str)
{
	
	String Str1="";
    char[] dup=Str.toUpperCase().toCharArray();
    int count=0;
    for(int i=0;i<dup.length-1;i++)
    {
    	 count=0;
   	 for(int j=i+1;j<dup.length;j++)
    
    {
   	if(dup[i] == dup[j])
   	{
         count++;
       
   	}   	
    }
   	
  if(count<=0)
  {
	  Str1=Str1+dup[i];
  }
}
    return Str1;
}
}
