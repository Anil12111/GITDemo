package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		ht.put("A", "anil");
		ht.put(1, 100);
		ht.put(2, 200);

		System.out.println(ht.size());
		System.out.println(ht.get(1));

		ht.put(2, "Tom");

		Hashtable<Integer,Integer> ht1 = new Hashtable<Integer,Integer>(); // it will allow only integer values
		ht1.put(3, 100);
		//ht1.put("A","boss");

	}

}
