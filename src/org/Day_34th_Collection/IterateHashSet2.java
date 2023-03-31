package org.Day_34th_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet2 {
	//we can Iterate HashSet Using Iterator Interface
	public static void main(String[] args) {
		HashSet<Integer> ar= new HashSet<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		Iterator<Integer> itr = ar.iterator();
		Integer i = itr.next();
		System.out.println(i);
		System.out.println(itr.next());
		System.out.println(itr.next());
	}

}
