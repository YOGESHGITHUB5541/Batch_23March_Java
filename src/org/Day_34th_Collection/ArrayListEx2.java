package org.Day_34th_Collection;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		                    //only deals with object
		obj.add("Pune");    //Store multiple value
		obj.add("Mumbai");  //Duplicate data is allowed
		obj.add("Pune");    // multiple null value allowed
		obj.add(null);      //indexing is present
		obj.add(null);      //it is in ordered collection
		
		System.out.println(obj.size()); //size of array list
		
		System.out.println(obj);
		
		//System.out.println(obj.get(0)); //indexing
		
		for(int i=0; i<5; i++) {              //for loop
			System.out.println(obj.get(i));
		
		}
		System.out.println(obj.contains("Pune"));
		
	}

}
