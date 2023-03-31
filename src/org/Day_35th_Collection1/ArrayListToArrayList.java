package org.Day_35th_Collection1;

import java.util.ArrayList;

public class ArrayListToArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(40);
		ar2.add(50);
		ar2.add(60);
		ar2.add(70);
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		ar3.add(80);
		ar3.add(90);
		ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
		ar.add(ar1);
		ar.add(ar2);
		ar.add(ar3);
		for(int i=0; i<ar.size();i++) {
		 for(int j=0;j<ar.get(i).size();j++) {
			 System.out.println("Element at position = "+i+" , "+j+" = "+ar.get(i).get(j));
			 
		 }

	}

}
}