package org.ImportantProgram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		isAnagram("Keep","Peek");
		isAnagram("Mother In Law", "Hitler Woman");

	}
	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", ""); //motherinlaw
		String s2 = str2.replaceAll("\\s", ""); //hitlerwoman
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		}else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray(); //m,o,t,h,e,r,i,n,l,a,w
			char[] ArrayS2 = s2.toLowerCase().toCharArray(); //h,i,t,l,e,r,w,o,m,a,n,
			Arrays.sort(ArrayS1);   //a,e,h,i,l,m,n,o,r,t,w
			Arrays.sort(ArrayS2);	//a,e,h,i,l,m,n,o,r,t,w
			
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status) {
			System.out.println(" are anagrams = "+ s1 + " and " + s2);
		}else {
			System.out.println(" are not anagrams = "+ s1 + " and " + s2);
		}
		
	}
}
