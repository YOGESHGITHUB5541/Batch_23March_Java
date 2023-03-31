package org.Day_34th_Collection;

import java.util.HashSet;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<Integer> H = new HashSet<Integer>();
		H.add(10);    //Unordered Collection
		H.add(20);    //Data store randomly.no indexing is provided
		H.add(30);    //only one null value is allowed
		H.add(null);  //no duplicate value allowed
		H.add(null);  //it implement set interface
		H.add(40);
		H.add(40);
		System.out.println(H);
		System.out.println(H.size());
		

	}

}
