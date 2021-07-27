package programs_Java;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 152, sum = 0, temp = 0, orig = n;

		while (n != 0) {
			temp = n % 10;
			sum = sum * 10 + temp;
			n = n / 10;
		}
		if (sum == orig) {
			System.out.println("Number is plainedrome");
		} else {
			System.out.println("Number is not plainedrome");
		}
	}

}
