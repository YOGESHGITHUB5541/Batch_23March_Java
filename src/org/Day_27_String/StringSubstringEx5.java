package org.Day_27_String;
//use of substring methods
public class StringSubstringEx5 {
	public static void main(String[] args) {
		String str ="There , is a, garden";
		
		System.out.println(str.substring(9));   //starting index
		System.out.println(str.substring(16));
		
		System.out.println(str.substring(0, 10)); //starting index ,ending index is exclude
		System.out.println(str.subSequence(4, 14));
		
		String str2 = "There is a garden";
		System.out.println(str2.substring(6));
		
		
		
	}

}
