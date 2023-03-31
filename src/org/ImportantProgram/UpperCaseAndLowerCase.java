package org.ImportantProgram;

public class UpperCaseAndLowerCase {

	public static void main(String[] args) {
		String str = "ABcDefGh";
		int upperCase=0;
		int lowerCase =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				upperCase++;
			}
			else if (str.charAt(i)>=97 && str.charAt(i)<=122) {
				lowerCase++;
			}
		}
		System.out.println("UpperCase = "+upperCase);
		System.out.println("LowerCase = "+lowerCase);

	}

}
