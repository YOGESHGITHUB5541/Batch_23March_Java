package org.Day_34th_Collection;

import java.util.ArrayList;

public class ClearANDaddAllMethod {
	public static void main(String[] args) {
		//Replace all element one arraylist to another arraylist
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Delhi");
		ar.add("Channai");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Akola");
		ar2.add("Mumbai");
		
		//clear ar2 and add ar value in ar2
		ar2.clear();
		ar2.addAll(ar);
		System.out.println(ar);
		
		//clear ar and add ar2 value in ar
		ar.clear();
		ar.addAll(ar2);
		System.out.println(ar2);
		

	}

}
