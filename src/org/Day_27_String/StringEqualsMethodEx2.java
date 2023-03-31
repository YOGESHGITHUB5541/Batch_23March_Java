package org.Day_27_String;

public class StringEqualsMethodEx2 {
	public static void main(String[] args) {
		String str1 = new String("Pune");
		String str2 = "Pune";
		String str3 = new String("Pune");
		String str4 = "Pune";
		
		String str5 = str2;
		String str6 = new String(str2);
		String str7 = str3;
		
		System.out.println(str1.equals(str5));
		System.out.println(str1.equals(str6));
		System.out.println(str1.equals(str7));
		System.out.println(str2.equals(str6));
		
		System.out.println("*************************");
		System.out.println(str2 == str6);
		System.out.println(str3 == str6);
		System.out.println(str2 == str7);
		System.out.println(str4 == str7);
	}

}
