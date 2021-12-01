package main.string_Programs_Apoorv;

public class Inheritance {
	public static void main(String args[]) {
		
		B obj1 =new B();
		obj1.display(3);
		
		
	}
}
	class A {
		
		public void display(int i)
		{
			System.out.println("Test A");
		}
	}
	
	
	class B extends A
	{
		
		public void display(int i)
		{
			super.display(i);
			System.out.println("Test B");
		}
	}


