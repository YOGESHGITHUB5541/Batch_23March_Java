package org.Day_27_String;

public class IndexOfMethod {

	public static void main(String[] args) {
		String str="There is garden and it is buetiful";
		System.out.println(str.indexOf('T')); //index of character
		
		System.out.println(str.indexOf('i', 6)); //index of char i is 6
		
		System.out.println(str.indexOf("buetiful")); //index of string is 26
		
		System.out.println(str.indexOf("and", 16)); //index of string and is 16
		
		System.out.println(str.lastIndexOf('r')); //last index of char 'r' is 11
		
		System.out.println(str.lastIndexOf("is"));//last index of string "is" 23
		
		System.out.println(str.lastIndexOf('b', 26)); //last index of char 'b' is 26
		
		System.out.println(str.lastIndexOf("it", 20)); //last index of string it is 20
		
		
		

	}

}
