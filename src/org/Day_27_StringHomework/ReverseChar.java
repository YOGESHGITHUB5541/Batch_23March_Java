package org.Day_27_StringHomework;

public class ReverseChar {

	public static void main(String[] args) {
		String str="good morning, have a nice day";
        int len=str.length();
		for(int i =len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}