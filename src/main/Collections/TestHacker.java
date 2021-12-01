package main.Collections;

public class TestHacker {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public interface Test1 {
		public void display();
		public void show();
		public void entry();
	}
	public interface Test2 {
		public void display();
		public void show();
		public void write();
	}
	public interface Test3 extends Test1,Test2{
		
	}
	
	class Test4 implements Test3{

		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void entry() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void write() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
