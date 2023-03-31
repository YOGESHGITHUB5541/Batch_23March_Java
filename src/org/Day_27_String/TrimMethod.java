package org.Day_27_String;
//trim method is used to remove all spaces between two string
public class TrimMethod {

	public static void main(String[] args) {
		String str1 = "     Hello           ";
		str1 = str1.trim();    //trim is used to remove all spaces
		String str2 = "World";
		System.out.println(str1.concat(str2));
		
//		String str1 = "Hello Word";
//	    System.out.println(str1.replaceAll("\\s", ""));
		
		

	}

}
