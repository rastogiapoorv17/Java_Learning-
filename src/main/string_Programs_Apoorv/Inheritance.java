package main.string_Programs_Apoorv;

public class Inheritance {
	public static void main(String args[]) {
		
		B obj1 =new B();
		obj1.display();
		
		
	}
}
	class A {
		
		public void display()
		{
			System.out.println("Test A");
		}
	}
	
	
	class B extends A
	{
		public void display(int A)
		{
			System.out.println("Test B");
		}
	}


