package org.Day_27_StringHomework;

public class StringPalindrom {

	public static void main(String[] args) {
		String str= "refer";
		int length = str.length();
		String str1="";
		
		for(int i=length-1; i>=0; i--) {
			str1=str1+str.charAt(i);	
		}
		if(str.equals(str1)) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not Palindrom");
		}
	}

}




