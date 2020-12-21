package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Notes: 
		 * Array is to store similar data type values in a variable
		 * lowest index = 0
		 * upper bound index  = n-1
		 * System.out.println(i[4]); // ArrayIndexout of bound exception
		 * 
		 * Advantages:
		 * Array is to store similar data type values in a variable
		 * 
		 * Disadvantages:
		 * Size is fixed -- static array -- to overcome this problem -- use collections-- Array list,Hashtable...dynamic array
		 * stores similar data types -- to over come this problem...use object array
		 * Object array is used to store different data types variable
		 */
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 11;
		i[2] = 12;
		i[3] = 13;
		
		System.out.println(i[3]);// 13
		System.out.println(i.length); // length/size of the array
		
		//all the values of array
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		
		// Object Array : (Object is a class)
		
		Object ob[] = new Object[4];
		ob[0] = "Tom";
		ob[1] = 1;
		ob[2] = 23.05;
		ob[3] = 'M';
		
		System.out.println(ob[2]);
		
				

	}

}
