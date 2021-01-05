package Lavnya.String;

import java.util.LinkedHashMap;
import java.util.Map;


public class DuplicatewordsAndNumberOfOccurance_Lavnya {


    public static LinkedHashMap findDuplicateWords(String ss)
    {
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();

        String[] arr= ss.toLowerCase().split("\\s+");

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
             map.put(arr[i],1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
        map= DuplicatewordsAndNumberOfOccurance_Lavnya.findDuplicateWords("Hi there hello there hi hello test");

       for(Map.Entry entry:map.entrySet() )
       {
           if(map.get(entry.getKey())>1)
           {
               System.out.println(entry.getKey()+":"+entry.getValue());
           }
       }

    }
}
