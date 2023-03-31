package org.Day_34th_Collection;

import java.util.ArrayList;

public class IsemptyIndexOfLastIndexOfMethod {
	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Delhi");
		arraylist1.add("Mumbai"); //to add value in list = it will always add it at the end
		arraylist1.add("Delhi");
		
		System.out.println(arraylist1.isEmpty());
		System.out.println(arraylist1.indexOf("Delhi"));
		System.out.println(arraylist1.lastIndexOf("Delhi"));
		
		
		

	}

}
