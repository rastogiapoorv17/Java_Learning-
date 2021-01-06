package Lavnya.String;

import java.util.Arrays;

public class NumberOfOccuanceOfEachchar_withoutMap_Lavnya {

    public static void getnumberOfOccurance(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int count = 1;
       String s="";



        for (int i = 0; i < arr.length - 1; i++) {
            count = 1;

            if(!s.contains(""+arr[i]))
            {
                s=s+arr[i];

            }

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] )
                {
                    count++;
                }
            }


            if(!s.contains(""+arr[i]))
            {
                System.out.println(arr[i]+":"+count);

            }



        }

    }

    public static void main(String[] args) {

        NumberOfOccuanceOfEachchar_withoutMap_Lavnya.getnumberOfOccurance("hellooheh");

    }
}
