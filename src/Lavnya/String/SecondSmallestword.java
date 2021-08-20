package Lavnya.String;

public class SecondSmallestword {


    public static void getSecondsmalles(String str)
    {
        String[] arr=str.split("\\s+");
        String sWord="";
        String ssWord="";
        int slength=0;
        int sslength=0;

        for (String val:arr
             ) {

            if(val.length()>slength)
            {
                sslength=slength;
                slength=val.length();
                ssWord=sWord;
                sWord=val;
            }

            if(val.length()>sslength && val.length()!=slength)
            {
                sslength=val.length();
                ssWord=val;
            }

        }

        System.out.println("smallest:-"+sWord+" sec smallest:-"+ssWord);
    }

    public static void main(String[] args) {
        SecondSmallestword.getSecondsmalles("hi there hel");
    }

}
