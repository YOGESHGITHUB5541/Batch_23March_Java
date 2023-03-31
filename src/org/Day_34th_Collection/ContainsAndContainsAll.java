package org.Day_34th_Collection;

import java.util.ArrayList;

public class ContainsAndContainsAll {
	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Delhi");
		arraylist1.add("Mumbai"); //to add value in list = it will always add it at the end
		arraylist1.add("Delhi");
		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Pune");
		arraylist2.add("Mumbai");
		
		System.out.println(arraylist2.contains("Pune"));
		System.out.println(arraylist2.containsAll(arraylist1));

	}

}
