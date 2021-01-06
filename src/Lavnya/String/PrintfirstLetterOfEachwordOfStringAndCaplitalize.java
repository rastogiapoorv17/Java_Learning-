package Lavnya.String;

public class PrintfirstLetterOfEachwordOfStringAndCaplitalize {

    public static void main(String[] args) {

        String ss="hi there hello test gggg hty";

        String[] str=ss.split("\\s+");

        for (String val:str
             ) {


            System.out.print(val.substring(0,1).toUpperCase()+" ");

        }

    }
}
