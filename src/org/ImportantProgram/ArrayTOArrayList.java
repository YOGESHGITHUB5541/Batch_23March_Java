package org.ImportantProgram;

import java.util.Arrays;
import java.util.List;
//Program Convert Array To ArrayList
public class ArrayTOArrayList {
	public static void main(String[] args) {
		String[] str = {"Vaibhav", "Sanket","Yogesh","Praful"};
		
		// Conversion of array to ArrayList
		// using Arrays.asList
		List al = Arrays.asList(str);
		
		//concat 
		String str1 = (String) al.get(0);
		String str2 = (String) al.get(1);
		String str3 = (String) al.get(2);
		String str4 = (String) al.get(3);
		
		String str5 = str1.concat(str2).concat(str3).concat(str4);
//		System.out.println(str5);
		System.out.println(al);
	}

}


