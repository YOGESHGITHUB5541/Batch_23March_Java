package org.Day_34th_Collection;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Pune");
		arraylist.add("Mumbai");
		arraylist.add("Delhi");
		arraylist.add(0, "Delhi");;
		//arraylist.set(1, "Chennai");
		
		System.out.println(arraylist);
		System.out.println(arraylist.isEmpty());
		System.out.println(arraylist.indexOf("Delhi"));
		System.out.println(arraylist.lastIndexOf("Mumbai"));
		
		System.out.println("Before remove ="+arraylist);
		arraylist.remove(2);
		System.out.println("After remove ="+arraylist);
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Delhi");
		
		arraylist.removeAll(arraylist1);
		System.out.println("After remove all ="+arraylist);
	
		

	}

}
