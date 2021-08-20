package Lavnya.String;

public class SmallestWordOfAString {

    public static void getSmallet(String str)
    {
        int sWordLength=Integer.MAX_VALUE;
        String sWord="";
        int length=0;
        String[] arr=str.split("\\s+");

        for(int i=0;i<arr.length;i++)
        {
            length=arr[i].length();

            if(length<sWordLength)
            {
                sWord=arr[i];
                sWordLength=length;
            }

        }

        System.out.println(sWord+"-"+sWordLength);

    }

    public static void main(String[] args) {
        SmallestWordOfAString.getSmallet("he ite yryry tiyi");
    }
}
