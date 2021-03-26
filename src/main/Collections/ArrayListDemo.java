package main.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr= new ArrayList<>();
		
		arr.add("Apoorv");
		arr.add("Lavnnya");
		arr.add("Mayank");
		arr.add("Ankit");
		arr.add("Anubhav");
		arr.add("Sandeep");
		
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ArrayList<String> arr2= new ArrayList<>();
		arr2.addAll(arr);
       Iterator<String> it1 = arr2.iterator();
		
		while(it1.hasNext())
		{
			System.out.println("array2 is " +it1.next());
		}
	}
	

}
