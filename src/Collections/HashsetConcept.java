package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Notes: 
		 * Hashset,Treeset,linkedhashset implements set interface 
		 * it will not allow duplicate values
		 * There is no gurantee that elements stored in a sequence order
		 * Traverse the elements in a set using iterator
		 */

		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("India");
		hs.add("SG");

		System.out.println(hs);
		
		//System.out.println(hs.remove("India"));
		hs.isEmpty();
		hs.size();

		// Iterate the elements in the set

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
