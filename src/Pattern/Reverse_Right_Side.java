package Pattern;

public class Reverse_Right_Side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
