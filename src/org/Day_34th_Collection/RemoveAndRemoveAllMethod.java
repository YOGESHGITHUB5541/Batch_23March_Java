package org.Day_34th_Collection;

import java.util.ArrayList;

public class RemoveAndRemoveAllMethod {
	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Pune");
		arraylist1.add("Delhi");
		arraylist1.add("Mumbai"); 
		arraylist1.add("Delhi");
		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Pune");
		arraylist2.add("Mumbai");
		
		arraylist1.remove("Mumbai");
		System.out.println("After remove ="+arraylist1);
		
		arraylist1.removeAll(arraylist2);
		System.out.println("After remove all ="+arraylist1);
	}

}
