package org.Day_27_String;

public class SplitMethodEx2 {
	public static void main(String[] args) {
		String str= "There is a garden ";
		
		String[] str1 =str.split(" ",2);
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}

	}

}
