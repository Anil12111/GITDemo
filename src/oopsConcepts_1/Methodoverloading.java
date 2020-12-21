package oopsConcepts_1;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Notes: 
		 * same Method name is same with different number of arguments and different data types with in the same class
		 * you can create a duplicate methods and can not create a method inside another method
		 * you can overload  main method also
		 */
		
		Methodoverloading obj = new Methodoverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(1, 2);
		
	}
	
	public void sum() {
		System.out.println("with out parameters");
		
	}

	public void sum(int i) {
		System.out.println("1 parameters");
		System.out.println(i);
	}
	
	public void sum(int i,int j) {
		System.out.println("2 parameters");
		System.out.println(i+j);
	}
	
}


