package main.string_Programs_Apoorv;

public class Count_Occurence_Of_Each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurence("Not be not to not");
	}

	public static void occurence(String Str) {
		String[] arr = Str.split(" ");

		int[] count= new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			 count[i]=1;
			for (int j =  i+1; j <arr.length; j++) {
				
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count[i]++;
					arr[j]= " ";
				}

			}
			

		}

		for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]!=null && arr[i]!= " ") {
			   System.out.println("Occurence of " + arr[i] +" is " + count[i]);
			   
			   }
			  
		   }

	}

}
