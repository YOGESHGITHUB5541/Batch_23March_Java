package org.Day_27_String;

public class StringReplaceAllEx6 {
	public static void main(String[] args) {
		String str1 ="ABCD$# 2345, sdgrt, 45876 ,sfvc ,234567";
		String str2 ="TCID123232_12/5/2022_8:49";
	    String str3 = "vaibhav chore";
		
		System.out.println(str2.replaceAll("/", "").replaceFirst(":", "_"));
		
		//replace all with different regex(regular expression)
		System.out.println(str1.replaceAll("\\d", "*")); //replace Digit no only
		System.out.println(str1.replaceAll("\\D", "*")); //replace non Digit
		System.out.println(str1.replaceAll("\\s", "*")); //replace spaces only
		System.out.println(str1.replaceAll("\\p{Upper}", "*")); //replace Upper letter
		System.out.println(str1.replaceAll("\\p{Lower}", "*")); //replace Lower Case Letter
		System.out.println(str1.replaceAll("\\p{Punct}","*"));
		
		System.out.println(str3.replaceAll("\\s",""));
	}

}
