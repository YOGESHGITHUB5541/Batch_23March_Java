package org.ImportantProgram;

public class SpecialCharAndFindName {

	public static void main(String[] args) {
		String str = "Vaibhav123";
		char[] chars = str.toCharArray();
		for(char c:chars) {
			if(Character.isLetter(c)) {
				System.out.print(c);
			}
		}
	}
}
