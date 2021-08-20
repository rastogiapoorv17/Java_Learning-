package Lavnya.String;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_String_without_collection {


    public String findDuplicate(String str) {

        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        String newStr = "";

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {


                if (arr[i] == arr[j]) {
                    newStr = newStr + arr[i];

                }
            }

        }


        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Duplicate_String_without_collection dup= new Duplicate_String_without_collection();
        System.out.println((dup.findDuplicate(sc.nextLine())));

    }
}
