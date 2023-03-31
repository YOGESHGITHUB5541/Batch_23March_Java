package org.Day_34th_Collection;

import java.util.ArrayList;

public class AddandSetMethod {
	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Mumbai");
		arraylist1.add("Delhi"); //to add value in list= it will always add it at the end
		System.out.println("Before add at specific index and set method ="+arraylist1);
		
		arraylist1.add(0, "Chennai"); //to add value at specific index
		arraylist1.set(1, "MumbaiUpdate"); //updating value at specific index
		
		System.out.println("After add specific index and set method ="+arraylist1);
		

	}

}
