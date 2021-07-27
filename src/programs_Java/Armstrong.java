package programs_Java;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=153,sum=0,temp=0,orig=n;
     while(n>0) {
    	 temp=n%10;
    	 sum=sum+(temp*temp*temp);
    	 n=n/10;
     }
     if (sum == orig) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

}
