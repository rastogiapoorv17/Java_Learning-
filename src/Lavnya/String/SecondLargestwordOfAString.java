package Lavnya.String;

public class SecondLargestwordOfAString {


    public static void getSecondLargest(String str) {

        String[] arr = str.split("\\s+");

        String lWord = "";
        String sword = "";
        int lLength = 0;
        int sLength = 0;


        for (String val : arr
        ) {

            if (val.length() > lLength) {
                sLength = lLength;
                lLength = val.length();
                sword = lWord;
                lWord = val;

            }

            if (val.length() > sLength && val.length() != lLength) {
                sLength = val.length();
                sword = val;
            }


        }

        System.out.println("largest:-" + lWord + " sword-" + sword);

    }


    public static void main(String[] args) {

        SecondLargestwordOfAString.getSecondLargest("hi helloo there hel");
    }
}
