package javaBasics;

public class IncrementandDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Notes: 
		 * In post increment
		 * first assign the value to variable (b=a++, first assign the a variable value to b 
		 * and then increment value of a)
		 * In Pre increment
		 * first increase the value then assign it to variable                                           
		 * 
		 */
		
		int a=10;
		int b=a++; // post increment
		
		System.out.println(a);//11
		System.out.println(b);//10
		
		int a1=10;
		int b1=++a1; // pre increment
		
		System.out.println(a1);//11
		System.out.println(b1);//11
		

	}

}
