package org.Day_34th_Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetIntoTreeSet {
	public static void main(String[] args) {
		HashSet<String> H = new HashSet<String>();
		H.add("Pune");
		H.add("Mumbai");
		H.add("Delhi");
		
		TreeSet<String> ar = new TreeSet<String>(H);
		
		System.out.println(ar);
		


	}

}
