package org.Day_34th_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapKeySetAndValuesMethod {
	public static void main(String[] args) {
		HashMap<Integer,String> ar = new HashMap<Integer,String>();
		ar.put(1, "Pune");
		ar.put(2, "Mumbai");
		ar.put(3, "Delhi");
		ar.put(4, "Chennai");
		
		Set<Integer> keys = ar.keySet();
		Collection<String> values = ar.values();
		
		System.out.println("****** Keys ******");
		for(Integer t : keys) {
			System.out.println(t);
		}
		
		System.out.println("****** Values ******");
		for(String t : values) {
			System.out.println(t);
		}

	}

}
