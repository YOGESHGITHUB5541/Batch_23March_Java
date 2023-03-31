package org.Day_34th_Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMApIntoTreeMAp {
	public static void main(String[] args) {
		HashMap<Integer,String> ar = new HashMap<Integer,String>();	
		ar.put(1, "Pune");
		ar.put(5, "Mumbai");
		ar.put(10 , "Delhi");
		ar.put(4, "Chennai");
		
		TreeMap<Integer,String> tr = new TreeMap<Integer,String>(ar);
		System.out.println(tr);
		

	}

}
