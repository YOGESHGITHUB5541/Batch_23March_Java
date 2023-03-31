package org.Day_34th_Collection;

import java.util.ArrayList;


public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();    //for specific type
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		ArrayList<Float> obj2 = new ArrayList<Float>();
		ArrayList<Character> obj3 = new ArrayList<Character>();
		ArrayList<Double> obj4 = new ArrayList<Double>();
		
		ArrayList obj5 =new ArrayList();    //generic - any type of object
		ArrayList<Object> obj6 = new ArrayList<Object>(); //generic arraylist- any type of object
		obj.add("vaibhav");
		obj6.add("pune");
		Integer i =10;
		obj6.add(10);
		obj6.add(i);
		obj6.add(55.6f);
		obj6.add('C');
		obj6.add(true);
		
		
		
		

	}

}
