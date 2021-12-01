package programs_Java;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n=153,sum=0,temp=0,orig=n; while(n>0) { temp=n%10;
		 * sum=sum+(temp*temp*temp); n=n/10; } if (sum == orig) {
		 * System.out.println("Number is Armstrong"); } else {
		 * System.out.println("Number is not Armstrong"); }
		 */
		int a=0,b=1, temp=0;

		System.out.println(a);///0
		System.out.println(b);//1



		for(int i=1;i<=8;i++)
		{
		  temp=a+b;    ///// 1////2
		  a=b;      /////1///////1
		  b=temp;     /////2

		System.out.println(b);//1//2

		 }
	}

}
