package org.Day_34th_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSorting {
	public static void main(String[] args) {
		HashSet<String> H = new HashSet<String>();
		H.add("Pune");
		H.add("Mumbai");
		H.add("Delhi");
		
		ArrayList<String> ar = new ArrayList<String>(H);
		Collections.sort(ar);
		System.out.println(ar);
		

	}

}
