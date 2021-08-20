package Lavnya.String;

public class CountNumberOfWordsOFAStringAndLengthOFEachword {

    public static void getCount(String str)
    {
        int size=0;

        String[] arr=str.split("\\s+");

        size=arr.length;

        System.out.println("Total number of words:-"+size);
        for(int i=0;i<size;i++)
        {

            System.out.println(arr[i]+"-"+arr[i].length());
        }



    }




    public static void main(String[] args) {
        CountNumberOfWordsOFAStringAndLengthOFEachword.getCount("hi there hwllo  test");

    }
}
