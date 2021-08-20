package Lavnya.String;

import java.util.HashSet;

public class CheckIfStringHaveallUniqueChar_Set_Lavnya {

    public static boolean checkIfUnique(String str)
    {
        Boolean isUnuque=true;
        char[] arr= str.toCharArray();

        HashSet<Character> set= new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(set.add(arr[i]))
            {
                isUnuque=true;
            }

            else
            {
                isUnuque=false;
                break;
            }
        }


        return isUnuque;
    }

    public static void main(String[] args) {
        System.out.println(CheckIfStringHaveallUniqueChar_Set_Lavnya.checkIfUnique("helo"));
    }
}
