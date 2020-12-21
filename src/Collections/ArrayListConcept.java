package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Notes: 
		 * Array list is more flexible and it comes under dynamic array
		 * List inteface is using by Array list, linked list and vector
		 * you can insert any value in any index
		 * Array list is implementing list interface
		 * it can accept duplicate values
		 */

		ArrayList a = new ArrayList();
		a.add(100);
		a.add(100);
		a.add(300);

		System.out.println(a.size());
		
		a.add("Tom");
		a.add('e');
		a.add(12.3);
		System.out.println(a.size());
		
		a.remove(1);
		System.out.println(a.size());
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>(); // Array list should accept only int data type
		ar.add(100);
		//a.add("tom");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}
