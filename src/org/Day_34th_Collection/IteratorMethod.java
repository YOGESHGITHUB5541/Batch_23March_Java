package org.Day_34th_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorMethod {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Pune");
		ar.add("Mumbai");
		ar.add("Delhi");
		
		ListIterator<String> itr = ar.listIterator();
		System.out.println(itr.next());
		System.out.println(itr.previous());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasPrevious());
	
		

	}

}
