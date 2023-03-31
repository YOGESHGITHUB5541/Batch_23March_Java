package org.Day_27_String;
//replace methods
public class StringReplaceMethodEx4 {
	public static void main(String[] args) {
		String str ="There is a is garden and it is beautiful.";
		
		System.out.println(str.replace('i', 'z'));
		
		System.out.println(str.replace("is", "was"));
		
		System.out.println(str.replaceAll(" ", " AAA "));
		
		System.out.println(str.replaceFirst("is", "was"));
		
		System.out.println(str.replace('e', '*'));
		
	

	}

}
