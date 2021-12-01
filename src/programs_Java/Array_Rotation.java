package programs_Java;

import java.io.*;
import java.util.*;
import java.lang.*;
 
class Array_Rotation
{
     
// Function count
// the operations

// Driver Code
public static void main(String[] args)
{
    int[] arr= {1,2,3,4,5};
    int d=2;
    int[] temp= new int[d];
    for(int i=0;i<d;i++) {
    	temp[i]=arr[i];
    	//System.out.println(temp[i]);
    }
    for(int i=d;i<arr.length;i++) {
    	arr[i-d]=arr[i];
    	//System.out.print(arr[i]+ " ");
    }
    for(int i=0;i<d;i++) {
    	
    		arr[i+arr.length-d]=temp[i];
    	
    }
    
   
    for(int i=0;i<arr.length;i++) {
    	    	System.out.print(arr[i]+ " ");
    }
	
}
}