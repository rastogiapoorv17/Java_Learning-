package Lavnya.String;


import java.util.LinkedHashSet;

public class RemoveDuplicateFromAGivenString_Set {

    public  static String removeduplicate(String str)
    {

        LinkedHashSet<Character> set= new LinkedHashSet<>();
        String newString="";

        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }

        for(Character c:set)
        {
            newString=newString+c;
        }

        return newString;
    }

    public static void main(String[] args) {
       String set= RemoveDuplicateFromAGivenString_Set.removeduplicate("Hellowe");

        System.out.println(set);
    }



}
