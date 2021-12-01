package main.string_Programs_Apoorv;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Hello"+ (10+20));
		 * 
		 * String Str1="Apoorv"; String Str2="Apoorv";
		 * 
		 * System.out.println(Str1.equals(Str2)); System.out.println(Str1==Str2);
		 */
		Testb obj= new Testb();
		obj.setA(2);
		obj.setB(6);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		
	}
}
	 class Testb
	{
		private int a;
		int b;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
	}


