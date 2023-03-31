package org.July_2nd_MockQuestion;

public class PalindromeString {

	public static void main(String[] args) {
		String str ="rever";
		int length =str.length();
		String rev="";
		for(int i=length-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is Not Palindrom");
		}
	}

}
