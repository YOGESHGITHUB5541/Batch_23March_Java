package org.Day_27_String;

public class StringMethodEx3 {
	public static void main(String[] args) {
		String str ="There is a garden and it is beautiful.";
		String str1 ="Welcome to ";
		String str2 = "Acceleration";
		int length = str.length();
		System.out.println(length);
		
		System.out.println(str.charAt(7));
		 
		System.out.println(str.indexOf('g'));
		
		System.out.println(str.lastIndexOf('t'));
		
		System.out.println(str.contains("There"));
		
		System.out.println(str.startsWith("There"));
		
		System.out.println(str.endsWith("beautiful."));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str1.concat(str2)); //joint or combine two string
		
		
	}

}
