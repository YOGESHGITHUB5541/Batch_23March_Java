package org.Day_34th_Collection;

import java.util.HashSet;

public class HashSetForEachLoop {
	public static void main(String[] args) {
		HashSet<String> ar = new HashSet<String>();
		ar.add("Pune");
		ar.add("Mumbai");
		ar.add("Delhi");
		 for(String str: ar) {
			 System.out.println(str);
		 }

	}

}

