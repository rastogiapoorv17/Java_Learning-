package Lavnya.String;

public class ReverseAString {

    public static String getReverseString(String str)
    {
        String newStr="";

        for (int i=str.length()-1;i>=0;i--)
        {

            newStr=newStr+str.charAt(i);
        }


        return newStr;
    }

    public static void main(String[] args) {
        System.out.println( ReverseAString.getReverseString("Hello"));

    }
}
