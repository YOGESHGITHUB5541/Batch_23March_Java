package org.Day_27_StringHomework;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str="Good morning , have a nice day";
		String rev="";
		
		String[] ar = str.split(" ");
		
		for(int i =ar.length-1;i>=0;i--) {
			rev = rev+" "+ar[i];
		}
		
		System.out.println(rev);
	}

}














