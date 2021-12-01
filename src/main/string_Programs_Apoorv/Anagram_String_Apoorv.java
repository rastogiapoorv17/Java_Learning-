package main.string_Programs_Apoorv;

import java.util.Scanner;

public class Anagram_String_Apoorv {

    public static boolean isAnagram(String a, String b) {
        // Complete the function
    	boolean flag=false;
    	
        char[] ana1= a.toUpperCase().toCharArray();
        
        char[] ana2= b.toUpperCase().toCharArray();
        
        
         char temp='\0';
         if(a.length()!=b.length()) {
     		flag=false;
     		
     	}
         else {
        for(int i=0;i<ana1.length;i++){
            
            for(int j=0;j<ana1.length;j++){
                
                if(ana1[i]>ana1[j]) {
                  temp=ana1[i];
                  ana1[i]=ana1[j];
                  ana1[j]=temp;
                  
              }
            }
        }
 for(int i=0;i<ana2.length;i++){
            
            for(int j=0;j<ana2.length;j++){
                
                if(ana2[i]>ana2[j]) {
                  temp=ana2[i];
                  ana2[i]=ana2[j];
                  ana2[j]=temp;
                  
              }
            }
        }
         String Str3="";
        String Str4= "";
        
        for(int i=0;i<ana1.length;i++)
        {
            Str3= Str3+ana1[i];
            Str4=Str4+ana2[i];
            
            
        }
            
        
        if(Str3.equalsIgnoreCase(Str4)){
            flag=true;
        }
         }
        return flag;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}