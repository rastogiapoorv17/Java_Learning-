package Lavnya.String;

public class LargestwordOfAString {

    public static void getLargestword(String str)
    {
        String[] arr= str.split("\\s+");
        String lWord="";
        int lWordLength=Integer.MIN_VALUE;
        int length=0;

        for(int i=0;i<arr.length;i++)
        {
            length=arr[i].length();

            if(length>lWordLength)
            {
               lWordLength=length;
               lWord=arr[i];
            }
        }

        System.out.println(lWord+"-"+lWordLength);


    }

    public static void main(String[] args) {
        LargestwordOfAString.getLargestword("hitrtrtrtrt there hellooo");
    }
}
