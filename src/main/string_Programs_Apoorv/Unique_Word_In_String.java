package main.string_Programs_Apoorv;

public class Unique_Word_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurence("To Be Not And To Be To Is");
	}

	public static void occurence(String Str) {
		String[] arr = Str.split(" ");

		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = arr.length - 1; j > i; j--) {

				if (arr[i].equalsIgnoreCase(arr[j])) {

					count++;
					arr[j] = "";
				}

			}
			if (count == 1 && arr[i] != "") {
				System.out.println(arr[i]);

			}

		}

	}
}
