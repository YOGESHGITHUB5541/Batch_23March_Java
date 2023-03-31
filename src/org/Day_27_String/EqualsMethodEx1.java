package org.Day_27_String;

public class EqualsMethodEx1 {
	public static void main(String[] args) {
		String str1 = new String("Pune");
		String str2 = "Pune";
		String str3 = new String("Pune");
		String str4 = "Pune";
		//equals method will compare the value of object
		System.out.println(str1.equals("Pune")); 
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str2.equals(str1));
		System.out.println(str2.equals(str3));
		System.out.println("\"==\" operator compare the memory of object");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str1);
		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		System.out.println(str3 == str1);
		System.out.println(str3 == str2);
		System.out.println(str3 == str4);
		String s = "java", s1="selenium";
		System.out.println(s);

	}

}
