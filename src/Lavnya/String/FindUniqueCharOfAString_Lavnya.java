package Lavnya.String;

import java.util.LinkedHashSet;

public class FindUniqueCharOfAString_Lavnya {

    public static String getUniqueCharOfString(String str)
    {
        LinkedHashSet<Character> set= new LinkedHashSet<>();
        String newstr="";
        char[] arr=str.toLowerCase().toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        for(Character c:set)
        {
            newstr=newstr+c;
        }

        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(FindUniqueCharOfAString_Lavnya.getUniqueCharOfString("helloegdgdho"));

    }
}
