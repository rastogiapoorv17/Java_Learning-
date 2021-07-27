package main.string_Programs_Apoorv;

public class Count_Length_of_Each_Word_Strings_Apoorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_Words("My Name is Apoorv");

	}

	public static void count_Words(String Str) {
		char[] arr = Str.toCharArray();
		// String Str1[]= Str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String Str1 = "";
			while (i < arr.length && arr[i] != ' ')
				if (arr[i] != ' ') {
					Str1 = Str1 + arr[i];
					i++;

				}
			System.out.println(Str1.length());
		}

		/*
		 * for(int i=0;i<Str1.length;i++) { System.out.println(Str1[i].length()); }
		 */
	}
}