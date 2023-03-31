package org.Day_27_String;
//split all string one bye one
public class SplitMethodEx1 {
	public static void main(String[] args) {
		String str= "There is a garden ";
		//s.split(" ");     //There, is, a, garden ---->array of string
		String[] str1 =str.split(" ");
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}

	}

}
