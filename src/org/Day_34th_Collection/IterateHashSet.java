package org.Day_34th_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
	//we can Iterate HashSet Using Iterator Interface
	public static void main(String[] args) {
		HashSet<String> ar= new HashSet<String>();
		ar.add("Pune");
		ar.add("Mumbai");
		ar.add("Delhi");
		
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Pune")) {
				itr.remove();
			}
		}
		System.out.println(ar);

	}

}
