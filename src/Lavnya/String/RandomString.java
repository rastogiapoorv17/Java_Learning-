package Lavnya.String;

import java.util.Random;

public class RandomString {

    public static String generateRandomString( int size)
    {

        //ASCII value of small letter alphabet
        int lowerLimt=97;
        int upperLimit=122;

        Random ran= new Random();

        StringBuilder st= new StringBuilder(size);

        for(int i=0;i<size;i++)
        {

            int randomVal=lowerLimt+(int)(ran.nextFloat()*(upperLimit-lowerLimt+1));
         st.append((char)randomVal);
        }

        return st.toString();

    }


    public static void main(String[] args) {
        System.out.println(RandomString.generateRandomString(10));
    }
}
