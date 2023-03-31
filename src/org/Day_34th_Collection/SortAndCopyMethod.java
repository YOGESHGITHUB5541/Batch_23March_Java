package org.Day_34th_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndCopyMethod {
	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Delhi");
		arraylist1.add("Mumbai");
		arraylist1.add("Pune");
	
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Hi");
		arraylist2.add("Bye");
		
		System.out.println("Before Sorting ="+arraylist1);
		Collections.sort(arraylist1);
		System.out.println("After Sorting ="+arraylist1);
		
		Collections.sort(arraylist1,Collections.reverseOrder());
		System.out.println("After reverse sorting ="+arraylist1);
		
		Collections.copy(arraylist1, arraylist2);
		System.out.println("After copying ="+arraylist1);
			

	}

}
