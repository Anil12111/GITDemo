package javaBasics;

public class Ifelseconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Notes: 
		 * == is the comparison operator 
		 * = assignment operator
		 */

		int a = 100;
		int b = 200;
		int c= 300;
		
		if(a>b & a>c) // false and false is false
			// if one condition is false then it is false in the and operator
			{
			System.out.println("a is greater than b and c");
				}
		else if (b>c) {
			System.out.println("b is greater than c");			
		}
		else {
			System.out.println("c is greater than a and b");	
		}

		/*
		 * if (b > a) { System.out.println("b is greater than a"); } else {
		 * 
		 * System.out.println("a is greater than b"); }
		 */
		
		if (b == a) {
			System.out.println("b is equal to a");
		} else {

			System.out.println("b is not equal to a");
		}

	}

}
