package org.Day_34th_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DisjointMethod {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Pune");
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Pune");
		ar1.add("Mumbai");
		ar1.add("Delhi");
		
		//return false if two arraylist contains common value
		System.out.println(Collections.disjoint(ar, ar1));
		
		

	}

}
