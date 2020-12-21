package oopsConcepts_1;

public class Class {

	// class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Class()---- This is the object of Class
		// new keyword is used to create the object
		// a,b,c --- Object Reference variables
		
		Class a = new Class();
		Class b = new Class();
		Class c = new Class();

		a.mod = 2013;
		a.wheel = 4;

		System.out.println(a.mod);
		System.out.println(b.wheel);
		System.out.println(c.wheel);
	}
}
