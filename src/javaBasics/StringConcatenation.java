package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		
		/* Notes:
		 * + is a concatenation operator
		 * concatenation always starts from left side 
		 * Difference between Print and println - 
		 * Println - is used to print on the console with a new line
		 * Print  - is just used to print on the console
		 * 
		 */
		
		int a=100;
		int b=200;
		
		String x = "hello";
		String y = "world";
		
		System.out.println(a+b+x+y); //300helloworld
		System.out.println(x+y+a+b); //helloworld100200 --- This is very important interview question
		
		// -- always you have to start from left side 
		
		System.out.println(x+y+(a+b));// helloworld300

		
		

	}

}
