package oopsConcepts_1;

public class FunctionsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Notes: Functions and methods both are same once object will be created, 
		 * obj is the reference varaible refering to the object after creating the object
		 * once the object is created, copy of all the non static methods will be given to this object
		 */
			
		
		FunctionsinJava obj = new FunctionsinJava();
		obj.test();
		obj.pqr();
		
	}
	
	//non static methods
	
	public void test() {
		System.out.println("test method");
		
	}

	public int pqr() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println();
		
		return c;
	}
	
	public int xyz(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
	}
}
