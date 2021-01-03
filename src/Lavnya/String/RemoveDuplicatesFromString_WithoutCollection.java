package Lavnya.String;

public class RemoveDuplicatesFromString_WithoutCollection {

    public static String removeDuplicates(String str) {

        char[] arr = str.toLowerCase().toCharArray();
        String newStr = "";
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count <= 0) {
                newStr = newStr + arr[i];

            }

        }

        return newStr;
    }

    public static void main(String[] args) {
        String ss = RemoveDuplicatesFromString_WithoutCollection.removeDuplicates("HellowE");
        System.out.println(ss);
    }
}
