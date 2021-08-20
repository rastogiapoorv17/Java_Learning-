package Lavnya.String;

import java.util.Arrays;

public class CheckIfStringHaveAllUniquechar_withoutSet {

    public static boolean isUniqueString(String str)
    {
        boolean isUnique=true;
        char[] arr= str.toLowerCase().toCharArray();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                isUnique=false;
                break;
            }
        }


        return  isUnique;
    }

    public static void main(String[] args) {
        System.out.println(CheckIfStringHaveAllUniquechar_withoutSet.isUniqueString("hit"));

    }
}
