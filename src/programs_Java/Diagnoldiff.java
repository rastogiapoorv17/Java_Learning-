package programs_Java;

import java.io.*;
import java.util.*;

public class Diagnoldiff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
        Scanner scan = new Scanner(System.in);
      int lsum=0,rsum=0,diff=0;
   int N = scan.nextInt();
      
      int[][] arr = new int[3][3];
      for(int i=0;i<N;i++)
         {
             for(int j=0;j<N;j++)
             {
                 arr[i][j]= scan.nextInt();
             }
         }
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++){
                
                if(i==j)
                {
                   lsum=lsum+arr[i][j];
                }
                if((i+j)==2){
                    rsum=rsum+arr[i][j];
                }
            }
        }
        System.out.println(lsum);
        System.out.println(rsum);
        diff=Math.abs(rsum-lsum);
        System.out.println(diff);
        
    }
}