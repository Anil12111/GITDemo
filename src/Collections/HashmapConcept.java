package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * // Notes: 
		 * Difference between hashmap and hashtable?
		 * 1. hashmap is not synchronized and not thread safe where as hashtable is synchronized and thread safe
		 * Thread safe means, hashtable will allow only one thread at a time but where as hashmap will allow more threads
		 * 
		 * 2. hashmap will allow null values where as hashtable will not allow 
		 * 3. Hashmap object values iterated by using iterator and hash table is the only class other than vector which 
		 * uses enumerator to iterate the values in the HashTable object.
		 */
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Hello");
		hm.put(2,"Good");
		hm.put(3,"Morning");
		hm.put(4,"Evening");
		
		System.out.println(hm.get(3));
		
		Set sn = hm.entrySet(); // make all the key value pairs in a set
		
		Iterator it= sn.iterator();
		while(it.hasNext()) {
			
		Map.Entry mp= (Map.Entry) it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
			
	
		}
		
		

	}

}
