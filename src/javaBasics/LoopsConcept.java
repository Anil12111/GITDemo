package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Notes: 
		 * while is a keyword and always keywords starts with small letter
		 * disadvantage of while loop is if we don't give the increment condition 
		 * it will  create infinite loop
		 * 
		 * 
		 */
		
		int i = 0; // initialization
		while (i < 10) // condition 
			{
			System.out.println("True");
			i=i+1; // Increment/decremental part
		}
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	}

}
