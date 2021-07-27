package programs_Java;

import java.util.Scanner;

public class Proprotion_Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        double pp=0.0;
        double pn= 0.0;
        double pz=0.0; 
        double cp=0,cn=0,cz=0;
         int n = scan.nextInt();
      int[] arr= new int[n];
      for(int i=0;i<n;i++){
          arr[i]= scan.nextInt();
      }
      for(int i=0;i<n;i++){
         
         if(arr[i]>0){
             cp++;
         }
         else if(arr[i]<0)
         {
             cn++;
         }
         else
         {
             cz++;
         }
      }
      System.out.println(cp);
      System.out.println(cn);
      System.out.println(cz);
      pp=cp/n;
      pn= cn/n;
      pz=cz/n;
      
      System.out.println(pp);
      System.out.println(pn);
      System.out.println(pz);
      	
	}

}
