package org.Day_34th_Collection;

import java.util.ArrayList;

public class RetainAllMethod {
	//by using 
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList();
		ar.add("Delhi");
		ar.add("Pune");
		
		ArrayList<String> ar1 = new ArrayList();
		ar1.add("Pune");
		ar1.add("Mumbai");
		
		ar.retainAll(ar1);
		System.out.println(ar);

	}

}
